//import java.util.Comparator;
//import java.util.List;
//
//public class gameSort {
//    public static void sortGames(List<Game> games){
//        games.stream()
//                .filter(game -> game.getDate().after(2024-06-30))
//                .filter(game -> game.getCity().equals("München"))
//                .map(game -> game.getDate() + ":" + game.getTeam1() +" vs "+ game.getTeam2())
//                .sorted(Game::getDate)
//                .forEach(System.out::println);
//    }
//}
