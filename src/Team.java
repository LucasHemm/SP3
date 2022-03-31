import java.util.ArrayList;

public class Team {

    private String teamName;
    private int numberOfPlayers;
    private int numberOfPoints = 0;
    private int goalDifference = 0;
    ArrayList<Player> teamPlayers;
    TextUI textUI = new TextUI;

    public Team(String teamName, int numberOfPlayers){
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;

        for(int i = 0; i < numberOfPlayers;i++){
            System.out.println("Write player name: ");
            Player p = new Player(textUI.get());
            teamPlayers.add(p);
        }
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }


    public String getTeamName(){
        return this.teamName = teamName;
    }

    public void updateNumberOfPoints(int pointsToAdd){
        this.numberOfPoints += pointsToAdd;
    }

    public int getNumberOfPoints(){
        return this.numberOfPoints;
    }

    public void updateGoalDifference(int goalDiffToAdd){
        this.goalDifference += goalDiffToAdd;
    }

    public int getGoalDifference(){
        return this.goalDifference;
    }

    public String getTeamPlayerNames(){
        String names = "";
        for(Player c : teamPlayers){
            names = c.getName();
        }
        return names;
    }

}
