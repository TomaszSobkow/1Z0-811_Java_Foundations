import java.io.File;
import java.io.IOException;

public class TestClass {

    public TestClass(){};

    void fileTst() throws IOException {
        String fileName = "Dupcia.txt";

        File newFile = new File("C:\\Users\\Tomek\\Documents\\JAVA course eCollege\\Projects\\src",fileName);
        newFile.createNewFile();
        System.out.println("FileOne exist?. "+ newFile.exists()+"File long"+fileName.length()
        );
        newFile.toString();
    }

}
