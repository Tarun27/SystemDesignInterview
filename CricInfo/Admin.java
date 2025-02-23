public class Admin {
  public boolean addPlayer(Player player);
  public boolean addTeam(Team team);
  public boolean addMatch(Match match);
  public boolean addTournament(Tournament tournament);
  public boolean addStats(Stat stats);
  public boolean addNews(News news);
}

public class Player {
  private String name;
  private int age;
  private int country;
  private PlayerPosition position;
  private List<Team> teams;
  private PlayerStat stat;
}

public class Coach {
  private String name;
  private int age;
  private int country;
  private List<Team> teams;
}

public class Umpire {
  private String name;
  private int age;
  private int country;

  public boolean assignMatch(Match match);
}
