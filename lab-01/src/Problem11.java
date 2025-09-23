void main() {
    int startingPopulation = 312032486;
    int secondsInYear = 365 * 24 * 60 * 60;

    int annualBorn = secondsInYear/7;
    int annualDeaths = secondsInYear/13;
    int annualImmigrants = secondsInYear/45;

    int populationGrowth = annualBorn - annualDeaths + annualImmigrants;

    int currentPopulation = startingPopulation;

    for (int i=0; i < 5; i++){
        currentPopulation += startingPopulation;
        System.out.println("Population after " + (i+1) + " year(s): " + (int) currentPopulation);
    }
}