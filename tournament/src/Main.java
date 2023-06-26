import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team teamA = new Team("Equipo A",{"Messi", "DiMaria", "Isabel", "Isaac"});

        Team teamB = new Team("Equipos B",{"Tomas", "Jogher", "Paco", "Franco"} );

        Team teamC = new Team("Equipo C",{"Almada", "Dybala", "DePaul", "MacAllister"});

        Team teamD = new Team("Equipo D", {"Pepe", "Lucio", "Mario", "Luigi"});

        Team teamE = new Team("Equipo E",{"Ana", "Carlos", "Sofia", "Javier", "Javier","Mariana"});

        Team teamF = new Team("Equipo F",{"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"});


        
        //TODO: Agregar jugadorres a teamG y teamH, y el partido

       teamA.showMembers();
      
       teamB.showMembers();
  
        //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);

        System.out.println(primerPartido.getMatchStatus());

        //TODO: Agregar partidos entre teamC y teamD, teamE y teamF


        //TODO: Agregar jugadorres a teamG y teamH, y el partido

    }


}