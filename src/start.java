/* import javax.swing.*;
import java.awt.*;

class Splash extends JFrame implements Runnable
{
  private Image splash;
  Thread t;

  Splash()
  {
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
    splash = i1.getImage().getScaledInstance(735,565,Image.SCALE_DEFAULT);
    ImageIcon i2 = new ImageIcon(splash);
    JLabel image = new JLabel(i2);
    add(image);

    t = new Thread(this);
    t.start();
  }

  @Override
  public void run() {
   try {
    Thread.sleep(6000);
    setVisible(false);
    new Login();


   } catch (Exception e) {
    e.printStackTrace();
   }
    
  }
}

public class start
{
  public static void main(String[] args) {
    Splash s = new Splash();
    s.setTitle("University Management System");
    s.setVisible(true);
    s.setResizable(false);
    s.setLocationRelativeTo(null);

    // Frame size adjustment
    int x = 1;
    for(int i = 2; i < 600; i+=4, x+=1)
    {
      s.setSize(i+x, i);
      s.setLocation(650-((i + x)/2), 350 - (i/2));
      try {
        Thread.sleep(5);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
} */

//OR 
import javax.swing.*;
import java.awt.*;

class Splash extends JFrame implements Runnable {
  private Image splash;
  Thread t;

  Splash() {
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front_vit.png"));
    splash = i1.getImage().getScaledInstance(735, 565, Image.SCALE_DEFAULT);
    ImageIcon i2 = new ImageIcon(splash);
    JLabel image = new JLabel(i2);
    add(image);
    setVisible(true);

    // Frame size adjustment
    int x = 1;
    for (int i = 2; i < 600; i += 4, x += 1) {
      setSize(i + x, i);
      setLocation(650 - ((i + x) / 2), 350 - (i / 2));
      try {
        Thread.sleep(5);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    setTitle("University Management System");
    setResizable(false);
    // setLocationRelativeTo(null);

    t = new Thread(this);
    t.start();
  }

  @Override
  public void run() {
    try {
      Thread.sleep(3000);
      setVisible(false);
      new Login();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

public class start {
  public static void main(String[] args) {

    new Splash();

  }
}