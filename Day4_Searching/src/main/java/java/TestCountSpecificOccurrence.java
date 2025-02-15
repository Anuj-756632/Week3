import filereaderprograms.countoccurrencesofword.CountSpecificWordOccurrence;
import org.junit.jupiter.api.Test;

public class TestCountSpecificOccurrence {
    @Test
    void f1(){
        CountSpecificWordOccurrence count=new CountSpecificWordOccurrence();
        count.countOccurrence("D:\\NormalFile.txt","a");
    }


}
