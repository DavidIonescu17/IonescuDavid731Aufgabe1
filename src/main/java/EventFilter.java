import java.util.List;

public class EventFilter {
    public static void filterEvent(java.util.List<Event> events, double points){
        events.stream()
                .filter(event -> event.getPunkte()>points)
                .map(Event::getName)
                .distinct()
                .forEach(System.out::println);


    }
}
