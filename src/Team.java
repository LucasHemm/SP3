import java.util.ArrayList;

public class Team {

    private String teamName;
    private int numberOfPlayers;
    private int numberOfPoints;
    private int goalDifference;
    ArrayList<Player> teamPlayers;

    public Team(String teamName, int numberOfPlayers, int numberOfPoints, int goalDifference) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfPoints = numberOfPoints;
        this.goalDifference = goalDifference;
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    void registerTeam(String teamName, int numberOfPlayers){
        this.teamName = teamName;
        this.numberOfPoints = numberOfPlayers;
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
