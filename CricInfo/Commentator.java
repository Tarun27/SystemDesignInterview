public class Commentator {
  private String name;

  public boolean assignMatch(Match match);
}

public class Commentary {
  private String text;
  private Date createdAt;
  private Commentator commentator;
}

public class News {
  private Date date;
  private String text;
  private List<byte> image;
  private Team team;
}
