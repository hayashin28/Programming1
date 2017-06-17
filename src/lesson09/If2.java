package lesson09;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class If2 extends Applet {
	public void paint(Graphics g) {
		int side = -100;
		if (side <= 0) {
			g.drawLine(0, 0, 100, 100);
			g.drawLine(0, 100, 100, 0);
		}
	}
}
