package lesson05;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MyFirstApple extends Applet {
	public void paint(Graphics g) {
		//サンプルプログラム（線を引く）
		g.drawRect(10, 30, 50, 100);	//長方形を描画する
		g.fillRect(70, 30, 50, 100);	//塗りつぶした長方形を描画する
		
		//サンプルプログラム（円弧を描く）
		g.drawArc(10, 130, 100, 50, 60, 120);	//円弧を描画する
		g.fillArc(10, 190, 100, 50, 120, 180);	//塗りつぶした円弧を描く
	}
}
