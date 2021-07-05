package MIEM.JavaNet;
//How to create URL Object by passing protocol, host, port and path in Java?

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlConstruct {
    public static void main(String[] args) {
        try{
            String protocol="https";
            String host="github.com";
            int port=80;
            String path="/DemoxieV/";
            URL url=new URL(protocol, host, port, path);
            System.out.println(url.toString());
        } catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}
