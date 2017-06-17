/****************************************************************************
 * 学籍番号：12T412															*
 * 氏　　名：林　宏典														*
 * 作成日付：2013年4月13日(土)												*
 *																			*
 * 【課題】																	*
 * ギリシャ国旗を描くプログラムを作成しなさい．国旗の外枠は黒とする.		*
 ****************************************************************************/

package lesson05;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GreeceFlag extends Applet {

	public void paint(Graphics g) {

		g.drawRect(0, 0, 600, 360);

		//↓描画色を青に設定する場合
		g.setColor(Color.blue);

		g.fillRect(0, 0, 80, 80);		//左隅上の■…①
		g.fillRect(0, 120, 80, 80);		//①の下の■…②
		g.fillRect(120, 0, 80, 80);		//①の右の■…③
		g.fillRect(120, 120, 80, 80);	//③の下の■…④
		g.fillRect(200, 0, 400, 40);	//③の右の■…⑤
		g.fillRect(200, 80, 400, 40);	//⑤の下の■…⑥
		g.fillRect(200, 160, 400, 40);	//⑥の下の■…⑦
		g.fillRect(0, 240, 600, 40);	//⑦の下の■…⑧
		g.fillRect(0, 320, 600, 40);	//⑧の下の■…⑨
	}
}
