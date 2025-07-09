package Chapter_2_;

public class exercise_2b {
    public static void main(String[] args) {
        Episode episode= new Episode();
        episode.seriesNumber= 1;
        episode.episodeNumber=5;
        episode.play();
        episode.skipIntro();


    }
}
class Episode{
    int seriesNumber;
    int episodeNumber;
    void skipIntro(){
        System.out.println("Skipping Intro.......");
    }
    void play(){
        System.out.println("Playing :"+ seriesNumber + " Episode Number "+ episodeNumber);
    }
    void skiptoNext(){
        System.out.println("Loading Next episode..............");
    }
}