import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private List<Episode> episodes;
    private int position = 0;

    public ShuffleSeasonIterator(Season season, long seed) {
        this.episodes = new ArrayList<>(season.getEpisodes());
        Collections.shuffle(this.episodes, new Random(seed));
    }

    @Override
    public boolean hasNext() {
        return position < episodes.size();
    }

    @Override
    public Episode next() {
        return episodes.get(position++);
    }
}