/*--------------------------------------------------------------------------------------*
 | 学籍番号：12T412																		|
 | 氏　　名：林　宏典																	|
 | 作成日付：2014年7月26日(土)															|
 |																						|
 | 【課題】																				|
 | 3色以上および3種類以上の文字を用いて13×13個の文字を出力するプログラムを作成せよ。	|
 *--------------------------------------------------------------------------------------*/

package lesson11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Characters extends Applet {

	private final int COUNT = 13;

	public void paint(Graphics g) {
		//色の定義と名前の出力を定数回行う
		for (int i = 1; i <= COUNT; i++) {
			for (int j = 1; j <= COUNT; j++) {
				g.setColor(getColor());
				g.drawString(getCharacter(), j * 15, i *  15);
			}
		}
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

	/**
	 * 10種類の記号からランダムに1つを返却します。
	 * @return String
	 */
	private String getCharacter() {
		final String[] chars = { "●", "◆", "■", "▲", "▼", "★", "♪", "♯", "♭", "〒" };
		return chars[(int) (Math.random() * 10)];
	}
}