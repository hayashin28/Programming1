package lesson04;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Dumpling3 extends Applet {
	public void paint(Graphics g) {
		//串
		g.drawLine(0, 60, 340, 60);

		//赤い団子
		g.setColor(Color.red);
		g.fillOval(20, 10, 100, 100);

		//緑の団子
		g.setColor(Color.green);
		g.fillOval(120, 10, 100, 100);

		//青の団子
		g.setColor(Color.blue);
		g.fillOval(220, 10, 100, 100);

	}
}
