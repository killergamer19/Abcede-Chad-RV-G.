import java.util.Scanner;

class Program {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num;

    Animal animal = new Animal();
    Animal a = new Wolf();
    Animal b = new Pig();
    Animal c = new Lion();
    Animal d = new Fox();

    System.out.println("What does the animal say");
    System.out.println("Select an animal:");
    System.out.println("1. Wolf");
    System.out.println("2. Pig");
    System.out.println("3. Lion");
    System.out.println("4. Fox");

    System.out.print(" Enter selected number: ");
    num = s.nextInt();

    switch (num) {
    case 1:
      System.out.println("Animal: 1");
      a.animalSound();
      break;
    case 2:
      System.out.println("Animal: 2");
      b.animalSound();
      break;
    case 3:
      System.out.println("Animal: 3");
      c.animalSound();
      break;
    case 4:
      System.out.println("Animal: 4");
      d.animalSound();
      break;

    }

  }
}

class Animal {
  public void animalSound() {
    System.out.println(".....");
  }
}
class Wolf extends Animal {
  public void animalSound() {
    System.out.println("Awoo Awoo Awoo!");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("Oink Oink Oink!");
  }
}

class Lion extends Animal {
  public void animalSound() {
    System.out.println("Rawr Rawr Rawr!");
  }
}

class Fox extends Animal {
  public void animalSound() {
    System.out.println("Ding Ding Ding!");
  }
}