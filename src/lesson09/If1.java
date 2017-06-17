package lesson09;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class If1 extends Applet {
	public void paint(Graphics g) {
		int side = 100;
		g.setColor(Color.red);
		if (side > 0) { // 7行目
			g.fillRect(10, 20, side, side);
		}
	}
}
