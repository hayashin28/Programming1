/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月16日(火)												*
 *																			*
 * 【課題】																	*
 * 正方形の1辺の長さを格納するための変数を宣言、初期化し、4辺の長さの		*
 * 合計が400以上の場合は青、400未満の場合は赤色の塗りつぶした正方形を		*
 * 描画するプログラムを作成しなさい。実行結果の一例を以下に示す。			*
 *・4辺の和が400以上の場合													*
 *・4辺の和が400未満の場合 													*
 ****************************************************************************/

package lesson09;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Red_OR_Blue extends Applet {
	public void paint(Graphics g) {
		final int SIDE = 100;

		g.setColor(Color.red);
		if (400 <= SIDE * 4) {
			g.setColor(Color.blue);
		}
		g.fillRect(10, 10, SIDE, SIDE);
	}
}
