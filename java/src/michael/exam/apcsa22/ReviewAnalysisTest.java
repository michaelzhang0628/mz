package michael.exam.apcsa22;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ReviewAnalysisTest {

    @Test
    void testReviewAnalysis() {
        Review[] rl = new Review[5];
        rl[0] = new Review(4, "Good! Thx");
        rl[1] = new Review(3, "OK site");
        rl[2] = new Review(5, "Great!");
        rl[3] = new Review(2, "Poor! Bad.");
        rl[4] = new Review(3, "");
        ReviewAnalysis ra = new ReviewAnalysis(rl);
        assertEquals(3.4, ra.getAverageRating());
        ArrayList<String> expected = new ArrayList<String> ();
        expected.add("0-Good! Thx.");
        expected.add("2-Great!");
        expected.add("3-Poor! Bad.");
        assertEquals(expected, ra.collectComments());
    }
}
