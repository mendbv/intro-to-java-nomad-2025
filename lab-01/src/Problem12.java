void main() {
    double distanceMiles = 24.0;
    double hours = 1.0;
    double minutes = 40.0;
    double seconds = 35.0;

    double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);
    double distanceKilometers = distanceMiles * 1.6;
    double averageSpeedKph = distanceKilometers / totalHours;

    System.out.println(averageSpeedKph);
}