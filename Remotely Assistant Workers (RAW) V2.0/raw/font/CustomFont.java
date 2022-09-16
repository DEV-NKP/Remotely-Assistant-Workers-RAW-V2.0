
package raw.font;

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

public class CustomFont
{

public CustomFont()
{
	
}
public Font customFont(String font,int quality, float size)
{
Font customfont=null;
try {
    //create the font to use. Specify the size!
     customfont = Font.createFont(Font.TRUETYPE_FONT, new File(font)).deriveFont(quality,size);
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    //register the font
    ge.registerFont(customfont);
} catch (IOException e) {
    e.printStackTrace();
} catch(FontFormatException e) {
    e.printStackTrace();
}


return customfont;			
}
	
}