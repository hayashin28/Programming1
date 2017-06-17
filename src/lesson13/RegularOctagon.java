package lesson13;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class RegularOctagon extends Applet {
	public void paint(Graphics g) {
		// 正八角形を描く (八角形の中心は(70, 70) )
		int x0, y0, x1, y1, r = 50; // 直線の始点(x0, y0),終点(x1, y1), 半径r=50
		x1 = 70 + (int) Math.rint(r * Math.sin(0 / 8.0 * 2 * Math.PI));
		y1 = 70 - (int) Math.rint(r * Math.cos(0 / 8.0 * 2 * Math.PI));
		// ※ 画面では，y軸は下向きが正
		// ※ rintでdoubleの値を四捨五入し，int型にキャスト(型変換)している
		for (int i = 1; i <= 8; i++) {
			x0 = x1;
			y0 = y1;
			x1 = 70 + (int) Math.rint(r * Math.sin(i / 8.0 * 2 * Math.PI));
			y1 = 70 - (int) Math.rint(r * Math.cos(i / 8.0 * 2 * Math.PI));
			g.drawLine(x0, y0, x1, y1);
		}
	}
}
