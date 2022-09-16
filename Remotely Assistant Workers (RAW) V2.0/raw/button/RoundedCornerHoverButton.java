package raw.button;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Optional;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class RoundedCornerHoverButton extends RCHHoverButton {
  public static final double ARC_WIDTH = 16d;
  public static final double ARC_HEIGHT = 16d;
  public static final int FOCUS_STROKE = 2;
  public final Color fc = new Color(100, 150, 255, 200);
  public final Color ac = new Color(230, 230, 230);
  public final Color rc = Color.ORANGE;
  public Shape shape;
  public Shape border;
  public Shape base;

  public RoundedCornerHoverButton() {
    super();
  }

  public RoundedCornerHoverButton(Icon icon) {
    super(icon);
  }

  public RoundedCornerHoverButton(String text) {
    super(text);
  }

  public RoundedCornerHoverButton(Action a) {
    super(a);
    // setAction(a);
  }

  public RoundedCornerHoverButton(String text, Icon icon) {
    super(text, icon);
    // setModel(new DefaultButtonModel());
    // init(text, icon);
    // setContentAreaFilled(false);
    // setBackground(new Color(250, 250, 250));
    // initShape();
  }

  @Override public void updateUI() {
    super.updateUI();
    setContentAreaFilled(false);
    setFocusPainted(false);
    setBackground(new Color(250, 250, 250));
    initShape();
  }

  public void initShape() {
    if (!getBounds().equals(base)) {
      base = getBounds();
      shape = new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, ARC_WIDTH, ARC_HEIGHT);
      border = new RoundRectangle2D.Double(
        FOCUS_STROKE, FOCUS_STROKE,
        getWidth() - 1 - FOCUS_STROKE * 2,
        getHeight() - 1 - FOCUS_STROKE * 2,
        ARC_WIDTH, ARC_HEIGHT);
    }
  }

  public void paintFocusAndRollover(Graphics2D g2, Color color) {
    g2.setPaint(new GradientPaint(0, 0, color, getWidth() - 1, getHeight() - 1, color.brighter(), true));
    g2.fill(shape);
    g2.setPaint(getBackground());
    g2.fill(border);
  }

  @Override public void paintComponent(Graphics g) {
    initShape();
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    if (getModel().isArmed()) {
      g2.setPaint(ac);
      g2.fill(shape);
    } else if (isRolloverEnabled() && getModel().isRollover()) {
      paintFocusAndRollover(g2, rc);
    } else if (hasFocus()) {
      paintFocusAndRollover(g2, fc);
    } else {
      g2.setPaint(getBackground());
      g2.fill(shape);
    }
    g2.dispose();
    super.paintComponent(g);
  }

  @Override public void paintBorder(Graphics g) {
    initShape();
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(getForeground());
    g2.draw(shape);
    g2.dispose();
  }

  @Override public boolean contains(int x, int y) {
    initShape();
    // return shape != null && shape.contains(x, y);
    // return Optional.ofNullable(shape).filter(s -> s.contains(x, y)).isPresent();
    return Optional.ofNullable(shape).map(s -> s.contains(x, y)).orElse(false);
  }
}


 class RCHHoverButton extends JButton
{
 public float alpha = 0.5f;

  public RCHHoverButton() {
    super();
  }

  public RCHHoverButton(Icon icon) {
    super(icon);
  }



  public RCHHoverButton(Action a) {
    super(a);
    // setAction(a);
  }


  public RCHHoverButton(String text)
  {
    super(text);
    setFocusPainted(false);
    setBorderPainted(false);
    setContentAreaFilled(false);
    addMouseListener(new ML());
  }
  
    public RCHHoverButton(String text, Icon icon) {
    super(text, icon);
    // setModel(new DefaultButtonModel());
    // init(text, icon);
    // setContentAreaFilled(false);
    // setBackground(new Color(250, 250, 250));
    // initShape();
  }
 public RCHHoverButton(String text,ImageIcon I)
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