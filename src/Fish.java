import java.text.DecimalFormat;

public class Fish {

    public int[] Calculator(int[] returnInput) {

        int fishingLvl = returnInput[0];
        int hunterLvl = returnInput[1];
        int fishPerHour = returnInput[2];

        int x = (fishingLvl * 2 + hunterLvl) / 3;

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

        int[] fishData = { blueGill, commonTench, mottledEel, greaterSiren, x };

        return fishData;
    }

    public void Percentage(int[] fishData, int[] returnInput) {
        double totalFish = (double) returnInput[2];

        DecimalFormat result = new DecimalFormat("0.00");

        double perBlueGill = ((double) fishData[0] / totalFish) * 100.0;
        double perCommonTench = ((double) fishData[1] / totalFish) * 100.0;
        double perMottledEel = ((double) fishData[2] / totalFish) * 100.0;
        double perGreaterSiren = ((double) fishData[3] / totalFish) * 100.0;

        System.out.println("Greater Sirens Percentage: " + result.format(perGreaterSiren)
                + " %\nMottled Eel: Percentage: " + result.format(perMottledEel) + " %\nCommon Tench: Percentage: "
                + result.format(perCommonTench) + " %\nBlue Gill: Percentage: " + result.format(perBlueGill) + " %");
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