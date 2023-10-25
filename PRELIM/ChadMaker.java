import java.util.InputMismatchException;
import java.util.Scanner;

public class ChadMaker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("CHAD ROUTE MAKER");
    System.out.println("");
    System.out.println("Hello! This program will help you find the optimal route to Moalboal...");

    float speed = getSpeedFromUser(scanner);

    Route route = new Route(speed);
    route.getRouteRecommendation();
    scanner.close();
  }

  static float getSpeedFromUser(Scanner scanner) {
    float speed = 0;
    boolean validInput = false;

    while (!validInput) {
      try {
        System.out.print("Enter your speed (km/h): ");
        speed = scanner.nextFloat();
        validInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid numeric value for speed.");
        scanner.next(); // Clear the invalid input
      }
    }

    return speed;
  }

  static class Route {
    private float speed;

    public Route(float speed) {
      this.speed = speed;
    }

    public void getRouteRecommendation() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Is the road to Barili (Route 4) obstructed?[Yes/No]: ");
      char answer = scanner.next().charAt(0);
      answer = Character.toUpperCase(answer);

      if (answer == 'Y') {
        System.out.print("Is the way to Dumajug (Route 4.2.1) obstructed?[Yes/No]: ");
        char answer2 = scanner.next().charAt(0);
        answer2 = Character.toUpperCase(answer2);
        if (answer2 == 'Y') {
          findAlternativeRoute();
        } else {
          useSecondaryRoute();
        }
      } else {
        useDefaultRoute();
      }
      scanner.close();
    }

    public void useDefaultRoute() {
      System.out.println("");
      System.out.println("Recommended Route: ");
      System.out.println("Cebu City --- Starting Point");
      System.out.println("Minglanilla --- Route 1");
      System.out.println("San Fernando --- Route 2");
      System.out.println("Carcar City --- Route 3");
      System.out.println("Barili --- Route 4");
      System.out.println("Dumajug --- Route 4.2.1");
      System.out.println("Alcantara --- Route 4.2.2");
      System.out.println("Moalboal --- Destination");
      calculateArrivalTime(95.2f);
    }

    public void useSecondaryRoute() {
      System.out.println("");
      System.out.println("Recommended Route: ");
      System.out.println("Cebu City --- Starting Point");
      System.out.println("Minglanilla --- Route 1");
      System.out.println("San Fernando --- Route 2");
      System.out.println("Carcar City --- Route 3");
      System.out.println("Sibonga --- Route 4.2");
      System.out.println("Dumajug --- Route 4.2.1");
      System.out.println("Alcantara --- Route 4.2.2");
      System.out.println("Moalboal --- Destination");
      calculateArrivalTime(100.0f);
    }

    public void findAlternativeRoute() {
      System.out.println("");
      System.out.println("Recommended Route: ");
      System.out.println("Cebu City --- Starting Point");
      System.out.println("Minglanilla --- Route 1");
      System.out.println("San Fernando --- Route 2");
      System.out.println("Carcar City --- Route 3");
      System.out.println("Argao --- Route 5");
      System.out.println("Ronda --- Route 5.1");
      System.out.println("Alcantara --- Route 5.2");
      System.out.println("Moalboal --- Destination");
      calculateArrivalTime(102.0f);
    }

    private void calculateArrivalTime(float distance) {
      System.out.println("");
      System.out.println("Calculating Arrival Time...");
      float time = distance / speed;
      System.out.println("Estimated arrival time: " + time + " hours");
    }
  }
}
