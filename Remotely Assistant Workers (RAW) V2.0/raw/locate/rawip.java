package raw.locate;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;
  
public class rawip
{
   
		public String localhostaddress() 
		{
			String host;
        try
        {
        InetAddress localhost = InetAddress.getLocalHost();
		 host=(localhost.getHostAddress()).trim();
		}
		catch (Exception e)
        {
	         host= publicipaddress();
        }
        return("System IP Address : " +host);
					  
		}
		
		public String publicipaddress()
		{
        // Find public IP address
        String systemipaddress = "";
        try
        {
String url="www.google.com";  
InetAddress ia=InetAddress.getByName(url);  
systemipaddress=ia.getHostAddress();  
        }
        catch (Exception e)
        {
	         systemipaddress= publicipaddress();
        }
        return("Public IP Address: " + systemipaddress +"\n");
		}
		
	
	
}