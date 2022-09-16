
import raw.label.*;
import raw.button.*;
import raw.panel.*;
import raw.textbox.*;
import raw.font.*;
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
import com.mysql.jdbc.Connection;
public class exit
{

JFrame exitframe;
exit()
{

}

exit(JFrame frame)
{
this.exitframe=frame;
}

public void confirmexit(JFrame frame, float confirmexitvol)
{
	
		try{
	
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Resources/Audio/Common/confirm_exit.wav"));
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
FloatControl gainControl =(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

gainControl.setValue(confirmexitvol);
clip.start();
				}
				catch(MalformedURLException ae)
				{
					System.out.println(ae);
				}
				catch(UnsupportedAudioFileException ae)
				{
					System.out.println(ae);
				}
				catch(LineUnavailableException ae)
				{
					System.out.println(ae);
				}
				catch(IOException ae)
				{
					System.out.println(ae);
				}
			
			

	
	
		JOptionPane jop=new JOptionPane();
	
UIManager.put("OptionPane.background", Color.decode("#808080"));
UIManager.put("Panel.background", Color.decode("#808080"));


			ImageIcon imgx = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif"); //65*65
			int selection=jop.showConfirmDialog(frame,"Do you want to Exit?","!!!Exit!!!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,imgx);
			
			
			if(selection==jop.YES_OPTION)
			{
					
					try{		
ProcessBuilder P1 =new ProcessBuilder("C:\\xampp\\mysql_stop.bat");
P1.start();

ProcessBuilder P2 =new ProcessBuilder("C:\\xampp\\APACHE_stop.bat");
P2.start();

}catch(IOException ae)
{
System.out.println(ae);
}
			System.exit(0);
			
			}
			if(selection==jop.NO_OPTION)
			{
			
			}
			
			
			
	
	
	
}




}