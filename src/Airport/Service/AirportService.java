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
        System.out.println("Is Military or not: ");
        plane.setMilitary(s.next().charAt(0) == 'Y');
        return plane;
    }


    public void printNameDate(Plane plane) {
        System.out.println(plane.getName() + " " + plane.getReleaseDate());
    }

    public void printDateOrHour(Plane plane) {
//        if(plane.getReleaseDate() > 2000) {
//            System.out.println(plane.getName());
//        } else {
//            System.out.println(plane.getHoursInAir());
//        }
        System.out.println(plane.getReleaseDate() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String spendMoreHour(Plane plane1, Plane plane2) {
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    };

    public Plane longerName(Plane plane, Plane plane2) {
        return plane.getName().length() > plane2.getName().length() ? plane: plane2;
    }

    public void printPlanesArray(Plane[] planes){
        for(Plane x: planes) {
            x.printInfo();
        }
    }

    public void printNewerPlanes(Plane[] planes) {
        for(Plane x: planes) {
            if( x.isMilitary() && x.getReleaseDate() > 2010){
                x.printInfo();
            }
        }
    }

    public Plane maxHours(Plane[] plane) {
        Plane max = plane[0];
        for (int i = 0; i < plane.length; i++) {
            if(plane[i].getHoursInAir() > max.getHoursInAir()) {
                max = plane[i];
            }
        }
        return max;
    }

    public void oldestPlane(Plane[] planeArray) {
        Plane oldest = planeArray[0];
        for (int i = 0; i < planeArray.length; i++) {
            if(planeArray[i].getReleaseDate() < oldest.getReleaseDate()) {
               oldest = planeArray[i];
            }
        }
        oldest.printInfo();
    }

    public void newestOfMilitary(Plane[] planeArray){
        Plane newest = planeArray[0];
        int indexOfMilitary = 0;
//        This is done to define the first military element correctly
        for (int i = 0; i < planeArray.length; i++) {
            if(planeArray[i].isMilitary()) {
                newest = planeArray[i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary + 1; i < planeArray.length; i++) {
            if (planeArray[i].isMilitary()) {
                if(planeArray[i].getReleaseDate() > newest.getReleaseDate()) {
                    newest = planeArray[i];
                }
            }
        }
        newest.printInfo();
    }

    public void sortedByRelDate(Plane[] planeArray) {

        for (Plane a: planeArray) {
            int indexOfElement = 0;
            Plane firstElement = planeArray[0];
            if(a.getReleaseDate() > firstElement.getReleaseDate()) {

            }
        }
    }
}
