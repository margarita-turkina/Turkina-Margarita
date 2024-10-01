package zoo.animals;

import zoo.creation.Animal;
import zoo.interfaces.Terrestrial;
import zoo.interfaces.Carnivore;

public class Tiger extends Animal implements Terrestrial, Carnivore {
  public Tiger(String name) {
    super(name);
  }

  @Override
  public void eatMeat(String meat) {
    if (meat.equals("говядина")) {
      System.out.println(name + " ест говядину");
      return;
    }
      System.out.println(name + " не ест " + meat);
  }

  @Override
  public void walk() {
    System.out.println(name + " идет");
  }
}