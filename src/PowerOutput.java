import java.util.Scanner;

/**
 * 3.4PP Methods For Calculation
 *
 * @author Charlie Cooper
 */

public class PowerOutput {

    public static double power(final double torque, final int rpm) {
        return torque * rpm * (2 * Math.PI / 60000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double torque = 0.0;
        int rpm = 0;

        System.out.println("Electric Motor Power Output\n");
        System.out.println("Telsa Model 3: " + power(450, 3000) + " kW");
        System.out.println("Hyundai IONIQ: " + power(295, 3000) + " kW\n");
        System.out.print("Input torque: ");
        torque = scanner.nextDouble();
        System.out.print("Input motor's rpm: ");
        rpm = scanner.nextInt();
        System.out.println("\nCALCULATING...");
        System.out.println("ANSWER IS " + power(torque, rpm) + " kW");

    }

}
