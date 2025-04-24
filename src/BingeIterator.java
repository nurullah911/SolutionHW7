import java.util.List;
import java.util.NoSuchElementException;

public class BingeIterator implements EpisodeIterator {
    private final List<Season> seasons;
    private int currentSeason = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(Series series) {
        this.seasons = series.getSeasons();
        if (!seasons.isEmpty()) {
            currentIterator = new SeasonIterator(seasons.get(0));
        }
    }

    @Override
    public boolean hasNext() {
        if (currentIterator == null) return false;
        if (currentIterator.hasNext()) return true;
        currentSeason++;
        while (currentSeason < seasons.size()) {
            currentIterator = new SeasonIterator(seasons.get(currentSeason));
            if (currentIterator.hasNext()) return true;
            currentSeason++;
        }
        return false;
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return currentIterator.next();
    }
}