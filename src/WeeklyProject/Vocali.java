package WeeklyProject;

public class Vocali extends MediaPlayer{
    private String titolo = "Solito audio di quello che non sta mai zitto/a";
    public Vocali(String titolo, MediaFormat mediaFormat) {
        this.titolo = titolo;
        this.mediaFormat = MediaFormat.VOCALI;
    }
}
