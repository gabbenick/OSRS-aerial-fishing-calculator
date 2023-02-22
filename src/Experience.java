public class Experience {

    public void Calculator(int[] fishData) {

        double totalFishingExp = (((double) fishData[0] * 11.5) + ((double) fishData[1] * 40.0)
                + ((double) fishData[2] * 65.0) + ((double) fishData[3] * 100.0));

        double totalHunterExp = (((double) fishData[0] * 16.5) + ((double) fishData[1] * 45.0)
                + ((double) fishData[2] * 90.0) + ((double) fishData[3] * 130.0));

        System.out.println("The amount of fishing EXP: " + totalFishingExp);
        System.out.println("The amount of hunter EXP: " + totalHunterExp);
        System.out.println("The total exp is: " + (totalFishingExp + totalHunterExp));
    }
}
