package day31_arrays;

public class AWS {

    // app and we want to deploy on multiple zones

    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(",");

        for(String eachZone : allZones){
            System.out.println(app + " is deploying on " + eachZone);
        }

//        for(int i = 0; i < allZones.length; i++){
//            System.out.println(app + " is deploying on " + allZones[i]);
//        }

    }

}
