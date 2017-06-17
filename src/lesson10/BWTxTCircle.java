package lesson10;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class BWTxTCircle extends Applet {

	public void paint(Graphics g) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((i & 1) == 1 && (j & 1) == 1) {
					g.drawOval(10 * j + 5, 10 * i + 5, 10, 10);
				} else if ((i & 1) == 1 && j % 2 == 0) {
					g.fillOval(10 * j + 5, 10 * i + 5, 10, 10);
				} else if (i % 2 == 0 && (j & 1) == 1) {
					g.fillOval(10 * j + 5, 10 * i + 5, 10, 10);
				} else {
					g.drawOval(10 * j + 5, 10 * i + 5, 10, 10);
				}
			}
		}
	}
}