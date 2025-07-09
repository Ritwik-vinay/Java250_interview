package Chapter_2_;

import java.util.stream.Stream;

public class exercise2a {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.artist="The Beatles";
        song.title="Come Together";
        song.duration=300;
        song.play();
        song.printDetails();

    }
}
class StreamingSong{
    String title;
    String artist;
    int duration;
    void play(){
        System.out.println("Playing Song");
    }
    void  printDetails(){
        System.out.println("This is "+ title + " by " + artist +" and the duration is "+ duration +" sec");
    }
}
