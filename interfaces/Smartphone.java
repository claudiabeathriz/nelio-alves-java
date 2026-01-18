public record Smartphone() implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("Smarthphone is playing music.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smarthphone is pausing music.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smarthphone is stoping music.");
    }

    @Override
    public void playVideo() {
        System.out.println("Smarthphone is playing video.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smarthphone is pausing video.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smarthphone is stoping video.");
    }
}
