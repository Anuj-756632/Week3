import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbufferprograms.concatenatestringusingstringbuffer.ConcatenateString;

public class TestConcatenateString {
    @Test
    void f1(){
        String[] str = {"my", "name", "is", "Anuj"};
        ConcatenateString concat=new ConcatenateString();
        Assertions.assertEquals("mynameisAnuj",concat.concateString(str));
    }
}
