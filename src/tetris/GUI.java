package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	
	ArrayList<wholeShape> sh;
	wholeShape shape;
	
	JFrame f;
	
	
	public GUI() {
		
		f=new JFrame();
		f.setDefaultCloseOperation(3);
		f.setSize(1000, 1000);
		f.setVisible(true);
		f.add(this);
	
		
	
		
	}
	
	
	
	
	
	public void drawshapein(wholeShape s) {
		this.shape=s;
	}
	
public void drawthis(ArrayList<wholeShape> shape) {
	this.sh=shape;
	
	
}



public void paintComponent(Graphics g) {
	if(this.sh==null) {
		return;
	}
	if(this.shape==null) {
		return;
	}
	wholeShape shp=this.shape;
	g.setColor(Color.BLUE);
	g.fillRect(shp.getP1().x, shp.getP1().y, 20, 20);
	g.fillRect(shp.getP2().x, shp.getP2().y, 20, 20);
	g.fillRect(shp.getP3().x, shp.getP3().y, 20, 20);
	g.fillRect(shp.getP4().x, shp.getP4().y, 20, 20);
	
	g.setColor(Color.black);
	for(int i=0;i<sh.size();i++) {
		g.fillRect(sh.get(i).getP1().x, sh.get(i).getP1().y, 20, 20);
		g.fillRect(sh.get(i).getP2().x,sh.get(i).getP2().y, 20, 20);
		g.fillRect(sh.get(i).getP3().x, sh.get(i).getP3().y, 20, 20);
		g.fillRect(sh.get(i).getP4().x, sh.get(i).getP4().y, 20, 20);
		
	}
	
	this.f.validate();
	this.f.revalidate();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
