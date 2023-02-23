package ClaseDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner s= new Scanner(System.in);
        System.out.println("Digite una fecha con formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            System.out.println("error");
            throw new RuntimeException(e);
        }
    }
}
