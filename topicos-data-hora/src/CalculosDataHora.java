import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {
        LocalDate date04 = LocalDate.parse("2024-07-26");
        LocalDateTime date05 = LocalDateTime.parse("2024-07-26T15:22:40");
        Instant date06 = Instant.parse("2024-07-26T01:30:40Z");

        // LocalDate de 1 semana antes/depois do date04
        LocalDate date04PastWeekLocalDate = date04.minusDays(7);
        LocalDate date04NextWeekLocalDate = date04.plusDays(7);

        System.out.println("Past Week: " + date04PastWeekLocalDate);
        System.out.println("Next Week: " + date04NextWeekLocalDate);
        System.out.println();

        // LocalDateTime de 1 semana antes/depois do date05
        LocalDateTime date05PastWeekLocalDateTime = date05.minusDays(7);
        LocalDateTime date05NextWeekLocalDateTime = date05.plusDays(7);

        System.out.println("Past Week: " + date05PastWeekLocalDateTime);
        System.out.println("Next Week: " + date05NextWeekLocalDateTime);
        System.out.println();

        // LocalDateTime de 1 semana antes/depois do date06
        Instant date06PastWeekInstant = date06.minus(7, ChronoUnit.DAYS);
        Instant date06NextWeekInstant = date06.plus(7, ChronoUnit.DAYS);

        System.out.println("Past Week: " + date06PastWeekInstant);
        System.out.println("Next Week: " + date06NextWeekInstant);
        System.out.println();

        // Calcular a duração entra duas datas horas
        Duration t1 = Duration.between(date05PastWeekLocalDateTime, date05);
        System.out.println("t1 dias de diferença: " + t1.toDays());

        // Não tem como calcular o intervalo de tempo entre dois Local Dates
        // É preciso converte-lo para um LocalDateTime usando .atTime ou .atStartOfDay
        Duration t2 = Duration.between(date04PastWeekLocalDate.atStartOfDay(), date04.atStartOfDay());
        System.out.println("t2 dias de diferença: " + t2.toDays());

        // Usando o instant
        Duration t3 = Duration.between(date06PastWeekInstant, date06);
        System.out.println("t3 dias de diferença: " + t3.toDays());

        // Diferença com a primeira data maior que a segunda
        Duration t4 = Duration.between(date06, date06PastWeekInstant);
        System.out.println("t4 dias de diferença: " + t4.toDays());
    }
}
