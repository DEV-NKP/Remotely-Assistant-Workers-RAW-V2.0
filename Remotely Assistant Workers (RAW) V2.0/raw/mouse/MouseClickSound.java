
package raw.mouse;

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

public class MouseClickSound
{

public MouseClickSound()
{
	
}
public void clickSound(String song,float volume)
{
		try{
	
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(song));
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
FloatControl gainControl =(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

gainControl.setValue(volume);
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
			
}
	
}