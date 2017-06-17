package lesson12;

import java.awt.*;
import java.applet.*;
import java.util.*;

@SuppressWarnings("serial")
public class SecondDisplayApplet extends Applet {
	public void paint(Graphics g) {
		int sec;
		Calendar cal = Calendar.getInstance();
		sec = cal.get(Calendar.SECOND);	//秒
		g.setFont(new Font("SansSerif", Font.PLAIN, 60));
		g.drawString(Integer.toString(sec) + "秒", 20, 50);
	}

}
