/*----------------------------------------------------------*
 | 学籍番号：12T412											|
 | 氏　　名：林　宏典												|
 | 作成日付：2014年7月26日(土)									|
 |															|
 | 【課題】													|
 | 文字列A「コニア画画」とその逆並びの文字列B「画アニコ」を繰り返し描画する		|
 | プログラムを作成せよ。											|
 *----------------------------------------------------------*/

package lesson11;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class IllusionGraphic extends Applet {
	public void paint(Graphics g) {
		//ベースとなる文字列を定義
		StringBuilder base = new StringBuilder("コニア画");
		//基本となる出力位置を定義
		int xPosition = 10, yPosition = 10;
		//文字列の出力を10回行う
		for (int i = 1; i <= 18; i++) {

			String str = base.toString();
			//3の倍数で文字列の逆転を行う
			if ((i & 3) == 0) {
				str =  base.reverse().toString();
			}
			//出力文字列の連結
			for (int j = 0; j < 3; j++) {
				str += str;
			}
			//出力処理
			g.drawString(str, xPosition, i * yPosition);
		}
	}
}