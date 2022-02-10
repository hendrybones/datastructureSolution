package com.company.datastractures;


import javax.xml.transform.Result;
import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Calender {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        //String res = Result.findDay(month, day, year);

        //bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static String findDay(int month, int day, int year) {
        int m=Integer.valueOf(month);
        int d=Integer.valueOf(day);
        int y=Integer.valueOf(day);
        LocalDate date=LocalDate.of(y,m,d);
        return date.getDayOfWeek().toString();

//        //calender class
//       // Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.MONTH, month-1);
//        cal.set(Calendar.DAY_OF_MONTH, day);
//        cal.set(Calendar.YEAR, year);
//        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();


    }
}
