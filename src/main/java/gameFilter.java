import java.util.List;

public class gameFilter {
    public static void filterGames(List<Game> games, int wert){
        games.stream()
                .filter(game -> game.getCapacity() >= wert)
                .map(game->game.getTeam1() + " vs " + game.getTeam2() + " - Datum:" + game.getDate() + "- SpielOrt" +  game.getCity())
                .forEach(System.out::println);
    }
}
