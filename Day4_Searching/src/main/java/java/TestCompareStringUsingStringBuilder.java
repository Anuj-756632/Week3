import org.junit.jupiter.api.Test;
import stringbufferprograms.comparestringbufferandstringbuilerwithconcatenation.CompareStringUsingStringBuliderAndBuffer;

public class TestCompareStringUsingStringBuilder {
    @Test
    void f1(){
        CompareStringUsingStringBuliderAndBuffer compare=new CompareStringUsingStringBuliderAndBuffer();
        compare.measurePerformanceUsingStringBuffer(10000000,"Hello");
        compare.measurePerformanceUsingStringBuilder(10000000,"World");
    }
}
