import binarysearchingprograms.rotationpointinrotatedsortedarray.FindRotationPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRotationPoint {
    @Test
    void f1(){
        int[] arr = {6, 7, 9, 15, 19, 2, 3};
        FindRotationPoint findPoint=new FindRotationPoint();
        Assertions.assertEquals(5,findPoint.findRotationPoint(arr));
    }
}
