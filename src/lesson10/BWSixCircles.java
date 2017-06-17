package lesson10;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class BWSixCircles extends Applet {

	public void paint(Graphics g) {

		for (int i = 1; i <= 7; i++) {
			if ((i & 1) == 1) {
				g.drawOval(25 * i + 5, 15, 25, 25);
			} else {
				g.fillOval(25 * i + 5, 15, 25, 25);
			}
		}
	}

}
