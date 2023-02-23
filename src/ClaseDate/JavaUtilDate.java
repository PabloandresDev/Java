package ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha.toString() = " + fecha.toString());
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String fechaFormato= dt.format(fecha);
        System.out.println("fecha = " + fechaFormato);
    }
}
