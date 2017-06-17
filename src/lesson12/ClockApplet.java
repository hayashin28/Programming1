package lesson12;

import java.applet.*;
import java.awt.*;
import java.util.Calendar;

@SuppressWarnings("serial")
public class ClockApplet extends Applet {
	public void paint(Graphics g) {

		//分と秒を入れる変数を宣言
		int sec, min;

		//Calendar型の変数calを宣言し現在の時刻情報を使用可能にする
		Calendar cal = Calendar.getInstance();

		sec = cal.get(Calendar.SECOND);	//現在の秒
		min = cal.get(Calendar.MINUTE);	//現在の分

		g.drawOval(20, 20, 80, 80);						//時計の枠外
		g.fillOval(59, 59, 2, 2);						//時計の中心
		g.fillArc(25, 25, 70, 70, 90  -sec * 60, 4);	//時計の長針
		g.fillArc(40, 40, 40, 40, 90  -min * 60, 4);	//時計の短針
	}
}
