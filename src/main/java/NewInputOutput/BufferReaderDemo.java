package NewInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     *
     * */
        public static void main(String[] args) throws IOException {

            File fl = new File(System.getProperty("user.dir") + ("/src/main/resources/Key-To-Success"));

            FileReader fr = new FileReader(fl.getAbsoluteFile());
            BufferedReader bufferedReader = new BufferedReader(fr);

            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);

            }
        }
    }
