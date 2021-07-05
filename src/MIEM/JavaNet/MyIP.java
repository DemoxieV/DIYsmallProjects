package MIEM.JavaNet;
// How to get my machine or local host IP address in Java?

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIP {
    public static void main(String[] args) {
        try{
            InetAddress ipAddr= InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
