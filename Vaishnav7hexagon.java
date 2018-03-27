import java.applet.*;
import java.awt.*;
public class Vaishnav7hexagon extends Applet
{
  int x[]={20,70,170,220,170,70,20};
  int y[]={100,13,13,100,186,186,100};
  int n=6;
 int x1[]={240,290,390,440,390,290,240};
  int y1[]={100,13,13,100,186,186,100};
  int n1=6;

public void paint(Graphics g)
{
 g.setColor(Color.blue);
 g.fillPolygon(x,y,n);
 g.setColor(Color.red);
 g.drawPolygon(x1,y1,n1);
}
}

/*<Applet code = "Vaishnav7hexagon.class" width=600 Height=500>
</Applet>
*/



