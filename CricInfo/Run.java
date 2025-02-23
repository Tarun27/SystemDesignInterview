public class Run {
  private int totalRuns;
  private RunType type;
  private Player scoredBy;
}

public class Ball {
  private Player balledBy;
  private Player playedBy;
  private BallType type;
  private List<Run> runs;
  private Wicket wicket;

  public boolean addCommentary(Commentary commentary);
}

public class Wicket {
  private WicketType type;
  private Player playerOut;
  private Player balledBy;
  private Player caughtBy;
  private Player runoutBy;
  private Player stumpedBy;
}

public class Over {
  private int number;
  private Player bowler;
  private int totalScore;
  private List<Ball> balls;

  public boolean addBall(Ball ball);
}

public class Innings {
  private Playing11 bowling;
  private Playing11 batting;
  private Date startTime;
   private Date endTime;
  private int totalScores;
  private int totalWickets;
  private List<Over> overs;

  public boolean addOver(Over over);
}
