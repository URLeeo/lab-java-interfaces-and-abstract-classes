public final class Movie extends Video {
    private final double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        if (rating < 0.0 || rating > 10.0) throw new IllegalArgumentException("rating must be between 0 and 10");
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | Rating: %.1f", rating);
    }
}