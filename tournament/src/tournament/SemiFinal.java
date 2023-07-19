package tournament;

import java.util.ArrayList;
import java.util.List;

public class SemiFinal {
    private ArrayList<Team> teams;

    public SemiFinal(ArrayList<Team> teams) {
        if (teams.size() != 4) {
            throw new IllegalArgumentException("son 4 equipos para la semi final");
        }
        this.teams = teams;
    }

   public List<Team> obtenerEquiposSemiFinal() {

           List<Team> equiposGanadores = new ArrayList<>();
           Match primerPartido = new Match(teams.get(0), teams.get(1));
           Match segundoPartido = new Match(teams.get(2), teams.get(3));

           if (primerPartido.getWinner().equals(primerPartido.getLocalTeam().getName())) {
               equiposGanadores.add(primerPartido.getLocalTeam());
           } else {
               equiposGanadores.add(primerPartido.getVisitantTeam());
           }

           if (segundoPartido.getWinner().equals(segundoPartido.getLocalTeam().getName())) {
               equiposGanadores.add(segundoPartido.getLocalTeam());
           } else {
               equiposGanadores.add(segundoPartido.getVisitantTeam());
           }

           return equiposGanadores;
       }
   }
        //return teams.subList(0, 2);

