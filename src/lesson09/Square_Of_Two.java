 /*-------------------------------------------------------------*
 | 学籍番号：12T412												|
 | 氏　　名：林　宏典													|
 | 作成日付：2014年7月20日(日)										|
 |																|
 | 【課題】														|
 | 4つの変数width1,height1,width2,height2を宣言し、整数で初期化せよ。	|
 | そして、width1とheight1をそれぞれ幅と高さにもつ長方形1、width2とheight2を	|
 | それぞれ幅と高さにもつ長方形2を描くプログラムを作成しなさい。					|
 | ただし、長方形1の面積が長方形2の面積以上の場合は赤色で塗り潰し、そうでない		|
 | 場合は青色で塗りつぶすこと。											|
 *--------------------------------------------------------------*/

package lesson09;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Square_Of_Two extends Applet {

	private static final long serialVersionUID = 1L;

	//長方形1の面積を求めるための変数
	private int width1;
	private int height1;
	//長方形2の面積を求めるための変数
	private int width2;
	private int height2;


	@Override
	public void init() {
		//長方形1の面積を求めるための変数を初期化
		width1	= 200;
		height1	= 300;
		//長方形2の面積を求めるための変数を初期化
		width2	= 400;
		height2	= 500;

	}

	@Override
	public void paint(Graphics g) {
		//長方形1の面積を算出
		final int area1 = width1 * height1;
		//長方形2の面積を算出
		final int area2 = width2 * height2;
		//長方形の面積を比較し条件を即した色を定義
		final Color color = (area2 <= area1) ? Color.RED :Color.BLUE;
		g.setColor(color);

		//描画処理
		g.fillRect(10, 10, width1, height1);
		g.fillRect(width1 + 50, 10, width2, height2);
	}
}
