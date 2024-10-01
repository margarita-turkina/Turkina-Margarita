package zoo.animals;

import zoo.creation.Animal;
import zoo.interfaces.Herbivore;
import zoo.interfaces.Terrestrial;


public class Horse extends Animal implements Terrestrial, Herbivore {
  public Horse(String name) {
    super(name);
  }

  @Override
  public void eatGrass() {
    System.out.println(name + " ест траву");
  }

  @Override
  public void walk() {
    System.out.println(name + " идет");
  }
}
