import java.util.ArrayList;
import textui.TextUI;
import textui.SysTextUI;

public class Tournament {

    TextUI textUI = new SysTextUI();
    public ArrayList<Match> matches = new ArrayList();
    FileIo fileIo = new FileIo();
    ArrayList<Team> teams = new ArrayList<>();



    public void run() {

        String[] choices = {"New tournament", "Continue tournament", "Delete tournament"};
        int menuChoice = textUI.select("Choose an option to continue", choices, "FOOTER");
        switch (menuChoice) {
            case 0:
               // fileIo.clear();**********************
                for(int i = 0; i < 4; i++){
                    System.out.println("Enter date, then enter time of match");
                    createMatch(textUI.get(), textUI.get());
                }
                fileIo.saveTeamData(teams);
                fileIo.saveGameData(matches);
                //evt menuchoice++ ***************************
            case 1:
               // fileIo.loadTeams & fileIo.loadMatches *************
                while(true){
                    String[] options = {"Register results", "Create semi-finals", "Create final", "View ranking",
                                        "View match program", "View teams", "Quit and save"};
                    int optionChoice = textUI.select("Choose an option", options, "OPTION FOOTER");

                    switch (optionChoice) {
                        case 0:
                            // evt smid view match program ind
                            System.out.println("Enter which match you would like to update");
                            Match match = matches.get(textUI.getInteger()-1);
                            registerResult(match);
                            break;
                        case 1:
                            // code block
                            break;
                        default:
                            // code block
                    }
                }




                break;
            case 2:
                // fileIO.clear();**********************
                System.out.println("Tournament has been deleted");
                break;
        }
    }

    private void createMatch(String date, String time){
        Match match = new Match(date,time);
        matches.add(match);

    }

    private void registerResult(Match match){

       String[] choices = {match.team1.getTeamName(), match.team2.getTeamName()};
       int winner = textUI.select("Enter winning team", choices, "");
        switch(winner) {
            case 0:
                match.team1.updateNumberOfPoints(2);
                match.result = match.team1.getTeamName() + ": Won the match";
                break;
            case 1:
                match.team2.updateNumberOfPoints(2);
                match.result = match.team2.getTeamName() + ": Won the match";
                break;
        }
        int team1Goal = textUI.getInteger();
        int team2Goal = textUI.getInteger();
        match.team1.updateGoalDifference(team1Goal);
        match.team1.updateGoalDifference(-team2Goal);

        match.team2.updateGoalDifference(team2Goal);
        match.team2.updateGoalDifference(-team1Goal);


    }


}
