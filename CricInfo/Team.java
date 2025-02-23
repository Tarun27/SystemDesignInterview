public class Team {
  private String name;
  private List<Player> players;
  private Coach coach;
  private List<News> news;
  private TeamStat stats;

  public boolean addSquad(TournamentSquad squad);
  public boolean addPlayer(Player player);
  public boolean addNews(News news);
}

public class TournamentSquad {
  private List<Player> players;
  private Tournament tournament;
  private List<TournamentStat> stats;

  public boolean addPlayer(Player player);
}

public class Playing11 {
  private List<Player> players;

  public boolean addPlayer(Player player);
}
