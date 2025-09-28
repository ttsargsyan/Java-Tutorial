package Airport.Model;

public class Plane {
    private String name;
    private int releaseDate;
    private int hoursInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    };

    public void printInfo(){
        System.out.printf("Name: %s, Release Date: %d, Hours In Air: %d, isMilitary: %s%n", name, releaseDate, hoursInAir, isMilitary?"Yes" : "No");
    }
}
