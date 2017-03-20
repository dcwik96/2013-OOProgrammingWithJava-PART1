
public class Reformatory {

  private int counterWeightsMeasured;

  public int weight(Person person) {
    // return the weight of the person
    this.counterWeightsMeasured++;
    return person.getWeight();
  }

  public void feed(Person person) {
    int incrementation = person.getWeight() + 1;
    person.setWeight(incrementation);
  }
  
  public int totalWeightsMeasured(){
    return counterWeightsMeasured;
  }

}
