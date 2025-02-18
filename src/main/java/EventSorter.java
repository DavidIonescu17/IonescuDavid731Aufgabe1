import java.util.Comparator;
import java.util.List;

public class EventSorter {
    public static void sortEvents(List<Event> events){
        events.stream()
                .filter(event -> event.getStufe()==Stufe.Jonin)
                .sorted(Comparator.comparing(Event::getDate).reversed())
                .map(event -> event.getDate() + ": " +event.getName() + " - " + event.getBeschreibung())
                .forEach(System.out::println);

    }
}
