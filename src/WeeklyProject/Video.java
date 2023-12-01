package WeeklyProject;

public class Video extends MediaPlayer {
    private static final double durata = 30.0;

    public Video(String titolo) {
        super(titolo, MediaFormat.VIDEO);


    }
    @Override
    public double getDurata() {
        return durata;
    }
    @Override
    public int getVolume() {
        return super.getVolume();
    }
}

