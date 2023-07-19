import tournament.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Team teamA = new Team("Equipo A",new String[]{"Messi", "DiMaria", "Isabel", "Isaac"});

        Team teamB = new Team("Equipos B",new String[]{"Tomas", "Jogher", "Paco", "Franco"});

        Team teamC = new Team("Equipo C",new String[]{"Almada", "Dybala", "DePaul", "MacAllister"});

        Team teamD = new Team("Equipo D", new String[]{"Pepe", "Lucio", "Mario", "Luigi"});

        Team teamE = new Team("Equipo E",new String[]{"Ana", "Carlos", "Sofia", "Javier", "Javier","Mariana"});

        Team teamF = new Team("Equipo F",new String[]{"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"});


        String [] playersG = {"Juancito","Roman","Cordoba","Clemente","Diaz"};
        Team teamG = new Team("Equipo G", playersG);

        String [] playersH = {"Aymar","Palermo","Cruz","Nacho","Ruben"};
        Team teamH = new Team("Equipo H", playersH);

       // teamA.showMembers();
      
       // teamB.showMembers();
  
        //System.out.println(tomas.showTeam());
        ArrayList<Team> equiposCuarto= new ArrayList<Team>();
        equiposCuarto.add(teamA);
        equiposCuarto.add(teamB);
        equiposCuarto.add(teamC);
        equiposCuarto.add(teamD);
        equiposCuarto.add(teamE);
        equiposCuarto.add(teamF);
        equiposCuarto.add(teamG);
        equiposCuarto.add(teamH);

        ArrayList<Match> partidosCuarto = new ArrayList<Match>();
        partidosCuarto.add(new Match(equiposCuarto.get(0), equiposCuarto.get(1)));
        partidosCuarto.add(new Match(equiposCuarto.get(2), equiposCuarto.get(3)));
        partidosCuarto.add(new Match(equiposCuarto.get(4), equiposCuarto.get(5)));
        partidosCuarto.add(new Match(equiposCuarto.get(6), equiposCuarto.get(7)));



        //Rearrange games based on new Match structure (partidosCuartos)
        Match primerPartido = partidosCuarto.get(0);
        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);
        System.out.println(primerPartido.getMatchStatus());

        Match segundoPartido = partidosCuarto.get(1);
        segundoPartido.makeLocalGoal(0);
        System.out.println(segundoPartido.getMatchStatus());

        Match tercerPartido = partidosCuarto.get(2);
        tercerPartido.makeVisitantGoal(1);
        tercerPartido.makeVisitantGoal(2);
        tercerPartido.makeLocalGoal(0);
        tercerPartido.makeLocalGoal(3);
        tercerPartido.makeLocalGoal(2);
        System.out.println(tercerPartido.getMatchStatus());

        Match cuartoPartido = partidosCuarto.get(3);
        cuartoPartido.makeLocalGoal(2);
        cuartoPartido.makeVisitantGoal(0);
        cuartoPartido.makeVisitantGoal(1);
        cuartoPartido.makeLocalGoal(3);
        System.out.println(cuartoPartido.getMatchStatus());

        ArrayList<Team> equiposGanadoresCuartos = new ArrayList<>();
        for (Match partido : partidosCuarto) {
            if (partido.getWinner().equals(partido.getLocalTeam().getName())) {
                equiposGanadoresCuartos.add(partido.getLocalTeam());
            } else {
                equiposGanadoresCuartos.add(partido.getVisitantTeam());
            }
        }
        System.out.println("Los 4 equipos de cuartos final son:");
        for (Team equipo: equiposGanadoresCuartos) {
            System.out.println(equipo.getName());
        }


        SemiFinal semiFinal = new SemiFinal(new ArrayList<>(equiposGanadoresCuartos));
        List<Team> equiposSemiFinal = semiFinal.obtenerEquiposSemiFinal();



        System.out.println("Los equipos de la semi final son:");
        for (Team equipo : equiposSemiFinal) {
            System.out.println(equipo.getName());
        }


        Team equipoGanadorSemiFinal1 = equiposSemiFinal.get(0);
        Team equipoGanadorSemiFinal2 = equiposSemiFinal.get(1);
        Match finalTorneo = new Match(equipoGanadorSemiFinal1, equipoGanadorSemiFinal2);

        finalTorneo.makeLocalGoal(0);
        finalTorneo.makeLocalGoal(1);
        finalTorneo.makeLocalGoal(1);
        finalTorneo.makeVisitantGoal(1);
        finalTorneo.makeVisitantGoal(1);
        finalTorneo.makeVisitantGoal(1);
        finalTorneo.makeVisitantGoal(3);

        System.out.println("El equipo ganador del Torneo de java es: " + finalTorneo.getWinner());














    }


}