package michael.exam.apcsa13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo> ();
    }
    
    public List<DownloadInfo> getDownloadList() {
        return downloadList;
    }
    
    public DownloadInfo getDownloadInfo(String title) {
        for (int i = 0; i < downloadList.size(); i++) {
            if (title.equals(downloadList.get(i).getTitle())) {
                return downloadList.get(i);
            }
        }
        return null;
    }
    
    public void updateDownloads(List<String> titles) {
        for (int i = 0; i < titles.size(); i++) {
            DownloadInfo info = getDownloadInfo(titles.get(i));
            if (info != null) {
                info.incrementTimesDownloaded();
            }
            else {
                downloadList.add(new DownloadInfo(titles.get(i)));                
            }
        }
    }
}
