package lesson12;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

@SuppressWarnings("serial")
public class DisitalClockApplet extends Applet {
	@Override
	public void paint(Graphics g) {
		int hou, min, sec;
		Calendar cal = Calendar.getInstance();
		hou = cal.get(Calendar.HOUR);	//時
		min = cal.get(Calendar.MINUTE);	//分
		sec = cal.get(Calendar.SECOND);	//秒
		g.setFont(new Font("SansSerif", Font.PLAIN, 60));
		g.drawString(Integer.toString(hou) + "時", 40, 50);
		g.drawString(Integer.toString(min) + "分", 140, 50);
		g.drawString(Integer.toString(sec) + "秒", 270, 50);
	}
}