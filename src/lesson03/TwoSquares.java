/****************************************************************************************
 * 学籍番号：12T412																		*
 * 氏　　名：林　宏典																	*
 * 作成日付：2014年5月25日(日)															*
 *																						*
 * 【課題】																				*
 * 辺の長さ100の正方形と、それを内包する辺の長さ200の正方形を描くプログラムを作成せよ。 *
 ****************************************************************************************/

package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

public class TwoSquares extends Applet {
	@Override
	public void paint(Graphics g) {
		g.drawRect(60,60,100,100);
		g.drawRect(10,10,200,200);
	}
}
