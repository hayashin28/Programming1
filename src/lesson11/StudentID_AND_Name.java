/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年6月5日(水)												*
 *																			*
 * 【課題】																	*
 * 文字列を扱うためにString型の変数strを宣言し、変数strに適切な文字列を		*
 * 代入することで、自分の学籍番号と氏名を交互に５回ずつ出力するプログラムを	*
 * 作成しなさい。															*
 ****************************************************************************/

package lesson11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class StudentID_AND_Name extends Applet {
	@Override
	public void paint(Graphics g) {

		int yPosition = 20;

		for (int i = 0; i < 10; i++) {
			String str = null;

			if ((i & 1) == 0) {
				str = "12T412";
			} else {
				str = "林宏典";
			}

			// 並べた★マークをアプレット上に描画する
			g.drawString(str, 10, yPosition);

			// y座標を10下に下げる
			yPosition += 20;
		}
	}
}