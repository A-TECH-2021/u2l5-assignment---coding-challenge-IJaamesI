package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        // create and open scanner
        Scanner scanner = new Scanner(System.in);

        // create variables
        double latitudeStart;
        double longitudeStart;
        double latitudeEnd;
        double longitudeEnd;

        // get inputs
        System.out.println("Enter the latitude of the starting location: ");
        latitudeStart = scanner.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        longitudeStart = scanner.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        latitudeEnd = scanner.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        longitudeEnd = scanner.nextDouble();

        // make GeoLocations for start and end
        GeoLocation pos1 = new GeoLocation(latitudeStart, longitudeStart);
        GeoLocation pos2 = new GeoLocation(latitudeEnd, longitudeEnd);

        // go find distance between the two
        double result = pos1.distanceFrom(pos2);

        // return distance
        System.out.print("The distance is " + result + " miles.");


        // close scanner
        scanner.close();
    }
}
