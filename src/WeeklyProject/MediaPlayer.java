package WeeklyProject;

public class MediaPlayer {
    private String titolo;
    MediaFormat mediaFormat;

    static double Durata = 60.20;

    public MediaPlayer(String titolo, MediaFormat mediaFormat) {
        this.titolo = titolo;
        this.mediaFormat = mediaFormat;
    }

    public MediaPlayer() {
    }

    public void play() {
        System.out.println("Play" + titolo + "." + mediaFormat);
    }

    public static void main(String[] args) {
        MediaPlayer playerVocale = new MediaPlayer("questo è un format ", MediaFormat.VOCALI);
        playerVocale.play();
        System.out.println("Durata: " + Durata + " seconds");

        MediaPlayer playerImmagine = new MediaPlayer("questo è un format", MediaFormat.IMMAGINE);
        playerImmagine.play();
        System.out.println("Questo è un img, non ha una durata");

        MediaPlayer playerVideo = new MediaPlayer("questo è un format", MediaFormat.VIDEO);
        playerVideo.play();
        System.out.println("Durata: " + Durata + " secondi");
    }
}
