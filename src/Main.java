public class Main {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1", 1800));
        season1.addEpisode(new Episode("S1E2", 1900));
        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1", 2000));

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
    }
}