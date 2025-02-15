import inputstreamreaderprograms.covertbytetocharacterstream.ConvertByteStreamToCharacterStream;
import org.junit.jupiter.api.Test;

public class TestConvertByteStreamToCharStream {
    @Test
    void f1(){
        ConvertByteStreamToCharacterStream convert=new ConvertByteStreamToCharacterStream();
        convert.convertStream("D:\\NormalFile.txt");
    }
}
