public class Subject {
    private String name;
    private String teacherName;
    private int totalVideos;
    private ProgressInfo progressInfo = new ProgressInfo();

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getTeacherName() {
        return this.teacherName;
    }

    void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    int getTotalVideos() {
        return this.totalVideos;
    }

    void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }

    ProgressInfo getProgressInfo() {
        return this.progressInfo;
    }

    void setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo.setTotalVideosWatched(progressInfo.getTotalVideosWatched());
        this.progressInfo.setLastVideoWatched(progressInfo.getLastVideoWatched());
    }
}
