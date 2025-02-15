import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilderprograms.stringreverseusingstringbuilder.ReverseString;

public class TestReverseString {
    @Test
    void f1(){
        ReverseString reversetext=new ReverseString();
        Assertions.assertEquals("olleh",reversetext.reverseString("hello"));
    }
}
