/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月12日(金)												*
 *																			*
 * 【課題】																	*
 * 底辺の揃った2つの四角形が一辺で接している図形を描くプログラムを作成せよ	*
 ****************************************************************************/

package lesson03;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class TwoSquares_old extends Applet {
	@Override
	public void paint(Graphics g) {

		g.drawRect(10,10,100,200);
		g.drawRect(110, 110, 100, 100);
	}
}
