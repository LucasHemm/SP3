import java.util.ArrayList;
import textui.TextUI;
import textui.SysTextUI;

public class Match {


    public ArrayList<Match> matches = new ArrayList();
    String date;
    String time;
    TextUI textUI = new SysTextUI();


    public Match(String date, String time) {
        this.date = date;
        this.time = time;
        createTeams();
    }

    public void createTeams() {
        System.out.println("Enter team 1 name then enter number of players: ");
        Team team1 = new Team(textUI.get(), textUI.getInteger(2, 5));
        System.out.println("Enter team 2 name then enter number of players: ");
        Team team2 = new Team(textUI.get(), textUI.getInteger(2, 5));
    }

    public ArrayList<Team> getTeams() {
        return this.teams;
    }

    public String getDateAndTime() {
        return date + time;
    }
}
