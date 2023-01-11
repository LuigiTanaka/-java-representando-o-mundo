public class ProgressInfo {
    private int totalVideosWatched; 
    private Video lastVideoWatched = new Video();
    
    void incrementVideos() {
        this.totalVideosWatched += 1;
    }

    int getTotalVideosWatched() {
        return this.totalVideosWatched;
    }

    void setTotalVideosWatched(int totalVideosWatched) {
        this.totalVideosWatched = totalVideosWatched;
    }

    Video getLastVideoWatched() {
        return this.lastVideoWatched;
    }

    void setLastVideoWatched(Video video) {
        this.lastVideoWatched.setTitle(video.getTitle());
        this.lastVideoWatched.setDuration(video.getDuration());
        this.lastVideoWatched.setStoppedTime(video.getStoppedTime());
    }
}
