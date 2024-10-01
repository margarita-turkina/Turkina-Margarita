package zoo.animals;

import zoo.creation.Animal;
import zoo.interfaces.Aquatic;
import zoo.interfaces.Carnivore;

  public class Dolphin extends Animal implements Aquatic, Carnivore {
    public Dolphin(String name) {
      super(name);
    }

    @Override
    public void eatMeat(String meat) {
      if (meat.equals("рыба")) {
        System.out.println(name + " ест рыбу");
        return;
      }
        System.out.println(name + " не ест " + meat);

    }

    @Override
    public void swim() {
      System.out.println(name + " плывет");
    }
  }