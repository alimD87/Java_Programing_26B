package day10_scanner;

import java.util.Scanner;

public class Apartment {
    /*
    	Create the variables with the most appropriate datatype:

		- address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheelchair access, number of review stars (out of 5)

		- Create these variables and use previous variables to get the values

			- monthly rent after 3 years (discount 10% off original rent) -> * 0.9
			- monthly rent after 6 years (discount 20% off original rent)-> 0.8
			- Average number of residents per unit (total residents / number of units)
			- Average number of parking spots per unit ( parking spots / units)
			- Average number of units per floor ( units / number of floors)

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String address, nameOfOwner, ownersPhoneNumber, allInfo;
        int numberOfUnits, numberOfWasherAndDryer, lengthOfLease, totalNumberOfResidents, numberOfFloors, numberOfParkingSpots;
        double avgSizeOfUnit, monthlyRent, numberOfStars;
        boolean allowsPets, hasPool, nearGasStation, hasBasement, unitsAvailable, hasAirConditioning, wheelChairAccessibility;

        System.out.println("Please enter the address");
        address = input.nextLine();
        allInfo = "Address: " + address;

        System.out.println("Please enter the name of the owner");
        nameOfOwner = input.nextLine();
        allInfo += "\nName of Owner: " + nameOfOwner;

        System.out.println("Please enter " + nameOfOwner + "'s phone number");
        ownersPhoneNumber = input.nextLine();
        allInfo += "\n" + nameOfOwner + "'s phone number: " + ownersPhoneNumber;

        System.out.println("Please enter the number of units");
        numberOfUnits = input.nextInt();
        allInfo += "\nNumber of units: " + numberOfUnits;

        System.out.println("Please enter the number of washers and dryers");
        numberOfWasherAndDryer = input.nextInt();
        allInfo += "\nNumber of washer and dryers: " + numberOfWasherAndDryer;

        System.out.println("Please enter the length of the lease");
        lengthOfLease = input.nextInt();
        allInfo += "\nLength of the leases:  " + lengthOfLease;

        System.out.println("Please enter the total number of residents");
        totalNumberOfResidents = input.nextInt();
        allInfo += "\nTotal Number of residents: " + totalNumberOfResidents;

        System.out.println("Please enter the number of floors");
        numberOfFloors = input.nextInt();
        allInfo += "\nNumber of floors: " + numberOfFloors;

        System.out.println("Please enter the number of parking spaces");
        numberOfParkingSpots = input.nextInt();
        allInfo += "\nNumber of spaces: " + numberOfParkingSpots;

        System.out.println("Please enter the average size of the units");
        avgSizeOfUnit = input.nextDouble();
        allInfo += "\nAverage size of units: " + avgSizeOfUnit;

        System.out.println("Please enter the monthly rent");
        monthlyRent = input.nextDouble();
        allInfo += "\nMonthly Rent: " + monthlyRent;

        System.out.println("Please enter the number of stars from 1.0-5.0");
        numberOfStars = input.nextDouble();
        allInfo += "\nNumber of stars: " + numberOfStars;

        System.out.println("Does the apartment allows pets?");
        allowsPets = input.nextBoolean();
        allInfo += "\nDo the apartments allow pets: " + allowsPets;

        System.out.println("Does the apartment have a pool?");
        hasPool = input.nextBoolean();
        allInfo += "\nDo the apartment have a pool: " + hasPool;

        System.out.println("Is the apartment near a gas station?");
        nearGasStation = input.nextBoolean();
        allInfo += "\nNear gas station: " + nearGasStation;

        System.out.println("Does the apartment have a basement?");
        hasBasement = input.nextBoolean();
        allInfo += "\nThere is a basement: " + hasBasement;

        System.out.println("Is there any units available?");
        unitsAvailable = input.nextBoolean();
        allInfo += "\nAny units available for rent: " + unitsAvailable;

        System.out.println("Does the apartment have air conditioning?");
        hasAirConditioning = input.nextBoolean();
        allInfo += "\nIs there air conditioning: " + hasAirConditioning;

        System.out.println("Does the apartment have wheel chair accessibility?");
        wheelChairAccessibility = input.nextBoolean();
        allInfo += "\nIs there air conditioning: " + wheelChairAccessibility;

        allInfo += "\nExtra information: ";

        double rateAfter3Years = monthlyRent * 0.9; //rateAfter3Years = monthlyRent - (monthlyRent * 0.1)
        allInfo += "\nRate after 3 years: " + rateAfter3Years;

        double rateAfter6Years = monthlyRent * 0.8;
        allInfo += "\nRate after 6 years: " + rateAfter3Years;

        int avgNumberOfResidentsPerUnit = totalNumberOfResidents / numberOfUnits;
        allInfo += "\nAverage number of residents per unit: " + avgNumberOfResidentsPerUnit;

        int avgNumberOfParkingSpotPerUnit = numberOfParkingSpots / numberOfUnits;
        allInfo += "\nAverage number of parking spots per unit: " + avgNumberOfParkingSpotPerUnit;

        int avgNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;
        allInfo += "\nAverage number of units per floor: " + avgNumberOfUnitsPerFloor;

        System.out.println("\n\tOverview of Apartments: \n" + allInfo);

    }
}


/*

    Please enter the address
    240402 Oak Drive
    Please enter the name of the owner
    James Bond
    Please enter James Bond's phone number
    (203) 919 4867
    Please enter the number of units
    30
    Please enter the number of washers and dryers
    10
    Please enter the length of the lease
    2
    Please enter the total number of residents
    80
    Please enter the number of floors
    4
    Please enter the number of parking spaces
    55
    Please enter the average size of the units
    500
    Please enter the monthly rent
    800
    Please enter the number of stars from 1.0-5.0
    4.8
    Does the apartment allows pets?
    true
    Does the apartment have a pool?
    true
    Is the apartment near a gas station?
    true
    Does the apartment have a basement?
    false
    Is there any units available?
    false
    Does the apartment have air conditioning?
    true
    Does the apartment have wheel chair accessibility?
    true

        Overview of Apartments:
    Address: 240402 Oak Drive
    Name of Owner: James Bond
    James Bond's phone number: (203) 919 4867
    Number of units: 30
    Number of washer and dryers: 10
    Length of the leases:  2
    Total Number of residents: 80
    Number of floors: 4
    Number of spaces: 55
    Average size of units: 500.0
    Monthly Rent: 800.0
    Number of stars: 4.8
    Do the apartments allow pets: true
    Do the apartment have a pool: true
    Near gas station: true
    There is a basement: false
    Any units available for rent: false
    Is there air conditioning: true
    Is there air conditioning: true
    Extra information:
    Rate after 3 years: 720.0
    Rate after 6 years: 720.0
    Average number of residents per unit: 2
    Average number of parking spots per unit: 1
    Average number of units per floor: 7

 */