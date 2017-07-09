/************************************************************
 * 学籍番号：12T412											*
 * 氏　　名：林　宏典												*
 * 作成日付：2013年4月14日(日)									*
 *															*
 * 【課題】													*
 * 始点の座標を毎回x方向に40，y方向に10ずつ増やしながら，一辺の長さが30の	*
 * 正方形を10個描画するプロクラムを，繰り返し処理を用いて作成しなさい．		*
 * (繰り返し処理を用いるプログラムとすること．) 							*
 ************************************************************/

package lesson07;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LoopRectangles extends Applet {
	public void paint(Graphics g) {
		int spaceX = 40; 	// X軸
		int spaceY = 10;	// Y軸
		int rect   = 30;	// 正方形のサイズ

		// 10個の正方形を描画する処理
		for (int i = 1; i <= 10; i++) {
			g.drawRect(spaceX * i, spaceY * i, rect, rect);
			// ↓正方形のサイズも動的に変更する場合
			//g.drawRect(spaceX * i, spaceY * i, rect * i, rect * i);
		}
	}
}
