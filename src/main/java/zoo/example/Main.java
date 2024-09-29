package zoo.example;

import zoo.animals.*;

public class Main {
  public static void main(String[] args) {
    Dolphin dolphin = new Dolphin("Дельфин");
    Eagle eagle = new Eagle("Орел");
    Camel camel = new Camel("Верблюд");
    Horse horse = new Horse("Лошадь");
    Tiger tiger = new Tiger("Тигр");

    tiger.walk();
    tiger.eatMeat("говядина");
    tiger.eatMeat("рыба");

    horse.walk();
    horse.eatGrass();

    eagle.fly();
    eagle.eatMeat("говядина");

    dolphin.swim();
    dolphin.eatMeat("рыба");

    camel.walk();
    camel.eatGrass();
  }
}