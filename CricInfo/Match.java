public abstract class Match {
  private Date startTime;
  private MatchResult result;
  private int totalOvers;
  private List<Playing11> teams;
  private List<Innings> innings;
  private Playing11 tossWin;
  private Map<Umpire, UmpireType> umpires;
  private Stadium stadium;
  private List<Commentator> commentators;
  private List<MatchStat> stats;

  public abstract boolean assignStadium(Stadium stadium);
  public abstract boolean assignUmpire(Umpire umpire);
}

public class T20 extends Match {
  public boolean assignStadium(Stadium stadium);
  public boolean assignUmpire(Umpire umpire);
}

public class Test extends Match {
  public boolean assignStadium(Stadium stadium);
  public boolean assignUmpire(Umpire umpire);
}

public class ODI extends Match {
  public boolean assignStadium(Stadium stadium);
  public boolean assignUmpire(Umpire umpire);
}
