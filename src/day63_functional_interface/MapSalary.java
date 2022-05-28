package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 124000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 4245250.23);
        map.put("Elza", 1231312.1);
        map.put("Peter", 131234.0);

        String nameForLargest = "";
        double maxSalary = 0.0;

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE; // the biggest possible double value is a good starting value

        for(String key : map.keySet()){ // iterate through the keys

            double value = map.get(key); // we use get method to read the values by the key

            if(value > maxSalary){
                nameForLargest = key;
                maxSalary = value;
            }

            if(value < lowestSalary){
                nameForLowest = key;
                lowestSalary = value;
            }

        }

        System.out.println("Max Salary: " + nameForLargest + " - $" + maxSalary);
        System.out.println("Smallest Salary: " + nameForLowest + " - $" + lowestSalary);

        System.out.println();

        int counter = 0;

        for(double value : map.values()){
            if(value >= 120_000 && value <= 150_000){
                counter++;
            }
        }

        System.out.println("Number over 120k and less than 150k: "+ counter);
        System.out.println();

        for(String name : map.keySet()){
            if(map.get(name) <= 218_000){
                System.out.println(name);
            }
        }
        System.out.println();

        for(String key : map.keySet()){
            map.put(key, map.get(key) + 10_000);
        }
        System.out.println(map);
    }
}
/*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */
