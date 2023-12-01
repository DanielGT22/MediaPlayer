package WeeklyProject;

public class Immagini extends MediaPlayer {
    private String titolo = "impara java in una lezione";
    public Immagini(String titolo, MediaFormat mediaFormat) {
        this.titolo = titolo;
        this.mediaFormat = MediaFormat.IMMAGINE;
    }
}
