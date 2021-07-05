package MIEM.JavaNet;
//How to compare two URL objects in Java?

import java.net.URL;
import java.net.MalformedURLException;

public class UrlCompare {
    public static void main(String[] args) {
        try {
            //protocol is obligatory
            URL yan=new URL("http://www.yandex.ru");
            URL goo=new URL("http://www.google.com");
            if(yan.equals(goo))
                System.out.println("Both URLs are equal");
             else
                 System.out.println("Both URLs are not equal");
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
