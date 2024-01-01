package michael.exam.apcsa13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MusicDownloadsTest {
    
    private MusicDownloads setupTestData() {
        MusicDownloads data = new MusicDownloads();
        DownloadInfo m = new DownloadInfo("Hey Jude", 5);
        data.getDownloadList().add(m);
        DownloadInfo i = new DownloadInfo("Soul Sister", 3);
        data.getDownloadList().add(i);
        DownloadInfo a = new DownloadInfo("Aqualung", 10);
        data.getDownloadList().add(a);
        DownloadInfo x = new DownloadInfo("Default");
        data.getDownloadList().add(x);
        return data;
    }

    @Test
    void testGetDownloadInfo() {
        MusicDownloads webMusicA = setupTestData();
        assertNull(webMusicA.getDownloadInfo("Soul Brother"));
        assertEquals(3, webMusicA.getDownloadInfo("Soul Sister").getTimesDownloaded());
        assertEquals(10, webMusicA.getDownloadInfo("Aqualung").getTimesDownloaded());
        assertEquals(1, webMusicA.getDownloadInfo("Default").getTimesDownloaded());      
    }
    
    @Test
    void testUpdateDownloads() {
        MusicDownloads webMusicA = setupTestData();
        List<String> songTitles = new ArrayList<String> (); 
        songTitles.add("Lights");
        songTitles.add("Aqualung");
        songTitles.add("Soul Sister");
        songTitles.add("Go Now");
        songTitles.add("Lights");
        songTitles.add("Soul Sister");
        webMusicA.updateDownloads(songTitles);
        assertNull(webMusicA.getDownloadInfo("Soul Brother"));
        assertEquals(5, webMusicA.getDownloadInfo("Hey Jude").getTimesDownloaded());
        assertEquals(5, webMusicA.getDownloadInfo("Soul Sister").getTimesDownloaded());
        assertEquals(11, webMusicA.getDownloadInfo("Aqualung").getTimesDownloaded());
        assertEquals(2, webMusicA.getDownloadInfo("Lights").getTimesDownloaded()); 
        assertEquals(1, webMusicA.getDownloadInfo("Go Now").getTimesDownloaded()); 
    }

}
