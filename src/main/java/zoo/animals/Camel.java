package zoo.animals;

import zoo.creation.Animal;
import zoo.interfaces.Herbivore;
import zoo.interfaces.Terrestrial;

public class Camel extends Animal implements Terrestrial, Herbivore {
  public Camel(String name) {
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