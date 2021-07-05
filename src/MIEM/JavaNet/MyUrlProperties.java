package MIEM.JavaNet;
//How to get URL properties in Java?

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlProperties {
    public static void main(String[] args) {
        try {
            String url="https://github.com:80/DemoxieV/";
            URL myUrl=new URL(url);
            System.out.println("Protocol: "+myUrl.getProtocol());
            System.out.println("Host: "+myUrl.getHost());
            System.out.println("Port: "+myUrl.getPort());
            System.out.println("Authority of the URL: "+myUrl.getAuthority());
            System.out.println("Query: "+myUrl.getQuery());
            System.out.println("Reference: "+myUrl.getRef());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
