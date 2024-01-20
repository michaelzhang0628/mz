package michael.exam.apcs2022;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewAnalysisTest {

    @Test
    void testGetAveragRating() {
        Review[] r = new Review[] {new Review(4, "Good! Thx"), new Review(3, "OK site"), new Review(5, "Great!"), new Review(2, "Poor! Bad."), new Review(3, "")};
        ReviewAnalysis example = new ReviewAnalysis(r);
        assertEquals(3.4, example.getAverageRating());
    }
    
    @Test
    void testCollectComments() {
        Review[] r = new Review[] {new Review(4, "Good! Thx"), new Review(3, "OK site"), new Review(5, "Great!"), new Review(2, "Poor! Bad."), new Review(3, "")};
        ReviewAnalysis example = new ReviewAnalysis(r);
        assertEquals("0-Good! Thx.", example.collectComments().get(0));
        assertEquals("2-Great!", example.collectComments().get(1));
        assertEquals("3-Poor! Bad.", example.collectComments().get(2));

    }

}
