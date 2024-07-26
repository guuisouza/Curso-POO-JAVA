import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FromatandoDataHora {
    public static void main(String[] args) {
        LocalDate date04 = LocalDate.parse("2024-07-26");
        LocalDateTime date05 = LocalDateTime.parse("2024-07-26T15:22:40");
        Instant date06 = Instant.parse("2024-07-26T15:22:40Z"); // Horario de londres

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // withZone considera o fuso horario do Sistema Local do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Data local
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Data local

        System.out.println("Date04: " + date04.format(fmt1));
        System.out.println("Date04: " + fmt1.format(date04));
        System.out.println("Date04: " + date04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Date05: " + date05.format(fmt1));
        System.out.println("Date05: " + date05.format(fmt2));

        // Imprimir de forma customizada uma DATA HORA GLOBAL (Instant)
        System.out.println("Date06: " + fmt3.format(date06));
        System.out.println("Date06: " + fmt5.format(date06));

        System.out.println("Date05: " + fmt4.format(date05));
    }
}
