package raw.button;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Optional;
import javax.swing.*;


public class RoundedCornerButton extends JButton {
  public static final double ARC_WIDTH = 16d;
  public static final double ARC_HEIGHT = 16d;
  public static final int FOCUS_STROKE = 2;
  public final Color fc = new Color(100, 150, 255, 200);
  public final Color ac = new Color(230, 230, 230);
  public final Color rc = Color.ORANGE;
  public Shape shape;
  public Shape border;
  public Shape base;

  public RoundedCornerButton() {
    super();
  }

  public RoundedCornerButton(Icon icon) {
    super(icon);
  }

  public RoundedCornerButton(String text) {
    super(text);
  }

  public RoundedCornerButton(Action a) {
    super(a);
    // setAction(a);
  }

  public RoundedCornerButton(String text, Icon icon) {
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