
public class CashRegister {

  private double cashInRegister;
  private int economicalSold;
  private int gourmetSold;

  public CashRegister() {
    // at start the register has 1000 euros
    this.cashInRegister = 1000.0;
  }

  public double payEconomical(double cashGiven) {
    double ecoLunchPrice = 2.50;
    if (cashGiven >= ecoLunchPrice) {
      this.cashInRegister += ecoLunchPrice;
      this.economicalSold++;
      return cashGiven - ecoLunchPrice;
    } else {
      return cashGiven;
    }

    // price of the economical lunch is 2.50 euros
    // if the given cash is at least the price of the lunch:
    //    the price of lunch is added to register
    //    the amount of sold lunch is incremented by one
    //    method returns cashGiven - lunch price 
    // if not enough money given, all is returned and nothing else happens        
  }

  public boolean payEconomical(LyyraCard card) {
    double ecoLunchPrice = 2.50;
    if (card.balance() >= ecoLunchPrice) {
      this.economicalSold++;
      card.pay(ecoLunchPrice);
      return true;
    } else {
      return false;
    }
  }

  public boolean payGourmet(LyyraCard card) {
    double gourmetLunchPrice = 4.0;
    if (card.balance() >= gourmetLunchPrice) {
      this.gourmetSold++;
      card.pay(gourmetLunchPrice);
      return true;
    } else {
      return false;
    }
  }

  public double payGourmet(double cashGiven) {
    double gourmetLunchPrice = 4.0;
    if (cashGiven >= gourmetLunchPrice) {
      this.cashInRegister += gourmetLunchPrice;
      this.gourmetSold++;
      return cashGiven - gourmetLunchPrice;
    } else {
      return cashGiven;
    }
    // price of the gourmet lunch is 4.00 euros
    // if the given cash is at least the price of the lunch:
    //    the price of lunch is added to register
    //    the amount of sold lunch is incremented by one
    //    method returns cashGiven - lunch price 
    // if not enough money given, all is returned and nothing else happens
  }

  public void loadMoneyToCard(LyyraCard card, double sum) {
    if (sum > 0) {
      card.loadMoney(sum);
      this.cashInRegister += sum;
    }
  }

  public String toString() {
    return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
  }
}
