import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        //1. Write a method named displayTodaysDate that, when called, prints the current date to the console.
        Date displayTodaysDate = new Date();

        System.out.println(displayTodaysDate);


        //2. Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately (date in the format YYYY-MM-DD).
        LocalDate displayDateComponents = LocalDate.of(2023, 04, 17);

        System.out.println(displayDateComponents);



        //3. Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise (format YYYY-MM-DD).



        //4. Write a method named isTodaySpecificDate that checks if today's date is a date received from the user (so the user type in a date, and compare that date with today's date, return true or false).



        //5. Write a method named displayCurrentTime that prints the current time to the console (format HH:MM:SS).
//        String displayCurrentTime = "HH-MM-SS";
//        SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat(displayCurrentTime);
//        System.out.println(simpleDateFormatDate.format(date));


        //6. Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
        String findDayOfWeek = "11-Mon-2023 13:30";
        System.out.println(findDayOfWeek);



        //7. Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
//        Timestamp elapsedTimeSince = new Timestamp(System.currentTimeMillis());
//        System.out.println(elapsedTimeSince);


        //8. Construct a method called elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present. This method should return X hours, Y minutes, Z seconds



      }
}
