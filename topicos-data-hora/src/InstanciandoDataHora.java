import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {
    public static void main(String[] args) {
        // Instanciando uma data a partir do instante atual (LocalDate, LocalDateTime, Instant)
        LocalDate date01 = LocalDate.now();
        System.out.println("Local Data (Data-Local): " + date01);
        LocalDateTime date02 = LocalDateTime.now();
        System.out.println("Local Data Time (Data-Hora-Local): " + date02);
        Instant date03 = Instant.now();
        System.out.println("Instant (Data-Hora-Global): " + date03);
        System.out.println();

        // Gerando uma Data-Hora e através de um texto ISO 8601
        LocalDate date04 = LocalDate.parse("2024-07-26");
        System.out.println("Iso 8601 LocalDate: " + date04);
        LocalDateTime date05 = LocalDateTime.parse("2024-07-26T15:22:40");
        System.out.println("Iso 8601 LocalDateTime: " + date05);
        Instant date06 = Instant.parse("2024-07-26T15:22:40Z"); // Padrão UTC
        System.out.println("Iso 8601 GlobalLocalDateTime: " + date06);
        Instant date07 = Instant.parse("2024-07-26T15:22:40-03:00");
        System.out.println("Iso 8601 - Gerando um horário no de SP e mostrando ele equivalente em Londres: " + date07);
        System.out.println();

        // Texto em formato Customizado
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date08 = LocalDate.parse("26/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formato customizado Date: " + date08);
        LocalDateTime date09 = LocalDateTime.parse("26/07/2024 15:43", formato2);
        System.out.println("Formato customizado Date Time (Criando novo formater): " + date09);
        System.out.println();

        // Dados isolados
        LocalDate date10 = LocalDate.of(2024, 7, 26);
        System.out.println("Data de dados isolados: " + date10);
        LocalDateTime date11 = LocalDateTime.of(2024, 7, 24, 15, 48);
        System.out.println("DataHora de dados isolados: " + date11);








    }
}