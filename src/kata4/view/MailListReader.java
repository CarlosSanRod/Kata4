package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kata4.model.Mail;

public class MailListReader {

    public static List<Mail> read(String fileName) {
        
        List<Mail> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            String line = reader.readLine();
            
            while(true) {
                
                if(line == null) break;
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
                    line = reader.readLine();
            }
            
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File not found) " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailListReader::read (IO) " + exception.getMessage());
        }
        return list;
    }
    
}