package ankita.java_assignment4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


class DateRange {
    private Date firstDate, lastDate, signUpDate, currDate;
    private Calendar anniversaryDate, currDateCalender, minDate;
    private int signUpYear;

    DateRange(Date signUpDate, Date currDate) {

        this.signUpDate = signUpDate;
        this.currDate = currDate;

        //to calculate range of date (+-30 days from this date)
        anniversaryDate = Calendar.getInstance();
        anniversaryDate.setTime(signUpDate);

        //year of firstSignUp
        signUpYear = anniversaryDate.get(Calendar.YEAR);
        
        currDateCalender = Calendar.getInstance();
        currDateCalender.setTime(currDate);
        
        anniversaryDate.set(Calendar.YEAR, currDateCalender.get(Calendar.YEAR));

        //subtract 30 days to get firstDate of range
        anniversaryDate.add(Calendar.DATE, -30);
        firstDate = anniversaryDate.getTime();

        //getting lastDate of range
        anniversaryDate.add(Calendar.DATE, +60);
        lastDate = anniversaryDate.getTime();


        minDate = Calendar.getInstance();
        minDate.setTime(firstDate);
        minDate.set(Calendar.YEAR, signUpYear+1);


    }

    public Date getFirstDate() {
        return firstDate;
    }

    public Date getlastDate() {
        return lastDate;
    }

    public void computeRange() {
        //if current date before lastdate of range
        if (currDate.compareTo(lastDate) < 0 && currDate.compareTo(firstDate) > 0) {
            lastDate = currDate;


        }
        //if current date equal or before first date of range then there is no range formed
        else if (currDate.compareTo(firstDate) <= 0) {
            firstDate = null;
            lastDate = null;


        }
        //form filling range starts one year after signUpYear before that no range formed
        else if (minDate.getTime().compareTo(firstDate) > 0) {
            firstDate = null;
            lastDate = null;
        }


    }

}


public class Assignment4 {
    
    
    public static void main(String[] args) throws ParseException {
        String signUpDate, currDate;


        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        //array of class to store range of date for each testcases
        
        DateRange dateRangeArray[] = new DateRange[testCases];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        //inputting the signUp date and currDate for each testcase
        
        for (int i = 0; i < testCases; i++) {
            signUpDate = sc.next();
            currDate = sc.next();
            
            //class of store range of date
            DateRange dr = new DateRange(dateFormat.parse(signUpDate), dateFormat.parse(currDate));

            dr.computeRange();
            dateRangeArray[i] = dr;

        }
        for (int i = 0; i < testCases; i++) {
            if (dateRangeArray[i].getFirstDate() == null) {
                System.out.println("No range");
            } else {
                //changing date into string
                System.out.println(dateFormat.format(dateRangeArray[i].getFirstDate()) + " " + dateFormat.format(dateRangeArray[i].getlastDate()));
            }
        }


    }

}
