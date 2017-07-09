package lesson04;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * ミュラー・リヤーの錯視図形
 * @author hayas_000
 *
 */
public class MullerLyer_IllusionFigure extends Applet {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {

		g.drawLine( 50,  50,  70,  30);
		g.drawLine( 50,  50,  70,  70);
		g.drawLine( 50,  50, 200,  50);
		g.drawLine(200,  50, 180,  30);
		g.drawLine(200,  50, 180,  70);

		g.drawLine( 50, 150,  30, 130);
		g.drawLine( 50, 150,  30, 170);
		g.drawLine( 50, 150, 200, 150);
		g.drawLine(200, 150, 220, 130);
		g.drawLine(200, 150, 220, 170);
	}
}
