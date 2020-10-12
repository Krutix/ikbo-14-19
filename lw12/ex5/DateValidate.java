package lw12.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidate {
    private static boolean dateValidate(String date) {
        if (!Pattern.matches("(\\d{2})/(\\d{2})/((19\\d{2})|([2-9]\\d{3}))", date))
            return false;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") {{setLenient(false);}};
        try
        {
            sdf.parse(date);
        }
        catch (ParseException e)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(dateValidate(scanner.nextLine()));
    }
}
