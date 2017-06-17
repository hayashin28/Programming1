package lesson11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawStarRow extends Applet {
	public void paint(Graphics g) {
		String star = "";
		int xPosition = 10, yPosition = 60;
		// ★を文字列変数に1個ずつ追加するループ文
		for (int i = 0; i < 10; i++) {
			star = star + "★";
		}
		// 10個の★マークをアプレット上に描画する
		g.drawString(star, xPosition, yPosition);
	}
}