import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/java/ninja_events.tsv";
        List<Event> events = EventReader.readData(fileName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give point input to filter by: ");
        EventFilter.filterEvent(events,Double.parseDouble(scanner.nextLine()));
    }
}