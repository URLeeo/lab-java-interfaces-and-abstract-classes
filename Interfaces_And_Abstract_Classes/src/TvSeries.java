public final class TvSeries extends Video {
    private final int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        if (episodes <= 0) throw new IllegalArgumentException("episodes must be positive");
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | Episodes: %d", episodes);
    }
}