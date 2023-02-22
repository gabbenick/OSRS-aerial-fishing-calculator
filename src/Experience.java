public class Experience {

    public void Calculator(int[] fishCount) {

        double totalFishingExp = (((double) fishCount[0] * 11.5) + ((double) fishCount[1] * 40.0)
                + ((double) fishCount[2] * 65.0) + ((double) fishCount[3] * 100.0));

        double totalHunterExp = (((double) fishCount[0] * 16.5) + ((double) fishCount[1] * 45.0)
                + ((double) fishCount[2] * 90.0) + ((double) fishCount[3] * 130.0));

        System.out.println("The amount of fishing EXP: " + totalFishingExp);
        System.out.println("The amount of hunter EXP: " + totalHunterExp);
        System.out.println("The total exp is: " + (totalFishingExp + totalHunterExp));
    }
}
