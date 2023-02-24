import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Input input = new Input(scanner);
        int[] returnInput = input.ReturningInput();

        Fish fish = new Fish();
        int[] fishData = fish.Calculator(returnInput);
        fish.Percentage(fishData, returnInput);

        Experience experience = new Experience();
        experience.Calculator(fishData);

        MolchPearl molchPearl = new MolchPearl();
        molchPearl.Calculator(fishData, returnInput);

        scanner.close();
    }
}
