
public class Money {

  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {

    if (cents > 99) {
      euros += cents / 100;
      cents %= 100;
    }

    this.euros = euros;
    this.cents = cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  public Money plus(Money added) {
    int centsAdded = this.cents + added.cents;
    int eurosAdded = this.euros + added.euros;
    if (centsAdded > 99) {
      eurosAdded += centsAdded / 100;
      centsAdded %= 100;
    }
    Money result = new Money(eurosAdded, centsAdded);
    return result;
  }
  
  public Money minus(Money decremented){
    int centsAfterSub = this.cents - decremented.cents;
    int eurosAfterSub = this.euros - decremented.euros;
    if (centsAfterSub < 0) {
      centsAfterSub = 100 - (-centsAfterSub);
      eurosAfterSub--;
    }
    if (eurosAfterSub < 0) {
      centsAfterSub = 0;
      eurosAfterSub = 0;
    }
    Money result = new Money(eurosAfterSub,centsAfterSub);
    return result;
  }

  public boolean less(Money compared) {
    if (this.euros < compared.euros) {
      return true;
    } else if (this.euros == compared.euros && this.cents < compared.cents) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    String zero = "";
    if (cents < 10) {
      zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }

}
