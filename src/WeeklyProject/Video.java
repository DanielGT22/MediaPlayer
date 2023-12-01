package WeeklyProject;

public class Video extends MediaPlayer {
    private static final double durata = 30.0;
    private int volume = 7;
    public Video(String titolo) {
        super(titolo, MediaFormat.VIDEO, durata, 7);



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

