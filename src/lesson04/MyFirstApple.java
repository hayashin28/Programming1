package lesson04;

import java.awt.*;
import java.applet.*;

/*
 * 注釈を入れたプログラム例
 * 2013.04.13
 * */

@SuppressWarnings("serial")
public class MyFirstApple extends Applet {
	@Override
	public void paint(Graphics g) {
		//一行使って注釈をつける
		g.drawLine(10, 30, 50, 100);

		//サンプルプログラム（楕円の描画）
		g.drawOval(10, 130, 50, 100);

		//サンプルプログラム（楕円の塗りつぶし）
		g.fillOval(60, 10, 50, 100);	//塗りつぶした楕円を描画

		//サンプルプログラム（色を指定する）
		g.setColor(Color.blue);		 	//色を指定
		g.drawLine(50, 30, 120, 60); 	//線を描画
		g.setColor(Color.red);		 	//色を指定
		g.drawOval(50, 100, 120 , 60);	//楕円を描画
		g.setColor(Color.green);		//色を指定
		g.fillOval(50, 160, 20, 30);	//塗りつぶした楕円を描画
		g.drawOval(150, 160, 20, 30);	//楕円を描画
	}
}
