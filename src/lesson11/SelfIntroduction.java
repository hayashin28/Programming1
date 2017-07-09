/*--------------------------------------------------------------*
 | 学籍番号：12T412												|
 | 氏　　名：林　宏典													|
 | 作成日付：2014年7月26日(土)										|
 |																|
 | 【課題】														|
 | 2色以上を使い、自分の名前をローマ字表記で10回描画するプログラムを作成せよ。		|
 *--------------------------------------------------------------*/

package lesson11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class SelfIntroduction extends Applet {
	@Override
	public void paint(Graphics g) {
		//表示する名前を定義
		String name = "Hironori Hayashi";
		//色の定義と名前の出力を10回行う
		for (int i = 0; i < 10; i++) {
			g.setColor(getColor());
			g.drawString(name, i * 20, i *  20);



		}
		int c= '★';
		System.out.print(c);
	}

	/**
	 * 乱数で定義された3原色(RGB)をColorオブジェクトとして返します。
	 * @return Color
	 */
	private Color getColor() {
		return new Color(getRandom(),getRandom(),getRandom());
	}

	/**
	 * 0～255の乱数を生成します。
	 * @return int
	 */
	private int getRandom() {
		return (int) (Math.random() * 255);
	}
}