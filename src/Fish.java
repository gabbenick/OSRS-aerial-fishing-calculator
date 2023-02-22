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

        int blueGill = 0;
        int commonTench = 0;
        int mottledEel = 0;
        int greaterSiren = 0;

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

        System.out.println("The time to get a golden tench is: " +
                (20000 / fishPerHour) + " hours.");

        int[] fishData = { blueGill, commonTench, mottledEel, greaterSiren, fishPerHour };

        return fishData;
    }

    public void Percentage(int[] fishData) {
        double totalFish = (double) fishData[4];
        double perBlueGill = ((double) fishData[0] / totalFish) * 100.0;
        double perCommonTench = ((double) fishData[1] / totalFish) * 100.0;
        double perMottledEel = ((double) fishData[2] / totalFish) * 100.0;
        double perGreaterSiren = ((double) fishData[3] / totalFish) * 100.0;

        System.out.println("Greater Sirens Percentage: " + perGreaterSiren + " %");
        System.out.println("Mottled Eel: Percentage: " + perMottledEel + " %");
        System.out.println("Common Tench: Percentage: " + perCommonTench + " %");
        System.out.println("Blue Gill: Percentage: " + perBlueGill + " %");
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