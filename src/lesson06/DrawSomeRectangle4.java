package lesson06;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawSomeRectangle4 extends Applet {
	public void paint(Graphics g) {
		int space; 							// 変数への宣言
		space = 30; 						// 変数への値を代入

		g.drawRect(space * 1, 0, 20, 20);	// *は積を求める演算子
		g.drawRect(space * 2, 0, 20, 20);
		g.drawRect(space * 3, 0, 20, 20);
		g.drawRect(space * 4, 0, 20, 20);
	}
}
