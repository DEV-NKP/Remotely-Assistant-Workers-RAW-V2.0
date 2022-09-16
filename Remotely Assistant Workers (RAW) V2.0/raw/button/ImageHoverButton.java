package raw.button;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ImageHoverButton extends JButton {

  public static final long serialVersionUID = 1L;

  public Image img;
  public Image scaled;
 public float alpha = 0.5f;
/*
  public ImageHoverButton(String img) {
 	   // super(img);
		this(new ImageIcon(img).getImage());

    setFocusPainted(false);
    setBorderPainted(false);
    setContentAreaFilled(false);
    addMouseListener(new ML());
	
  }*/

  public ImageHoverButton(Image img) {
  // super(text,img); 
   this.img = img;
	
    setFocusPainted(false);
    setBorderPainted(false);
    setContentAreaFilled(false);
    addMouseListener(new ML());
	
  }
  
 public float getAlpha()
  {
    return alpha;
  }

  public void setAlpha(float alpha)
  {
    this.alpha = alpha;
    repaint();
  }

  public void paintComponent(java.awt.Graphics g)
  {
    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    super.paintComponent(g2);
	 // super.paintComponent(g);
    g.drawImage(scaled, 0, 0, null);
  }

  public class ML extends MouseAdapter
  {
    public void mouseExited(MouseEvent me)
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          for (float i = 1f; i >= .5f; i -= .03f)
          {
            setAlpha(i);
            try
            {
              Thread.sleep(10);
            }
            catch (Exception e)
            {
            }
          }
        }
      }).start();
    }

    public void mouseEntered(MouseEvent me)
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          for (float i = .5f; i <= 1f; i += .03f)
          {
            setAlpha(i);
            try
            {
              Thread.sleep(10);
            }
            catch (Exception e)
            {
            }
          }
        }
      }).start();
    }

    public void mousePressed(MouseEvent me)
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          for (float i = 1f; i >= 0.6f; i -= .1f)
          {
            setAlpha(i);
            try
            {
              Thread.sleep(1);
            }
            catch (Exception e)
            {
            }
          }
        }
      }).start();
    }
  }

  

  @Override
  public void invalidate() {
    super.invalidate();
    int width = getWidth();
    int height = getHeight();

    if (width > 0 && height > 0) {
      scaled = img.getScaledInstance(getWidth(), getHeight(),
          Image.SCALE_SMOOTH);
    }
  }

  @Override
  public Dimension getPreferredSize() {
    return img == null ? new Dimension(200, 200) : new Dimension(
        img.getWidth(this), img.getHeight(this));
  }


}