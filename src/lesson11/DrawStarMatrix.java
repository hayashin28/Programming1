package lesson11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawStarMatrix extends Applet {
	public void paint(Graphics g) {

		int xPosition = 10, yPosition = 10;

		// 横に並べた★マークの文字列を縦に並べるループ処理
		for (int i = 0; i < 10; i++) {
			// 文字列変数starの宣言と初期化
			String star = "";

			// y座標を10下に下げる
			yPosition = yPosition + 10;

			for (int j = 0; j < 10; j++) {
				if (j < i)
					star += "☆";
				else if (j == i)
					star += "-" ;
				else
					star += "★";
			}

			// 並べた★マークをアプレット上に描画する
			g.drawString(star, xPosition, yPosition);
		}
	}
}