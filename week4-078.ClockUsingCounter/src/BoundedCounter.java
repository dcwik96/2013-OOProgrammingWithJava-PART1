/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dcwik
 */
public class BoundedCounter {

  private int value;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
    this.value = 0;
  }

  public void next() {
    if (this.value >= upperLimit) {
      this.value = 0;
    } else {
      this.value++;
    }
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    if (value >= 0 && value <= upperLimit) {
      this.value = value;
    }
  }

  public String toString() {
    if (this.value > 9) {
      return "" + value;
    }
    return "0" + value;
  }
}
