package lesson04;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Dumpling1 extends Applet {
	public void paint(Graphics g) {
		//串
		g.drawLine(60, 0, 60, 340);

		//赤い団子
		g.setColor(Color.red);
		g.fillOval(10, 20, 100, 100);

		//緑の団子
		g.setColor(Color.green);
		g.fillOval(10, 120, 100, 100);

		//青の団子
		g.setColor(Color.blue);
		g.fillOval(10, 220, 100, 100);

	}
}