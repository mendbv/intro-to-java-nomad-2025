void main() {
    double distanceKm = 14.0;
    double minutes = 45.0;
    double seconds = 30.0;
    double totalHours = (minutes + seconds / 60.0) / 60.0;
    double distanceMiles = distanceKm / 1.6;
    double averageSpeedMph = distanceMiles / totalHours;
    System.out.println("Average speed is: "+averageSpeedMph);
}