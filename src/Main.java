public class Main {
    public static void main(String[] args) {
        // Setup seasons and episodes
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1", 1800));
        season1.addEpisode(new Episode("S1E2", 1900));
        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1", 2000));

        Series series = new Series();
        series.addSeason(season1);
        series.addSeason(season2);

        System.out.println("Normal order:");
        EpisodeIterator normal = new SeasonIterator(season1);
        while (normal.hasNext()) {
            System.out.println(normal.next().getTitle());
        }

        System.out.println("\nReverse order:");
        EpisodeIterator reverse = new ReverseSeasonIterator(season1);
        while (reverse.hasNext()) {
            System.out.println(reverse.next().getTitle());
        }

        System.out.println("\nShuffle order:");
        EpisodeIterator shuffle = new ShuffleSeasonIterator(season1, 42L);
        while (shuffle.hasNext()) {
            System.out.println(shuffle.next().getTitle());
        }

        System.out.println("\nFor-each (Iterable):");
        for (Episode e : season1) {
            System.out.println(e.getTitle());
        }

        System.out.println("\nBinge mode:");
        EpisodeIterator binge = new BingeIterator(series);
        while (binge.hasNext()) {
            System.out.println(binge.next().getTitle());
        }
    }
}