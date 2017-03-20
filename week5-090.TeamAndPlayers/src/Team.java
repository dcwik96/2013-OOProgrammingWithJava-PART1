
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dcwik
 */
public class Team {

  private ArrayList<Player> team = new ArrayList<Player>();
  private String name;
  private int maxSize = 16;

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addPlayer(Player addingPlayer) {
    if (size() < this.maxSize) {
      team.add(addingPlayer);
    }
  }

  public void printPlayers() {
    for (Player p : team) {
      System.out.println(p);
    }
  }

  public void setMaxSize(int size) {
    this.maxSize = size;
  }

  public int size() {
    return team.size();
  }

  public int goals() {
    int goals = 0;
    for (Player p : team){
      goals+=p.goals();
    }
    return goals;
  }
}
