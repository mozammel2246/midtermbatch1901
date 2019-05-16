package api;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import static java.lang.System.*;

public class SystemAPI {

    /**
     * @author Jahidul Islam
     * Read System JDK 8 API documantation to be read and System source code to be viewed
     * Demonastrate your understanding on System after reading the documentation
     * Show some uses of System Class
     * Explain, what is System.out.println()?
     * List all the members of the System class, such as class variable, instance variables, local variables
     * method type etc
     *
     * */
    /*Class variables - in, out, err, cons, security
    * Local variable - security manager
    * Instance variable
    * out is a class variable of System class which can be called by the class name only. And println is a method of
    * System class which helps to print the output in the consol. As this method is not static, it has to be called with
    * the help of a reference varible of the class. And thus we write System.out.println*/
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("sun.desktop"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("sun.cpu.isalist"));

        Properties properties = System.getProperties();
        Set<Object> keySet = properties.keySet();
        for(Object key : keySet)
        {
            System.out.println("key= " + key);
        }

       /* // claering this property
        clearProperty("user.home");

        System.out.println(System.getProperty("user.home"));

        // setting specific property
        setProperty("user.country", "US");

        // checking property
        System.out.println(System.getProperty("user.country"));

        // checking property other than system property
        // illustrating getProperty(String key, String def)
        System.out.println(System.getProperty("user.password",
                "none of your business"));*/

    }


}
