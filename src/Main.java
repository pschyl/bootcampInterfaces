public class Main {
    public static void main(String[] args) {

        MusicPlayer musicPlayer1 = new MusicPlayer();
        VideoPlayer videoPlayer1 = new VideoPlayer();


        MediaController controller1 = new MediaController();

        controller1.playMedia(musicPlayer1);
        controller1.playMedia(videoPlayer1);
    }
}