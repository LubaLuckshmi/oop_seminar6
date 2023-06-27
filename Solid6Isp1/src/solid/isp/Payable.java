package solid.isp;

import jdk.jshell.spi.ExecutionControl;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Payable extends PayableCreditCard, PayablePhoneNumber, PayableWebMoney{



}
