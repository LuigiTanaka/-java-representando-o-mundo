public class Video {
    private String title;
    private int duration;     //seconds
    private int stoppedTime;  //seconds

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getDuration() {
        return this.duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    int getStoppedTime() {
        return this.stoppedTime;
    }

    void setStoppedTime(int stoppedTime) {
        this.stoppedTime = stoppedTime;
    }
}
