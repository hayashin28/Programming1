package lesson06;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawSomeRectangle1 extends Applet {
	public void paint(Graphics g) {
		g.drawRect(50, 0, 20, 20);
		g.drawRect(100, 0, 20, 20);
		g.drawRect(150, 0, 20, 20);
		g.drawRect(200, 0, 20, 20);
	}
}
