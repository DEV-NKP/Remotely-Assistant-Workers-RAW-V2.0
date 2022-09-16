package raw.checker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import java.net.*;
import java.io.*; 
import javax.swing.plaf.basic.*;
import javax.swing.plaf.metal.*;
import javax.imageio.ImageIO;
import java.util.regex.*; 
import javax.swing.event.*;
import java.awt.geom.*;
import java.applet.*;
import javax.sound.sampled.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;



public class validpassword
{
	public String passcheck(String uname, String upass)
        {
                String valid = "";
                if (upass.length() > 16 || upass.length() < 8)
                {
                        
                        valid = "<html>Password should be less than 16 and more than or equal 8 characters in length.</html>";
						return valid;
                }
                if (upass.indexOf(uname) > -1)
                {
                      
                        valid = "<html>Password Should not be same as user name.</html>";
							return valid;
                }
                String upercase = "(.*[A-Z].*)";
                if (!upass.matches(upercase))
                {
                       
                        valid = "<html>Password should contain atleast one upper case alphabet.</html>";
							return valid;
                }
                String lowercase = "(.*[a-z].*)";
                if (!upass.matches(lowercase ))
                {
                        
                        valid = "<html>Password should contain atleast one lower case alphabet.</html>";
							return valid;
                }
                String number = "(.*[0-9].*)";
                if (!upass.matches(number))
                {
                        
                        valid = "<html>Password should contain atleast one number.</html>";
							return valid;
                }
                String special = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                if (!upass.matches(special))
                {
                       
                        valid = "<html>Password should contain atleast one special character.</html>";
							return valid;
                }
                
				return valid;
        }
	
	
}