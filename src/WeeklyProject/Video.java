package WeeklyProject;

public class Video extends MediaPlayer{
    private String titolo = "impara java in una lezione";
    public Video(String titolo, MediaFormat mediaFormat) {
       this.titolo = titolo;
       this.mediaFormat = MediaFormat.VIDEO;
    }
}
