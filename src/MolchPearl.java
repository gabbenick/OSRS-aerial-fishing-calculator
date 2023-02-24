import java.text.DecimalFormat;

public class MolchPearl {
    public void Calculator(int[] fishData, int[] returnInput) {
        float x = fishData[4];
        int fishPerHour = returnInput[2];

        float molchPearlChance = (1 / (100 - ((x - 40) * 25 / 59)));
        float molchPearlHour = molchPearlChance * fishPerHour;

        float timeToGetAllRewards = 1370 / molchPearlHour;

        DecimalFormat result3 = new DecimalFormat("0.000");
        DecimalFormat result2 = new DecimalFormat("0.0");

        System.out
                .println("The percentage of getting a Molch Pearl is: " + result3.format(molchPearlChance * 100) + " %"
                        + "\nThe molch pearl expected per hour is given by: " + result2.format(molchPearlHour)
                        + "\nThe time to get all rewards is: " + result2.format(timeToGetAllRewards) + " Hours");
    }
}