package solid.isp;

import jdk.jshell.spi.ExecutionControl;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface PayablePhoneNumber {
    void payPhoneNumber(int amount) throws NotImplementedException, ExecutionControl.NotImplementedException;
}
