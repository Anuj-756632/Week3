import binarysearchingprograms.firstandlastoccurrenceelementinarray.BinarySearchOccurrenceElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOccurrenceElement {
    @Test
    void f1(){
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 6};
        BinarySearchOccurrenceElement search=new BinarySearchOccurrenceElement();
        Assertions.assertEquals(1,search.findFirstOccurrence(arr,2));
    }
}
