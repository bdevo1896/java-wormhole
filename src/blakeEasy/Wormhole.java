package blakeEasy;

import java.awt.Graphics;
import javax.swing.JApplet;
import java.awt.Font;
import java.awt.Color;

public class Wormhole extends JApplet {
	
	public void paint(Graphics gfx){
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, this.getWidth(), this.getHeight());

		int r = 0, g = 0, b =20, x1 = 110,x2 = 290,y1 = 70,y2 = 180;
		for(int i = 0; i < 12; i++){
			gfx.setColor(new Color(r,g,b));
			gfx.fillOval(x1, y1, x2, y2);
			r+=10;g+=10;b+=20;x1+=30;x2-=30;y1+=10;y2-=20;
		}
		
		gfx.setColor(Color.white);
		gfx.setFont(new Font("TimesRoman",Font.BOLD,36));
		gfx.drawString("いくつもりです",40,320);
	}

}
