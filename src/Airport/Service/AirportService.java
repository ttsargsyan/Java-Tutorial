package Airport.Service;


import Airport.Model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter the name of the plane you want to create: ");
        plane.setName(s.nextLine());
        System.out.println("Enter the release date of the plane you want to create: ");
        plane.setReleaseDate(s.nextInt());
        System.out.println("Enter the number of hours the plane was in air: ");
        plane.setHoursInAir(s.nextInt());
       //plane.setMilitary();
        return plane;
    }

    ;

    public void printPlaneInfo(Plane plane) {
        System.out.println("Name: " + plane.getName() + "Date: " + plane.getReleaseDate());

    }
}
