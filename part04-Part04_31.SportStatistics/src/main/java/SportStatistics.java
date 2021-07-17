
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int loses = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                String winner = "";
                String looser = "";
                
                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                    if (homePoints > visitingPoints) {
                        winner = homeTeam;
                        looser = visitingTeam;
                    } else {
                        winner = visitingTeam;
                        looser = homeTeam;
                    }
                    if (winner.equals(team)) {
                        wins++;
                    } else if (looser.equals(team)) {
                        loses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    
    }

}
