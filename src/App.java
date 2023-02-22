import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Fish fish = new Fish(scanner);
        int[] fishData = fish.Calculator();
        fish.Percentage(fishData);

        Experience experience = new Experience();
        experience.Calculator(fishData);

        scanner.close();
    }
}
