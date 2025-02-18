import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EventWriter {
    public static void writeEvents (List<Event>events,String filename) {

        List<Map.Entry<Stufe, double[]>> sortedResults = events.stream()
                .collect(Collectors.groupingBy(
                        Event::getStufe,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> new double[]{list.size(), list.stream().mapToDouble(Event::getPunkte).sum()}
                        )
                ))
                .entrySet().stream()
                .sorted(Comparator.<Map.Entry<Stufe, double[]>>comparingDouble(e -> -e.getValue()[0])
                        .thenComparingDouble(e -> e.getValue()[1]))
                .collect(Collectors.toList());

        new File(filename);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<Stufe, double[]> entry : sortedResults) {
                writer.write(entry.getKey() + "%" + entry.getValue()[0] + "#" + entry.getValue()[1]);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
