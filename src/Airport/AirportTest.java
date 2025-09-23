package Airport;

import Airport.Model.Plane;
import Airport.Service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
   AirportService service = new AirportService();
   Plane plane = service.createPlane();
        System.out.println(plane.getName());
        System.out.println(plane.getReleaseDate());
        System.out.println(plane.getHoursInAir());

    }
}
