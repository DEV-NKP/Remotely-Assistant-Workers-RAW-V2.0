package raw.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HoverButton extends JButton
{
 public float alpha = 0.5f;

  public HoverButton() {
    super();
  }

  public HoverButton(Icon icon) {
    super(icon);
  }



  public HoverButton(Action a) {
    super(a);
    // setAction(a);
  }


  public HoverButton(String text)
  {
    super(text);
    setFocusPainted(false);
    setBorderPainted(false);
    setContentAreaFilled(false);
    addMouseListener(new ML());
  }
  
    public HoverButton(String text, Icon icon) {
    super(text, icon);
    // setModel(new DefaultButtonModel());
    // init(text, icon);
    // setContentAreaFilled(false);
    // setBackground(new Color(250, 250, 250));
    // initShape();
  }
 public HoverButton(String text,ImageIcon I)
  {
   super(text,I);
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
}