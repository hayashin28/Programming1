package lesson13;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MathSample extends Applet {
	public void paint(Graphics g) {
		double x = 45.0; // 45°
		String str = " sin 45°= " + Math.sin(Math.toRadians(x));
		// ※sinの引数はラジアン
		g.drawString(str, 20, 20);

		double a = 2.0, b = 3.0;
		str = "exp 2 = " + Math.exp(a);
		g.drawString(str, 20, 40);
		str = "2^3(2の3乗) = " + Math.pow(a, b);
		g.drawString(str, 20, 60);

		str = "a = " + a + ", b = " + b;
		str = str + ", 大きい方は，" + Math.max(a, b);
		g.drawString(str, 20, 80);

		double c = 4.8, d = 4.3;
		str = "小数点以下を丸める (" + c + ") floor:" + Math.floor(c) + ", ceil:"
				+ Math.ceil(c) + ", rint:" + Math.rint(c);
		g.drawString(str, 20, 100);
		str = "小数点以下を丸める (" + d + ") floor:" + Math.floor(d) + ", ceil:"
				+ Math.ceil(d) + ", rint:" + Math.rint(d);
		g.drawString(str, 20, 120);

	}
}
