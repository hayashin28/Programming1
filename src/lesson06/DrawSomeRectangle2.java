package lesson06;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawSomeRectangle2 extends Applet {
	public void paint(Graphics g) {
		g.drawRect(30,  0, 20, 20);
		g.drawRect(60,  0, 20, 20);
		g.drawRect(90,  0, 20, 20);
		g.drawRect(120, 0, 20, 20);
	}
}
