public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    // TODO: define the 'expectedMinutesInOven()' method
    public int remainingMinutesInOven(int inputTime) {
        return expectedMinutesInOven() - inputTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return PREPARATION_TIME_PER_LAYER * numberOfLayers;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int totalTimeInMinutes(int preparationTime, int ovenTime) {
        return preparationTimeInMinutes(preparationTime) + ovenTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
}
