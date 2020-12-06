package kata4.main;

import kata4.model.Mail;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;
import kata4.view.MailHistogramBuilder;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "emails.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histogram");
        histogramDisplay.execute();    
    }
    
}