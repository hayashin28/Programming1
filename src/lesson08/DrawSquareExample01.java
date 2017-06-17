package lesson08;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawSquareExample01 extends Applet {
	public void paint(Graphics g) {
		for (int i = 0; i < 5; i++) {
			// ループ変数iが1増える毎に変数rを20増加させる
			int r = (i + 1) * 20;
			// 始点を固定して高さと幅に変数rを指定する
			g.drawRect(100, 100, r, r);
		}
	}
}
