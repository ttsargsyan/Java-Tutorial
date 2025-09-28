package Airport;

import Airport.Model.Plane;
import Airport.Service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane plane3 = service.createPlane();
        Plane[] planeArr  = {plane, plane2, plane3};
//        plane.printInfo();
//        System.out.println("-----------");
//        service.printNameDate(plane);
//        System.out.println("-----------");
//        service.printDateOrHour(plane);
//        System.out.println("-----------");
//        System.out.println(service.spendMoreHour(plane, plane2));
//        System.out.println("-----------");
//        service.longerName(plane, plane2).printInfo();
//        System.out.println("-----------");
//        service.printPlanesArray(planeArr);
//        System.out.println("-----------");
//        service.printNewerPlanes(planeArr);
//       System.out.println("-----------");
//        service.maxHours(planeArr).printInfo();
//         System.out.println("-----------");
//        service.oldestPlane(planeArr);
//        System.out.println("-----------");
        service.newestOfMilitary(planeArr);




    }
}
