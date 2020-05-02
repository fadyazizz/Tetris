package tetris;

//mport java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

//import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

public class Controller implements KeyListener {
	
	
	Simulator engine=new Simulator();
	
	ArrayList<wholeShape> allshapes=engine.getallshapes();
	GUI view=new GUI();
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_DOWN ) {
			
			this.engine.shapeInHand.movedown();
			this.view.drawshapein(this.engine.shapeInHand);
			this.view.drawthis(this.allshapes);
			this.view.repaint();
		}
		if(e.getKeyCode()==e.VK_UP   ) {
			this.engine.shapeInHand.rotate();
			this.view.drawshapein(this.engine.shapeInHand);
			this.view.drawthis(this.allshapes);
			this.view.repaint();
		}
		if(e.getKeyCode()==e.VK_RIGHT  ) {
			this.engine.shapeInHand.moveRight();
			this.view.drawshapein(this.engine.shapeInHand);
			this.view.drawthis(this.allshapes);
			this.view.repaint();
		}
		if(e.getKeyCode()==e.VK_LEFT) {
			this.engine.shapeInHand.moveLeft();
			this.view.drawshapein(this.engine.shapeInHand);
			this.view.drawthis(this.allshapes);
			this.view.repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Controller c=new Controller();
		
		
		
		c.view.f.addKeyListener(c);
		
		while(!c.engine.gameover()) {
			//System.out.println("ana giet hena");
			c.engine.Play();
			c.engine.shapeInHand.movedown();
			c.view.drawshapein(c.engine.shapeInHand);
			c.view.f.revalidate();
			c.view.repaint();
			
			c.view.drawshapein(c.engine.shapeInHand);
			Thread.sleep(200);
		}
		
		
		
		
		
		
	
	
	
	}

	
	

	
	
	
	
	
	
}
