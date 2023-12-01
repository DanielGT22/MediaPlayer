package WeeklyProject;

public class MediaPlayer {
    private double durata;
    private String titolo;
    private int volume;
    private int lumi;
    MediaFormat mediaFormat;


    public MediaPlayer(String titolo, MediaFormat mediaFormat,double durata, int volume) {
        this.titolo = titolo;
        this.mediaFormat = mediaFormat;
        this.volume = volume;
        this.durata = durata;
    }

    public MediaPlayer(String titolo, MediaFormat mediaFormat, int lumi) {
        this.titolo = titolo;
        this.mediaFormat = mediaFormat;
        this.lumi = lumi;

    }


    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Abbasso a: " + volume);
        } else {
            System.out.println("Volume è già al minimo");
        }
    }

    public void alzaLum() {

        if (lumi < 10) {
            lumi++;
            System.out.println( lumi);
        } else {
            System.out.println("Max lumi");
        }

    }
    public void abbassaLum() {
        if (lumi > 0) {
            lumi--;
            System.out.println("Abbasso a: " + lumi);
        } else {
            System.out.println("lumi è già al minimo");
        }
    }

    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Alzo a: " + volume);
        } else {
            System.out.println("Volume è già al massimmo");
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
            System.out.println("Luminosità:");
            for (int i = 0; i < lumi ; i++) {
                for (int z = 0; z <= i; z++) {
                    System.out.print("*");
                }System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        MediaPlayer playerVocale = new MediaPlayer("Questo è un audio", MediaFormat.VOCALI, 20, 9);
        playerVocale.play();
        playerVocale.alzaVolume();
        playerVocale.alzaVolume();
        playerVocale.abbassaVolume();
        MediaPlayer playerImmagine = new MediaPlayer("Questo è un img", MediaFormat.IMMAGINE, 7);
        playerImmagine.play();

        MediaPlayer playerVideo = new MediaPlayer("questo è un video", MediaFormat.VIDEO, 50, 4);
        playerVideo.play();
        System.out.println("------------------------------------");
        playerVideo.abbassaVolume();
        playerVideo.alzaVolume();
        playerVideo.alzaVolume();
    }

}
