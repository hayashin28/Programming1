package lesson10;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Exercises2 extends Applet {

	public void paint(Graphics g) {
		int i = 0;
		int radius = 50;
		while (2 < radius) {
			if ((i & 1) == 0) {
				g.setColor(Color.red);
				g.fillOval(50 - radius, 50 - radius, radius * 2, radius * 2);
			} else {
				g.setColor(Color.yellow);
				g.fillOval(50 - radius, 50 - radius, radius * 2, radius * 2);
			}
			i++;
			radius *= 0.8;
		}
	}
}
