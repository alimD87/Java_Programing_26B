package day39_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

        Integer i = 500;
//        nums.remove(500); this will go out of bounds because 500 is read as an int number, and that is not a valid index
        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200));
        System.out.println(nums);

        nums.remove( (Integer)800 );
        System.out.println(nums);


    }
}
