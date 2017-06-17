package lesson08;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawSquareExample02 extends Applet {
	public void paint(Graphics g) {
		for (int i = 0; i < 5; i++) {
			int r = (i + 1) * 20;
			// 始点のx座標は固定，y座標を変数rの半分だけ変化させる
			g.drawRect(10, 100 - r / 2, r, r);
		}
	}

}
