package io.vieira.clockangle;

public class ClockAngleCalculator {

    public static int calculateAngle(int hours, int minutes) {
        final var minutesAngle = angleForMinutes(minutes);
        final var hoursAngle = angleForHours(hours);

        final var cumulatedAngle = Math.abs(minutesAngle - hoursAngle);
        return cumulatedAngle > 180 ? 360 - cumulatedAngle : cumulatedAngle;
    }

    private static int angleForMinutes(int minutes) {
        return minutes * 6;
    }

    private static int angleForHours(int hours) {
        return (hours > 12 ? hours % 12 : hours) * 30;
    }
}
