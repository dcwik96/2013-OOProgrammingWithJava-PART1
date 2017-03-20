/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dcwik
 */
public class Counter {

  public int value;
  public boolean check;

  public Counter(int startingValue, boolean check) {
    this.value = startingValue;
    this.check = check;
  }

  public Counter(int startingValue) {
    this(startingValue, false);
  }

  public Counter(boolean check) {
    this(0, check);
  }

  public Counter() {
    this(0, false);
  }

  public int value() {
    return this.value;
  }

  public void increase(int increaseAmount) {
    if (increaseAmount > 0) {
      this.value += increaseAmount;
    }
  }

  public void increase() {
    this.increase(1);
  }

  public void decrease(int decreaseAmount) {
    if (decreaseAmount > 0) {
      if (check) {
        for (int i = 0; i < decreaseAmount; i++) {

          if (Check(this.value)) {
            this.value --;
          }
        }
      } else {
        this.value -= decreaseAmount;
      }
    }
  }

  public void decrease() {
    this.decrease(1);
  }

  public static boolean Check(int value) {
    if (value > 0) {
      return true;
    }
    return false;
  }

}
