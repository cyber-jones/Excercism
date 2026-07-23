public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'expectedMinutesInOven()' method
    public int remainingMinutesInOven(int inputTime) {
        return expectedMinutesInOven() - inputTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return 2 * numberOfLayers;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int totalTimeInMinutes(int preparationTime, int ovenTime) {
        return preparationTimeInMinutes(preparationTime) + ovenTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
}
