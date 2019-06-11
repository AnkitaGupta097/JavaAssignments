package ankita.java_assignment4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class DateRange {
    private Date firstDate, secondDate, signUpDate, formDate;
    private Calendar anniversaryDate, formDateCalender, minDate;
    int signUpYear;

    DateRange(Date signUpDate, Date formDate) {

        this.signUpDate = signUpDate;

        this.formDate = formDate;
        anniversaryDate = Calendar.getInstance();

        anniversaryDate.setTime(signUpDate);
        signUpYear = anniversaryDate.get(Calendar.YEAR);
        formDateCalender = Calendar.getInstance();
        formDateCalender.setTime(formDate);
        anniversaryDate.set(Calendar.YEAR, formDateCalender.get(Calendar.YEAR));
        anniversaryDate.add(Calendar.DATE, -30);
        firstDate = anniversaryDate.getTime();

        anniversaryDate.add(Calendar.DATE, +60);
        secondDate = anniversaryDate.getTime();
        minDate = Calendar.getInstance();
        minDate.setTime(firstDate);
        minDate.set(Calendar.YEAR, signUpYear+1);


    }

    public Date getFirstDate() {
        return firstDate;
    }

    public Date getSecondDate() {
        return secondDate;
    }

    public void computeRange() {
        if (formDate.compareTo(secondDate) < 0 && formDate.compareTo(firstDate) > 0) {
            secondDate = formDate;

        } else if (formDate.compareTo(firstDate) <= 0) {
            firstDate = null;
            secondDate = null;
        } else if (minDate.getTime().compareTo(firstDate) > 0) {
            firstDate = null;
            secondDate = null;
        }


    }

}


public class Assignment4 {
    public static void main(String[] args) throws ParseException {
        String signUpDate, formDate;


        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        DateRange dateRangeArray[] = new DateRange[testCases];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < testCases; i++) {
            signUpDate = sc.next();
            formDate = sc.next();
            DateRange dr = new DateRange(dateFormat.parse(signUpDate), dateFormat.parse(formDate));

            dr.computeRange();
            dateRangeArray[i] = dr;

        }
        for (int i = 0; i < testCases; i++) {
            if (dateRangeArray[i].getFirstDate() == null) {
                System.out.println("No range");
            } else {
                System.out.println(dateFormat.format(dateRangeArray[i].getFirstDate()) + " " + dateFormat.format(dateRangeArray[i].getSecondDate()));
            }
        }


    }

}
