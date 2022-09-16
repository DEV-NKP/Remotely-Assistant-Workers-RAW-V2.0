package raw.panel;

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
public class ImagePanel extends JPanel {

  public static final long serialVersionUID = 1L;

  public Image img;
  public Image scaled;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
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

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(scaled, 0, 0, null);
  }
}