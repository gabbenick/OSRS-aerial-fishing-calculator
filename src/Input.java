import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] ReturningInput() {
        System.out.println("Enter your fishing level: ");
        int fishingLvl = scanner.nextInt();
        System.out.println("Enter your hunter level: ");
        int hunterLvl = scanner.nextInt();
        if (fishingLvl < 0 || hunterLvl < 0 ||
                fishingLvl > 100 || hunterLvl > 100) {
            System.out.println("Invalid level.");
            System.exit(1);
        }
        System.out.println("Enter the fish per hour: ");
        int fishPerHour = scanner.nextInt();

        int[] returnInput = { fishingLvl, hunterLvl, fishPerHour };

        return returnInput;
    }
}
