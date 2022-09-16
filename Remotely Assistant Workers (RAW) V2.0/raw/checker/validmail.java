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


public class validmail{

public boolean mailcheck(String email) 
    { 
        String emailRegex = "^[a-z0-9_+&*-]+(?:\\."+ 
                            "[a-z0-9_+&*-]+)*@" + 
                            "(?:[a-z0-9-]+\\.)+[a-z" + 
                            "]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }
	
	}