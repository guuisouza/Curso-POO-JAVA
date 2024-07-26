import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class OperacoesDataHora {
    public static void main(String[] args) {
        LocalDate date04 = LocalDate.parse("2024-07-26");
        LocalDateTime date05 = LocalDateTime.parse("2024-07-26T15:22:40");
        Instant date06 = Instant.parse("2024-07-26T01:30:40Z"); // Horario de londres

        // Converter data-hora-global para local
        LocalDate resultado1 = LocalDate.ofInstant(date06, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(date06, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(date06, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(date06, ZoneId.of("Portugal"));

        System.out.println("Convertendo data-hora-global com Time Zone: " + resultado1);
        System.out.println("Convertendo data-hora-global para Portugal: " + resultado2);
        System.out.println("Convertendo data-hora-global com Time Zone: " + resultado3);
        System.out.println("Convertendo data-hora-global para Portugal: " + resultado4);

        // Obter DADOS de uma data-hora-local
        System.out.println("Date04 dia = " + date04.getDayOfMonth());
        System.out.println("Date04 mês = " + date04.getMonthValue());
        System.out.println("Date04 ano = " + date04.getYear());

        System.out.println("Date05 hora = " + date05.getHour());
        System.out.println("Date05 minute = " + date05.getMinute());
    }
}
