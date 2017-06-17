package lesson07;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class WhileSample01 extends Applet {
	public void paint(Graphics g){
		int length;
		
		length = 10;             // ・・・・(1) 初期化
		while (length < 100){    // ・・・・(2) 継続条件
			
			// ----------------------- (3) 繰り返し行う処理
			g.drawRect( 10, 10, length, length);
			
			length = length * 2;  // ・・・・(4) 更新処理
		}
	}
}
