package tournament;

import java.util.List;


import java.util.ArrayList;

public class CuartoFinal {
    private ArrayList<Team> teams;

    public CuartoFinal(ArrayList<Team> teams){
        if (teams.size() !=8){
            throw new IllegalArgumentException("son 8 equipos para los cuartos de final");
        }
        this.teams = teams;
    }
    public List<Team> obtenerEquiposCuartoFinal() {
        List<Team> equiposGanadores = new ArrayList<>();
        Match primerPartido =  new Match(teams.get(0), teams.get(1));
        Match segundoPartido =  new Match(teams.get(2), teams.get(3));
        Match tercerPartido =  new Match(teams.get(4), teams.get(5));
        Match cuartoPartido =  new Match(teams.get(6), teams.get(7));

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

        if (tercerPartido.getWinner().equals(tercerPartido.getLocalTeam().getName())) {
            equiposGanadores.add(tercerPartido.getLocalTeam());
        } else {
            equiposGanadores.add(tercerPartido.getVisitantTeam());
        }

        if (cuartoPartido.getWinner().equals(cuartoPartido.getLocalTeam().getName())) {
            equiposGanadores.add(cuartoPartido.getLocalTeam());
        } else {
            equiposGanadores.add(cuartoPartido.getVisitantTeam());
        }

        return equiposGanadores;
    }

       // return teams.subList(0, 4);


}
