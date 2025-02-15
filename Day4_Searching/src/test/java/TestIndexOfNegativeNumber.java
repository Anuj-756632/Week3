import linearsearchprograms.findindexofnegativenumber.FindFirstNegativeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIndexOfNegativeNumber {
    @Test
    void f1(){
        int[] num = {1,-3,-4,5,-6};
        FindFirstNegativeNumber findNumber=new FindFirstNegativeNumber();
        Assertions.assertEquals(1,findNumber.checkNumber(num));
    }
}
