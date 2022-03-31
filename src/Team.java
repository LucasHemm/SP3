import java.util.ArrayList;

public class Team {

    private String teamName;
    private int numberOfPlayers;
    private int numberOfPoints = 0;
    private int goalDifference = 0;
    ArrayList<Player> teamPlayers;
    TextUI textUI = new SysTextUI;

    public Team() {
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    public void registerTeam(String teamName, int numberOfPlayers){
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;

        for(int i = 0; i < numberOfPlayers;i++){
            Player p = new Player(textUI.get);
            teamPlayers.add(p);
        }

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
}
