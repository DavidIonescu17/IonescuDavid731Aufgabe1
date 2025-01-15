import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/java/spielorte.tsv";
        List<Game> games = gameReader.readData(inputFile);
    }
}