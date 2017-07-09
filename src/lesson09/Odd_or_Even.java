/*------------------------------------------------------------------------------*
 | 学籍番号：12T412																|
 | 氏　　名：林　宏典																	|
 | 作成日付：2014年7月20日(日)														|
 |																				|
 | 【課題】																		|
 | 変数numberを宣言し、整数で初期化せよ。												|
 | その上で、numberが100以上かつ偶数であれば円を描画、100以上あるいは偶数であれば正方形を描画、		|
 | それ以外はバツを描画するプログラムを作成しなさい。											|
 *------------------------------------------------------------------------------*/

package lesson09;

import java.applet.Applet;
import java.awt.Graphics;

public class Odd_or_Even extends Applet {

	private static final long serialVersionUID = 1L;

	//数値判定を行うための変数
	private int number;

	@Override
	public void init() {
		//数値判定を行うための変数を初期化
		number = 11;
	}

	@Override
	public void paint(Graphics g) {

		//数値判定
		if (100 <= number && (number & 1) == 0) {
			//○を描画
			g.drawOval(10, 10, 100, 100);
		} else if (100 <= number || (number & 1) == 0) {
			//□を描画
			g.drawRect(10, 10, 100, 100);
		} else {
			//×を描画
			g.drawLine(10, 10, 100, 100);
			g.drawLine(100, 10, 10, 100);
		}
	}
}
