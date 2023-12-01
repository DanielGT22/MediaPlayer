package WeeklyProject;

public class Vocali extends MediaPlayer {
    private static final double durata = 120.0;
    private int volume;
    public Vocali(String titolo) {
        super(titolo, MediaFormat.VOCALI);
        this.volume = 2;
    }
    @Override
    public double getDurata() {
        return durata;
    }
    @Override
    public int getVolume() {
        return volume;
    }
}

