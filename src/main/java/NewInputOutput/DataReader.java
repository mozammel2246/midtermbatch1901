package NewInputOutput;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.*;

public class DataReader {

	public static void main(String[] args) {

/**
 * Use API to read the below textFile and print to console.
 * /src/main/resources/Key-To-Success
 * Use FileReader class, no need to store in buffer
 * Use try....catch block to handle Exception.
 * Use ForEach loop/while loop/Iterator to retrieve data.
 */

			try {
				File fl = new File(System.getProperty("user.dir") + ("/src/main/resources/Key-To-Success"));
				FileReader fr = new FileReader(fl.getAbsoluteFile());

				int i;
				while ((i = fr.read()) != -1)
					System.out.print((char) i);

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}


		}
}
