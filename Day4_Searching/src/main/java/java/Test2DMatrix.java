import binarysearchingprograms.firstandlastoccurrenceelementinarray.BinarySearchOccurrenceElement;
import binarysearchingprograms.searchtargetevaluein2dsortedmatrix.BinarySearchIn2DMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2DMatrix {
    @Test
    void f1(){
        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 5, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        BinarySearchIn2DMatrix search=new BinarySearchIn2DMatrix();
        Assertions.assertEquals(true,search.searchMatrix(matrix,5));
    }
}
