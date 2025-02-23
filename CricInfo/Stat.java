public abstract class Stat {
  public abstract boolean updateStats();
}

public class PlayerStat extends Stat {
  private int ranking;
  private int bestScore;
  private int bestWicketCount;
  private int totalMatchesPlayed;
  private int total100s;
  private int totalHattricks;

  public boolean updateStats();
}

public class MatchStat extends Stat {
  private double winPercentage;
  private Player topBatsman;
  private Player topBowler;

  public boolean updateStats();
}

public class TeamStat extends Stat {
  private int totalSixes;
  private int totalFours;
  private int totalReviews; 

  public boolean updateStats();
}
