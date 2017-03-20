/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dcwik
 */
public class LyyraCard {

  private double balance;

  public LyyraCard(double startBalance) {
    this.balance = startBalance;
  }

  public void loadMoney(double amount) {
    if (amount > 0) {
      this.balance += amount;
      if (this.balance > 150) {
        this.balance = 150;
      }
    }
  } 

  public void payEconomical() {
    if (this.balance >= 2.50) {
      this.balance -= 2.50;
    }
  }

  public void payGourmet() {
    if (this.balance >= 4.0) {
      this.balance -= 4.0;
    }
  }

  public String toString() {
    return "The card has " + this.balance + " euros";
  }
}
