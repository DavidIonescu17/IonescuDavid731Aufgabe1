import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class gameReader {
    public static List<Game> readData(String fileName){
        List<Game> games = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            reader.readLine();
            while((line = reader.readLine())!=null){
                String[] parts = line.split("\t");
                int id = Integer.parseInt(parts[0]);
                String team1 = parts[1];
                String team2 = parts[2];
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(parts[3]);
                String city = parts[4];
                int capacity = Integer.parseInt(parts[5]);
                games.add(new Game(id,team1,team2,date,city,capacity));
            }
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return games;
    }

}
