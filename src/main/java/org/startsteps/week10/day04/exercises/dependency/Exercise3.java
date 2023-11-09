package org.startsteps.week10.day04.exercises.dependency;

public class Exercise3 {
    public static void main(String[] args) {
        MusicSource cd = new CD("CD Music Track");
        MusicSource usb = new USB("USB Music Track");
        MusicSource streamingService = new StreamingService("Streaming Music Track");

        MusicPlayer player = new MusicPlayer();
        player.playMusic(cd);
        player.playMusic(usb);
        player.playMusic(streamingService);
    }
}

interface MusicSource {
    String getMusic();
}

class CD implements MusicSource {
    private String musicContent;

    public CD(String musicContent) {
        this.musicContent = musicContent;
    }

    @Override
    public String getMusic() {
        return musicContent;
    }
}

class USB implements MusicSource {
    private String musicContent;

    public USB(String musicContent) {
        this.musicContent = musicContent;
    }

    @Override
    public String getMusic() {
        return musicContent;
    }
}

class StreamingService implements MusicSource {
    private String musicContent;

    public StreamingService(String musicContent) {
        this.musicContent = musicContent;
    }

    @Override
    public String getMusic() {
        return musicContent;
    }
}

class MusicPlayer {
    public void playMusic(MusicSource musicSource) {
        System.out.println("Playing: " + musicSource.getMusic());
    }
}
