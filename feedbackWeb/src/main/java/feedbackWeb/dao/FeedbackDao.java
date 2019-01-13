package feedbackWeb.dao;

import feedbackWeb.entity.Feedback;
import org.springframework.stereotype.Component;

@Component
public class FeedbackDao {
    public void addFeedback(Feedback fb) {
        System.out.println("in addFeedback " + fb.toString());
    }
}
