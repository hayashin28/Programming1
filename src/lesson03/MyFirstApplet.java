package lesson03;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MyFirstApplet extends Applet {
	public void paint(Graphics g) {
		g.drawRect(60, 30, 70, 90);
	}
}
