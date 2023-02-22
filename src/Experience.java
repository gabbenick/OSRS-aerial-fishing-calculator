public class Experience {

    public void Calculator(int[] fishCount) {

        double totalFishingExp = (((double) fishCount[0] * 11.5) + ((double) fishCount[1] * 40.0)
                + ((double) fishCount[2] * 65.0) + ((double) fishCount[3] * 100.0));

        System.out.println("The amount of fishing EXP: " + totalFishingExp);
    }
}
