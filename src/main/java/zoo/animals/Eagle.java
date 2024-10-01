package zoo.animals;

import zoo.creation.Animal;
import zoo.interfaces.Carnivore;
import zoo.interfaces.Flying;

public class Eagle extends Animal implements Flying, Carnivore {
  public Eagle(String name) {
    super(name);
  }

  @Override
  public void eatMeat(String meat) {
    System.out.println(name + " ест " + meat);
  }

  @Override
  public void fly() {
    System.out.println(name + " летит");
  }
}