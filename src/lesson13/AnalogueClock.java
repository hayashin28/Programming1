/*------------------------------------------*
 | 学籍番号：12T412							|
 | 氏　　名：林　宏典								|
 | 作成日付：2014年7月27日(日)					|
 |											|
 | 【課題】									|
 | アナログ時計を描画するアプレットプログラムを作りなさい。	|
 *------------------------------------------*/

package lesson13;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;

public class AnalogueClock extends Applet implements Runnable {

	private static final long serialVersionUID = 1L;

	private final int CENTER = 120;
	Thread clock = null;

	/** アプレットの初期化 */
	public void init() {
		// スレッドの起動
		clock = new Thread(this);
		clock.start();
	}

	public void paint(Graphics g) {

		// 時と分と秒を入れる変数を宣言
		int hou, min, sec;

		// Calendar型の変数calendarを宣言し現在の時刻情報を使用可能にする
		Calendar calendar = Calendar.getInstance();

		hou = calendar.get(Calendar.HOUR);		// 時
		min = calendar.get(Calendar.MINUTE);	// 分
		sec = calendar.get(Calendar.SECOND);	// 秒

		g.drawOval(20, 20, 200, 200);			// 時計の枠外
		g.fillOval(CENTER, CENTER, 2, 2);		// 時計の中心
		//時計のメモリ(n時)を表示
		for (int i = 1; i <= 12; i++) {
			int x = CENTER + (int) Math.rint(90 * Math.sin(i / 12.0 * 2 * Math.PI)) - 3;
			int y = CENTER - (int) Math.rint(90 * Math.cos(i / 12.0 * 2 * Math.PI)) + 6;
			g.drawString(String.valueOf(i), x, y);
		}
		//各種時計の針を表示
		// 時計の短針
		g.drawLine(CENTER, CENTER, CENTER + (int) Math.rint(60 * Math.sin((hou * 60 + min) / 720.0 * 2 * Math.PI)), CENTER - (int) Math.rint(60 * Math.cos((hou * 60 + min)/ 720.0 * 2 * Math.PI)));
		// 時計の長針
		g.drawLine(CENTER, CENTER, CENTER + (int) Math.rint(90 * Math.sin(min / 60.0 * 2 * Math.PI)), CENTER - (int) Math.rint(90 * Math.cos(min / 60.0 * 2 * Math.PI)));
		// 時計の秒針
		g.drawLine(CENTER, CENTER, CENTER + (int) Math.rint(90 * Math.sin(sec / 60.0 * 2 * Math.PI)), CENTER - (int) Math.rint(90 * Math.cos(sec / 60.0 * 2 * Math.PI)));
	}

	public void run() {
		while (true) {
			//再描画
			this.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
