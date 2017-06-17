package lesson10;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Exercises1 extends Applet {

	private final int kosu = 10;

	public void paint(Graphics g) {
		for (int i = 0; i < kosu; i++) {

			if (i % 3 == 0) {
				g.fillOval(i * 20, 20, 20, 20);
			} else {
				g.drawOval(i * 20, 20, 20, 20);
			}
		}
	}

}
