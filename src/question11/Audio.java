package question11;

public class Audio extends Media{

    private double loudness;

    public Audio(String name, double duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return "Audio{" +
                super.toString() +
                ", loudness=" + loudness +
                '}';
    }
}
