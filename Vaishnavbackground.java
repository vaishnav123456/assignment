import java.applet.*;
import java.awt.*;
public class Vaishnavbackground extends Applet
{
  String msg;
  public void init()
  {
   setBackground(Color.red);
   setForeground(Color.blue);
   msg="background color is pink";
   }
public void paint (Graphics g)
{
   g.drawString(msg,50,80);
  
}
}
/*<Applet code = "Vaishnavbackground.class" width=300 Height=400>
</Applet>
*/

