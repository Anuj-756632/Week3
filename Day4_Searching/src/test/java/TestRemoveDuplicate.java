import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilderprograms.removeduplicatevalueusingstringbuilder.RemoveDuplicate;

public class TestRemoveDuplicate {
    @Test
    void f1(){
        RemoveDuplicate remove=new RemoveDuplicate();
        Assertions.assertEquals("anuj",remove.removeDuplicate("aaannuujj"));
    }
}
