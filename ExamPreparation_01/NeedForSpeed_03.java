package ExamPreparation_01;

import java.util.*;

public class NeedForSpeed_03 {
    /*You have just bought the latest and greatest computer game – Need for Seed III. Pick your favorite cars and drive them all you want! We know that you can't wait to start playing.
    On the first line of the standard input, you will receive an integer n – the number of cars that you can obtain. On the next n lines, the cars themselves will follow with
    their mileage and fuel available, separated by "|" in the following format:
    "{car}|{mileage}|{fuel}"
    Then, you will be receiving different commands, each on a new line, separated by " : ", until the "Stop" command is given:
· "Drive : {car} : {distance} : {fuel}":
    o You need to drive the given distance, and you will need the given fuel to do that. If the car doesn't have enough fuel, print: "Not enough fuel to make that ride"
    o If the car has the required fuel available in the tank, increase its mileage with the given distance, decrease its fuel
    with the given fuel, and print: "{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
    o You like driving new cars only, so if a car's mileage reaches 100 000 km, remove it from the collection(s) and print: "Time to sell the {car}!"
· "Refuel : {car} : {fuel}":
    o Refill the tank of your car.
    o Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank, take only what is required to fill it up.
    o Print a message in the following format: "{car} refueled with {fuel} liters"
· "Revert : {car} : {kilometers}":
    o Decrease the mileage of the given car with the given kilometers and print the kilometers you have decreased it with in the following format: "{car} mileage decreased by {amount reverted} kilometers"
    o If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and DO NOT print anything.
    Upon receiving the "Stop" command, you need to print all cars in your possession in the following format: "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        int countCars = Integer.parseInt(scanner.nextLine());
        for (int car = 1; car <= countCars; car++) {
            String [] data = scanner.nextLine().split("\\|");
            String carModel = data[0]; //модел на колата
            int mileage = Integer.parseInt(data[1]); //изминати км
            int fuel = Integer.parseInt(data[2]); //налично гориво

            carsMap.putIfAbsent(carModel, new ArrayList<>());
            carsMap.get(carModel).add(0, mileage);
            carsMap.get(carModel).add(1, fuel);
        }


        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            if (input.contains("Drive")) {
                String car = input.split(" : ")[1]; //коя кола искаме да караме
                int distance = Integer.parseInt(input.split(" : ")[2]); //колко км искаме да я караме
                int consumedFuel = Integer.parseInt(input.split(" : ")[3]); //колко гориво ще изразходим

                //1. имаме достатъчно гориво за каране
                int currentFuel = carsMap.get(car).get(1); //текущо количество на гориво в колата
                int currentKm = carsMap.get(car).get(0); //текущи км на колата

                if (currentFuel >= consumedFuel) {
                    //отиваме на пътешествие
                    carsMap.get(car).set(1, currentFuel - consumedFuel);
                    carsMap.get(car).set(0, currentKm + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, consumedFuel);
                } else {
                    //нямаме достатъчно количество за каране currentFuel < consumedFuel
                    System.out.println("Not enough fuel to make that ride");
                }

                //проверка дали я премахваме
                if (carsMap.get(car).get(0) >= 100000) {
                    //колата е стара -> продаваме
                    System.out.println("Time to sell the " + car + "!");
                    carsMap.remove(car);
                }

            } else if (input.contains("Refuel")) {
                String carToRefill = input.split(" : ")[1]; //кола за зареждане
                int fuelToRefill = Integer.parseInt(input.split(" : ")[2]); //колко литра зареждаме

                int currentFuel = carsMap.get(carToRefill).get(1);//текущо количество гориво
                if (currentFuel + fuelToRefill > 75) {
                    //max = 75 и го слагаме в колата
                    carsMap.get(carToRefill).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", carToRefill, 75 - currentFuel);
                } else {
                    //не достигаме 75 литра
                    carsMap.get(carToRefill).set(1, currentFuel + fuelToRefill);
                    System.out.printf("%s refueled with %d liters%n", carToRefill, fuelToRefill);
                }
            } else if (input.contains("Revert")) {
                String carToRevert = input.split(" : ")[1]; //кола, която ще модифицираме
                int kmRevert = Integer.parseInt(input.split(" : ")[2]); //км за модификация
                int currentKm = carsMap.get(carToRevert).get(0); //текущи км на колата

                int kmAfterRevert = currentKm - kmRevert; //км след връщането
                if (kmAfterRevert < 10000) {
                    kmAfterRevert = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", carToRevert, kmRevert);
                }
                carsMap.get(carToRevert).set(0, kmAfterRevert);
            }
            input = scanner.nextLine();
        }
        carsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        });
    }
}
