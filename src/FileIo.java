import textui.TextUI;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileIo {

    public void saveTeamData(ArrayList<Team> data ) {
        StringBuilder gameData = new StringBuilder("Name, Number of players\n");
        for(Team t: data) {
            gameData.append(t.getName()+", "+t.getNumberOfPlayers()+t.getTeamPlayerNames()"\n");
        }

        try {
            FileWriter output = new FileWriter("src/teamData.txt");
            output.write(gameData.toString());
            output.close();

        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void saveGameData(ArrayList<Match> data ) {
        StringBuilder gameData = new StringBuilder("Match, Team-1, Team-2, Date, Time, Result\n");
        for(Match m: data) {
            gameData.append(m.getMatch()+m.getResult()+"\n");
        }

        try {
            FileWriter output = new FileWriter("src/gameData.txt");
            output.write(gameData.toString());
            output.close();

        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }
}
