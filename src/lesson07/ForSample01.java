package lesson07;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ForSample01 extends Applet {
	public void paint(Graphics g) {
		int i;
		int y;

		// (1) 初期化[i = 0]； (2) 継続条件[i < 10]； (4) 更新処理[i = i + 1]
		for (i = 0; i < 10; i = i + 1) {
			// ------------------------------(3) 繰り返し行う処理
			y = 10 + 50 * i;
			g.drawRect(10, y, 40, 40);
		}

	}
}
