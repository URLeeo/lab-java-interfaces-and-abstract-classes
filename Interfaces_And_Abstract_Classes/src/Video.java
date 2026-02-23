public abstract class Video {
    private final String title;
    private final int duration;

    protected Video(String title, int duration) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title is required");
        if (duration <= 0) throw new IllegalArgumentException("duration must be positive");
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }

    public String getInfo() {
        return String.format("Title: %s | Duration: %d min", title, duration);
    }
}