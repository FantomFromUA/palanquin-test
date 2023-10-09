import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2004, 7, 1);
        LocalDate date2 = LocalDate.of(2005, 1, 2);
        LocalDate date3 = LocalDate.of(2007, 1, 1);
        LocalDate date4 = LocalDate.of(2032, 5, 3);

        List<LocalDate> dates = Arrays.asList(date1, date2, date3, date4);

        DateSorter dateSorter = new DateSorter();

        Collection<LocalDate> sortedDates = dateSorter.sortDates(dates);
        sortedDates.stream().forEach(System.out::println);
    }
}