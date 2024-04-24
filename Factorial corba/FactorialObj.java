//FactorialObj.java
import FactorialApp.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

class FactorialObj extends FactorialPOA {
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    public double factorial(double n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public void shutdown() {
        orb.shutdown(false);
    }
}
