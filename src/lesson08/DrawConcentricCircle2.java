package lesson08;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawConcentricCircle2 extends Applet {
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 5; i++) {
			int r = (i + 1) * 20;
			// 始点のx座標を変数i/r，y座標を変数rの半分だけ変化させる
			g.drawOval(10 - i / r, 100 - r /2, r, r);
		}
	}
}
