package feedbackWeb;

import feedbackWeb.dao.FeedbackDao;
import feedbackWeb.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class IndexController {

    @Autowired
    FeedbackDao fdao;

    Feedback feedback;

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("/feedback.htm")
    public String feedback(){
        return "feedback.jsp";
    }

    @RequestMapping("/addFeedback")
    //public String addFeedback(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("reg") String reg, @RequestParam("code") String code,@RequestParam("msg") String msg, @RequestParam("rating") int rating){
    public String addFeedback(@ModelAttribute Feedback feedback){
        //feedback = new Feedback(name, email, reg, code, rating);
        fdao.addFeedback(feedback);
        return "welcome.jsp";
    }

    public static void main(String[] args) {
        SpringApplication.run(IndexController.class, args);
    }
}
