package MIEM.JavaNet;
//How to get IP address of a Host in Java?

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIPHost {
    public static void main(String[] args) {
        try{
            InetAddress host= InetAddress.getByName("www.google.com");
            System.out.println(host.getHostAddress());
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
