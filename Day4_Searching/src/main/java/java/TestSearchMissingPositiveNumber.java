import challengeproblem.linearandbinarysearchproblem.SearchMissingPositiveInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchMissingPositiveNumber {
    @Test
    void f1(){
        int[] nums = {3, 4, -1, 1};
        int[] sortedArr = {-1, 0, 3, 5, 9, 12};
        SearchMissingPositiveInteger search=new SearchMissingPositiveInteger();
        Assertions.assertEquals(2,search.firstMissingPositive(nums));
        Assertions.assertEquals(4,search.binarySearch(sortedArr,9));
    }
}
