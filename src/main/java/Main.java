import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/java/spielorte.tsv";
        List<Game> games = gameReader.readData(inputFile);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity: ");
        gameFilter.filterGames(games, Integer.parseInt(scanner.nextLine()
        ));
    }
}