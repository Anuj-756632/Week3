import inputstreamreaderprograms.readinputandwriteintofile.ReadInputuserAndWriteInToFile;
import org.junit.jupiter.api.Test;

public class TestReadInputUserAndWriteToFile {
    @Test
    void f1(){
        ReadInputuserAndWriteInToFile read=new ReadInputuserAndWriteInToFile();
        read.readInputAndWriteToFile("D:\\NormalFile.txt");
    }
}
