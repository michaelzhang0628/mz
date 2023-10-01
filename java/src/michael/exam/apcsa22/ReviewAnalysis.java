package michael.exam.apcsa22;

import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] allReviews) {
        this.allReviews = allReviews;
    }
    
    public double getAverageRating() {
        int x = 0;
        for (Review r : allReviews) {
            x += r.getRating();
        }
        return x * 1.0 / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> commentsList = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++) {            
            String currentComment = allReviews[i].getComment();
            if (currentComment.indexOf("!") >= 0) {
                /*
                char lastChar = currentComment.charAt(currentComment.length() - 1);
                if (!((lastChar=='.') || lastChar=='!')) {
                    currentComment += ".";
                }*/
                if (!(currentComment.endsWith(".") || currentComment.endsWith("!"))) {
                    currentComment += ".";
                }
                commentsList.add(i + "-" + currentComment);
            }
        }
        return commentsList; 
    }
}
