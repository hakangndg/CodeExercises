package Generics;

interface Player {}

record BaseballPlayer(String name, String position) implements Player{}

record FootballPlayer(String name, String position) implements Player{}

public class Main {

  public static void main(String[] args) {
    
    BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
    BaseballTeam astros1 = new BaseballTeam("Houston Astros");
    scoreResult(phillies1, astros1, 3, 5);

    SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
    SportsTeam astros2 = new SportsTeam("Houston Astros");
    scoreResult(phillies2, astros2, 3, 5);

    Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
    Team<BaseballPlayer> astros = new Team<>("Houston Astros");
    scoreResult(phillies, astros, 3, 5);


    var harper = new BaseballPlayer("B Harper", "Right Fielder");
    var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
    phillies.addPlayer(harper);
    phillies.addPlayer(marsh);
    var guthrie = new BaseballPlayer("D Guthrei", "Center Field");
    phillies.addPlayer(guthrie);

    SportsTeam afc1 = new SportsTeam("Adelaide Crows");
    Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
    var tex = new FootballPlayer("Tex Walker", "Center half forward");
    afc.addPlayer(tex);

    var rory = new FootballPlayer("Rory Laird", "Midfield");
    afc.addPlayer(rory);

    

    afc.listTeamMembers();
  }



  public static void scoreResult(BaseballTeam team1, BaseballTeam team2, int t1_score, int t2_score) {

    String message = team1.setScore(t1_score, t2_score);
    team2.setScore(t2_score, t1_score);
    System.out.printf("%s %s %s %n", team1, message,team2);
  }

  public static void scoreResult(SportsTeam team1, SportsTeam team2, int t1_score, int t2_score) {

    String message = team1.setScore(t1_score, t2_score);
    team2.setScore(t2_score, t1_score);
    System.out.printf("%s %s %s %n", team1, message,team2);
  }

  public static void scoreResult(Team team1, Team team2, int t1_score, int t2_score) {

    String message = team1.setScore(t1_score, t2_score);
    team2.setScore(t2_score, t1_score);
    System.out.printf("%s %s %s %n", team1, message,team2);
  }
  
}
