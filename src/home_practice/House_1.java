package Home_Practice;


//reate a class House
//    create a main method
//
//    - Each the datatype you feel is most appropriate for each variable.
//
//    - Create the following variables:
//        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
//
//    - Print each variable with a message with the value
//        Ex: The number of bedrooms is: 4
//            The number of bathrooms is: 3

public class House_1 {
    public static void main(String[] args) {

        String houseType = "singleHome";
        int numberOfBedrooms = 4;
        double numberOfBathrooms = 2.5;
        short numberOfKitchens = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = false;
        int costOfTheHouse = 300000;
        short address1 = 505;
        String address2 = "Walker ave";
        String address3 = "Ewing, NJ";
        short zipcode = 18628;
        boolean  isAParkNearBy = false;
        double ratingOfTheSchool = 4.5;

        System.out.println(" I have a " + houseType + " it has " + numberOfBedrooms + " bed rooms and " + numberOfBathrooms + " bathroom and " + numberOfKitchens + " kitchen, also basement " + isThereABasement + " attic " + isThereAnAttic + " swimming pool " + isThereAPool + " is your house for sale " + isTheHouseForSale + "\n" + "How much does it cost " + costOfTheHouse + "  what is your address " + address1 + " " + address2 + " " + address3 + " " + zipcode + " do you have a park close by " + isAParkNearBy + " what is the rating of the schools " + ratingOfTheSchool + " I love my house ");


    }
}
