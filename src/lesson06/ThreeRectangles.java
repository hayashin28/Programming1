package lesson06;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ThreeRectangles extends Applet {
	public void paint(Graphics g) {
		int spaceX = 40; 	// X軸
		int spaceY = 20;	// Y軸
		int rect   = 10;	// 正方形のサイズ

		g.drawRect(spaceX * 1, spaceY * 1, rect * 1, rect * 1);
		g.drawRect(spaceX * 2, spaceY * 2, rect * 2, rect * 2);
		g.drawRect(spaceX * 3, spaceY * 3, rect * 3, rect * 3);
		g.drawRect(spaceX * 4, spaceY * 4, rect * 4, rect * 4);
	}
}
