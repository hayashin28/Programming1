/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典																*
 * 作成日付：2014年5月27日(火)													*
 *																			*
 * 【課題】																	*
 * drawOval,fillOval,drawRect,fillRect,drawArc,fillArcの中から，少なくとも3つ以上の	*
 * 命令を用い、かつ2色以上を使って自動車の絵を描くプログラムを作成しなさい。					*
 * その他の描画関連のメソッドも使ってもよい。											*
 ****************************************************************************/

package lesson05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Car extends Applet {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillArc(30, 40, 150, 90, 0, 180);
		g.fillArc(10, 60, 200, 120, 0, 180);

		g.setColor(Color.WHITE);
		//塗りつぶした円弧を描画する
		g.fillArc(50, 50,100,50, 90, 90);
		g.fillArc(60, 50,100,50, 0, 90);

		g.setColor(Color.GRAY);
		g.fillRect(0, 140, 250, 40);

		g.setColor(Color.BLACK);
		g.fillOval(30, 90, 60, 60);
		g.fillOval(130, 90, 60, 60);

	}
}
