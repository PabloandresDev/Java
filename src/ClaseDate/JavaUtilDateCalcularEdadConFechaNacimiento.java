package ClaseDate;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaUtilDateCalcularEdadConFechaNacimiento {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
// 01/01/2000
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite su fecha de nacimiento con formato dd/MM/yyyy")
        ;
        try{
            LocalDate fechaNac = LocalDate.parse(s.next(), fmt);
            LocalDate ahora = LocalDate.now();

            Period periodo = Period.between(fechaNac, ahora);
            System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        }  catch (Exception e) {
            System.out.println("error");
        }

    }
}
