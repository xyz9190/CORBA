import FactorialApp.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import java.util.Scanner;

public class StartClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Factorial factorialObj = FactorialHelper.narrow(ncRef.resolve_str("Factorial"));

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter a number to calculate its factorial (negative to exit):");
                double number = scanner.nextDouble();
                if (number < 0)
                    break;

                double result = factorialObj.factorial(number);
                System.out.println("Factorial of " + number + " is: " + result);
            }
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
            e.printStackTrace();
        }
    }
}
