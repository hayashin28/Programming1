package lesson07;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class MyFirstApplet extends Applet {
	public void paint(Graphics g) {
		int i;
		int x;

		i = 0; 			 // ・・・(1) 初期化

		while (i < 10) { // ・・・(2) 継続条件

			// ------------------ (3) 繰り返し行う処理
			x = 10 + 50 * i;
			g.drawRect(x, 10, 40, 40);

			i = i + 1;	 // ・・・(4) 更新処理
		}
	}
}
