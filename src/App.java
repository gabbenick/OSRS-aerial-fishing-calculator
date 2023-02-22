import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Fish fish = new Fish(scanner);
        int[] fishCount = fish.Calculator();

        Experience experience = new Experience();
        experience.Calculator(fishCount);

        scanner.close();
    }
}
