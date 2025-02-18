import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/java/ninja_events.tsv";
        List<Event> events = EventReader.readData(fileName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give point input to filter by: ");
        EventFilter.filterEvent(events,Double.parseDouble(scanner.nextLine()));
        EventSorter.sortEvents(events);
        EventWriter.writeEvents(events,"gesamtzahl.txt");
    }
}