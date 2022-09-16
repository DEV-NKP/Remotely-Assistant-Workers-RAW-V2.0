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

public class ShapeHoverButton extends SHBHoverButton {
  public final Color fc = new Color(100, 150, 255, 200);
  public final Color ac = new Color(230, 230, 230);
  public final Color rc = Color.ORANGE;
  public final Shape shape;

  public ShapeHoverButton(int r1, int r2, int vc)
  {
    super();
	
    shape = makeStar(r1,r2,vc);
    setModel(new DefaultButtonModel());
    init("Shape", new SHBDummySizeIcon(shape));
    setVerticalAlignment(SwingConstants.CENTER);
    setVerticalTextPosition(SwingConstants.CENTER);
    setHorizontalAlignment(SwingConstants.CENTER);
    setHorizontalTextPosition(SwingConstants.CENTER);
    setBorder(BorderFactory.createEmptyBorder());
    setContentAreaFilled(false);
    setFocusPainted(false);
    setBackground(new Color(250, 250, 250));
  }

  public Path2D makeStar(int r1, int r2, int vc) {
    int or = Math.max(r1, r2);
    int ir = Math.min(r1, r2);
    double agl = 0d;
    double add = 2 * Math.PI / (vc * 2);
    Path2D p = new Path2D.Double();
    p.moveTo(or * 1, or * 0);
    for (int i = 0; i < vc * 2 - 1; i++) {
      agl += add;
      int r = i % 2 == 0 ? ir : or;
      p.lineTo(r * Math.cos(agl), r * Math.sin(agl));
    }
    p.closePath();
    AffineTransform at = AffineTransform.getRotateInstance(-Math.PI / 2, or, 0);
    return new Path2D.Double(p, at);
  }


  public void paintFocusAndRollover(Graphics2D g2, Color color) {
    g2.setPaint(new GradientPaint(0, 0, color, getWidth() - 1, getHeight() - 1, color.brighter(), true));
    g2.fill(shape);
  }

  @Override public void paintComponent(Graphics g) {
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
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(getForeground());
    g2.draw(shape);
    g2.dispose();
  }

  @Override public boolean contains(int x, int y) {
    return shape.contains(x, y);
  }
  // // TEST:
  // @Override public Dimension getPreferredSize() {
  //   Rectangle r = shape.getBounds();
  //   return new Dimension(r.width, r.height);
  // }
}
 class SHBDummySizeIcon implements Icon {
  public final Shape shape;

  public SHBDummySizeIcon(Shape s) {
    shape = s;
  }

  @Override public void paintIcon(Component c, Graphics g, int x, int y) { /* Empty icon */ }

  @Override public int getIconWidth() {
    return shape.getBounds().width;
  }

  @Override public int getIconHeight() {
    return shape.getBounds().height;
  }
}



 class SHBHoverButton extends JButton
{
 public float alpha = 0.5f;

  public SHBHoverButton() {
    super();
  }

  public SHBHoverButton(Icon icon) {
    super(icon);
  }



  public SHBHoverButton(Action a) {
    super(a);
    // setAction(a);
  }


  public SHBHoverButton(String text)
  {
    super(text);
    setFocusPainted(false);
    setBorderPainted(false);
    setContentAreaFilled(false);
    addMouseListener(new ML());
  }
  
    public SHBHoverButton(String text, Icon icon) {
    super(text, icon);
    // setModel(new DefaultButtonModel());
    // init(text, icon);
    // setContentAreaFilled(false);
    // setBackground(new Color(250, 250, 250));
    // initShape();
  }
 public SHBHoverButton(String text,ImageIcon I)
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