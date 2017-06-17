package lesson04;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class OriginalCharacter extends Applet {
	@Override
	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(30, 30, 110, 90);
		g.fillOval(10, 80, 150, 100);

		g.setColor(Color.WHITE);
		g.fillOval(45, 45, 80, 70);

		g.setColor(Color.BLACK);

		/*鼻の描画*/
		g.drawLine(80,80, 90, 70);//直線の描画，始点(80,80)，終点(90,70)
		g.drawLine(70,90, 100, 90);//直線の描画，始点(70,90)，終点(100,90)

	}
}
