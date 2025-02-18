import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventReader {
    public static List<Event> readData(String fileName){
        List<Event> events = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            reader.readLine();
            while((line = reader.readLine())!=null){
                String[] parts = line.split("\t");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                Stufe stufe = Stufe.valueOf(parts[2]);
                String beschreibung = parts[3];
                LocalDate date = LocalDate.parse(parts[4]);
                double punkte = Double.parseDouble(parts[5]);
                events.add(new Event(id,name,stufe,beschreibung,date,punkte));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return events;
    }
}
