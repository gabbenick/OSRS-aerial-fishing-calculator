import java.util.Scanner;

public class Fish {

    private Scanner scanner;

    public Fish(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] Calculator() {
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

        float x = (fishingLvl * 2 + hunterLvl) / 3;

        int greaterSiren = 0;
        int mottledEel = 0;
        int commonTench = 0;
        int blueGill = 0;

        for (int i = 0; i < fishPerHour; i++) {
            Double random = (Double) (Math.random() * (x - 1));
            random = Math.round(random * 100.0) / 100.0;

            if (random > 82) {
                greaterSiren++;
            } else if (random > 67) {
                mottledEel++;
            } else if (random > 52) {
                commonTench++;
            } else {
                blueGill++;
            }
        }

        System.out.println("The player will get " + greaterSiren + " Greater Sirens. \nThe player will get "
                + mottledEel + " Mottled Eel. \nThe player will get " + commonTench
                + " Common Tench. \nThe player will get " + blueGill + " Blue Gill.");

        int[] fishCount = { greaterSiren, mottledEel, commonTench, blueGill };

        return fishCount;
    }

}

/*
 * A fórmula é escolher um número aleatório de 0 até x-1.
 * onde x = (fishing lvl * 2 + hunter lvl) / 3.
 * se o número é > 82 o jogador recebe um greater siren,
 * se > 67 o jogador recebe uma mottled eel, se > 52
 * o jogador recebe uma common tench. se < 52 recebe um
 * bluegill.
 */