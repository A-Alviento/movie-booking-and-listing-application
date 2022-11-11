package ui;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeInputController {
    
    public static LocalDate dateInput(String userInput) {
        
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            LocalDate date = LocalDate.parse(userInput, dateFormat);
            
            System.out.println(date);
            return date ;
        }
    
    public static LocalTime timeInput(String userInput) {
            
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("hh:mm");
            LocalTime time = LocalTime.parse(userInput, dateFormat);
            
            System.out.println(time);
            return time ;
        }

}
