public class Tournament {
  private Date startDate;
  private List<TournamentSquad> teams;
  private List<Match> matches;
  private PointsTable points;

  public boolean addTeam(TournamentSquad team);
  public boolean addMatch(Match match);
}

public class PointsTable {
  private HashMap<String, float> teamPoints;
  private HashMap<Team, MatchResult> matchResults;
  private Tournament tournament;
  private Date lastUpdated;
}

public class Stadium {
  private String name;
  private Address location;
  private int maxCapacity;
}
