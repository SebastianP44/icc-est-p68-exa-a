package models;

public class League {

  private String name;
  private Team[] teams;

  public League(String name, Team[] teams) {
    this.name = name;
    this.teams = teams;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team[] getTeams() {
    return teams;
  }

  public void setTeams(Team[] teams) {
    this.teams = teams;
  }

  public int getTotalActiveGoals() {
    int golesTotales = 0;
    for (Team team : this.teams) {
      for (Player player : team.getPlayers()) {
        if (player.isActive()) {
          golesTotales += player.getGoals();
        }
      }
    }
    return golesTotales;
  }

}
// Implementar el metodo `getTotalActiveGoals()` en la clase `League`. Este
// metodo debe calcular y retornar la suma de goles de todos los jugadores con
// `isActive = true`,
// recorriendo todos los equipos de la liga.

// Sin este metodo implementado correctamente el resto del examen no funcionara.
/*
 * ```java
 * public int getTotalActiveGoals() {
 * // Implementar aqui
 * }
 */
