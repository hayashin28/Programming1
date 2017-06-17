/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2014年7月19日(土)												*
 *																			*
 * 【課題】																	*
 * 始点の座標を毎回x方向に20、y方向に10ずつ増やしながら、直径25の赤に		*
 * 塗りつぶされた円を10個描くプロクラムを作成しなさい。						*
 ****************************************************************************/

package lesson07;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawRedCircle extends Applet {
	@Override
	public void paint(Graphics g) {

		int x = 0, y = 0;

		g.setColor(Color.RED);
		for (int i = 0; i < 10; i++) {
			g.fillOval(x, y, 25, 25);
			x += 20;	y += 10;
		}
	}
}
