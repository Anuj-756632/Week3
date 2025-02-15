import filereaderprograms.readfileusingfilereader.ReadFileUsingFileReader;
import inputstreamreaderprograms.readinputandwriteintofile.ReadInputuserAndWriteInToFile;
import org.junit.jupiter.api.Test;

public class TestReadFileUsingFileReader {
    @Test
    void f1(){
        ReadFileUsingFileReader read=new ReadFileUsingFileReader();
        read.readFile("D:\\NormalFile.txt");
    }
}
