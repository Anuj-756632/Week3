import binarysearchingprograms.findthepeekelementinanarray.FindPeekElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPeekElement {
    @Test
    void f1(){
        int[] arr = {1, 3, 20, 4, 1, 0};
        FindPeekElement find=new FindPeekElement();
        Assertions.assertEquals(2,find.findPeekElement(arr));
    }
}
