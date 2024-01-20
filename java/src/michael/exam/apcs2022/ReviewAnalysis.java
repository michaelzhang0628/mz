package michael.exam.apcs2022;

import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] allReviews) {
        super();
        this.allReviews = allReviews;
    }
    
    public double getAverageRating() {
        int ratingSum = 0;
        for (Review reviews : allReviews) {
            ratingSum += reviews.getRating();
        }
        return ((double) ratingSum) / allReviews.length;    
    }
    
    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++) {
            String comment = allReviews[i].getComment();
            if (comment.indexOf("!") >= 0) {
                if (comment.charAt(comment.length() - 1) != '!' && comment.charAt(comment.length() - 1) != '.') {
                    comment += ".";
                }
                comments.add(i + "-" + comment);
            }
        }
        return comments;
    }
}
