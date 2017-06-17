/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2014年7月19日(土)												*
 *																			*
 * 【課題】																	*
 * 直径20の円から描き始め，1回ごとに直径が10ずつ増えていく真円を描く		*
 * プログラムを繰り返し処理を用いて作成しなさい。							*
 * ただし、直径の長さは90以上にならないようにすること。						*
 ****************************************************************************/

package lesson07;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawConcentricCircle extends Applet {
	public void paint(Graphics g) {
		int r = 20;
		for (int i = 0; ; i++) {
			// r が90以上で処理を抜ける
			if (90 <= r) break;
			// 始点のx座標を変数i/r，y座標を変数rの半分だけ変化させる
			g.drawOval(100 - r /2, 10 - i / r, r, r);
			r = (i + 1) * 10;
		}
	}
}
