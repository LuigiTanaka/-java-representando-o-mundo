public class App {
    public static void main(String[] args) throws Exception {
        Subject calculoI = new Subject();
        calculoI.setName("Calculo I");
        calculoI.setTeacherName("Possani");
        calculoI.setTotalVideos(23);

        ProgressInfo progressInfo = calculoI.getProgressInfo();
        progressInfo.setTotalVideosWatched(11);

        Video lasVideoWatched = progressInfo.getLastVideoWatched();
        lasVideoWatched.setTitle("Teorema de L'Hopital");
        lasVideoWatched.setDuration(26780);
        lasVideoWatched.setStoppedTime(12043);

        progressInfo.setLastVideoWatched(lasVideoWatched);

        calculoI.setProgressInfo(progressInfo);

        System.out.println(calculoI.getProgressInfo().getLastVideoWatched().getDuration());
    }
}
