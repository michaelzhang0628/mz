package michael.exam.apcsa13;

public class DownloadInfo {
    private String title;
    private int timesDownloaded = 1;
    
    public int getTimesDownloaded() {
        return timesDownloaded;
    }

    public DownloadInfo(String title) {
        this.title = title;
    }
    
    public DownloadInfo(String title, int downloaded) {
        this.title = title;
        this.timesDownloaded = downloaded;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void incrementTimesDownloaded() {
        timesDownloaded++;
    }
}
