package WeeklyProject;

public class MediaPlayer {
    private double durata;
    private String titolo;
    private int volume;
    MediaFormat mediaFormat;


    public MediaPlayer(String titolo, MediaFormat mediaFormat,double durata, int volume) {
        this.titolo = titolo;
        this.mediaFormat = mediaFormat;
        this.volume = volume;
        this.durata = durata;
    }

    public MediaPlayer(String titolo, MediaFormat mediaFormat) {
        this.titolo = titolo;
        this.mediaFormat = mediaFormat;

    }


    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Abbasso a: " + volume);
        } else {
            System.out.println("Volume is already at 0");
        }
    }

    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Alzo a: " + volume);
        } else {
            System.out.println("Volume is already at 10");
        }
    }


    public int getVolume() {
        return volume;
    }

    public double getDurata() {
        return durata;
    }
    //non so perchè entro sempre nel default e non uso la durata fornita nelle classi
    // idem per il volume
    public void play() {
        System.out.println("Playing: " + titolo + ". Format: " + mediaFormat);
        if (mediaFormat == MediaFormat.VIDEO || mediaFormat == MediaFormat.VOCALI) {
            System.out.println("Durata " + this.getDurata() + " secondi");
            System.out.println("Volume: " + getVolume() );
        } else {
            System.out.println("Immagini sono eterne.");
        }
    }

    public static void main(String[] args) {
        MediaPlayer playerVocale = new MediaPlayer("Questo è un audio", MediaFormat.VOCALI, 20, 7);
        playerVocale.play();

        MediaPlayer playerImmagine = new MediaPlayer("Questo è un img", MediaFormat.IMMAGINE);
        playerImmagine.play();

        MediaPlayer playerVideo = new MediaPlayer("questo è un video", MediaFormat.VIDEO, 50, 4);
        playerVideo.play();
        System.out.println("------------------------------------");
        playerVideo.abbassaVolume();
        playerVideo.alzaVolume();
        playerVideo.alzaVolume();
    }
    
}
