package L1PracticePrograms;

public class L1Q7 {

    public static void main(String[] args) {

        double radius = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        double volumeMiles = volumeKm * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is " 
                           + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}