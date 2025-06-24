package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwmethod {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Testfile.tct");

    }
}
