import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player teacher = new Player("Teacher");
        Player student1 = new Player("Student 1");
      
        Player sergio = new Player("Sergio");
        Player isaac = new Player("Isaac");
        Player isabel = new Player ("Isabel");
        Player messi = new Player("Messi");
        Player diMaria = new Player ("DiMaria");
        Player alvarez = new Player("Alvarez");
      
      
        //ArrayList<Player> playersA = new ArrayList<>();
        //playersA.add(teacher);
        //playersA.add(student1);

        //Team teamA = new Team("Equipo A", playersA);
        Team teamA = new Team("Equipo A");
        teamA.addPlayer(messi);
        teamA.addPlayer(diMaria);
        teamA.addPlayer(isabel);
        teamA.addPlayer(isaac);

        Team teamF = new Team("Equipo F");
        String [] playersF = {"messi", "diMaria", "isabel", "isaac", "teacher", "tudent1"};
        for (String player: playersF){
            teamF.addPlayer (new Player(player));
        };
        
        //showMembers
       teamA.showMembers();
      
        teamB.showMembers();
  
      //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);

        System.out.println(primerPartido.getMatchStatus());

    }


}