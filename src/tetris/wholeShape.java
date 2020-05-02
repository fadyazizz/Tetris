package tetris;

import java.awt.Point;

public class wholeShape {
	
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	private int shape;
	private int rotation=0;
	
	private boolean canMove=true;
	
	
	public boolean canMove() {
		return this.canMove;
	}
	public void stopmoving() {
		this.canMove=false;
	}
	
	public wholeShape() {
		switch(this.getrand()) {
		case 0:
			
			
			p1=new Point(500,0);
			p2=new Point(500,-20);
			p3=new Point(500,-40);
			p4=new Point(500,-60);
			this.shape=1;
			this.rotation=0;
		break;
		case 1:
			p1=new Point(500,0);
			p2=new Point(520,0);
			p3=new Point(500,-20);
			p4=new Point(520,-20);
			this.shape=2;
			this.rotation=0;
		break;
		case 2:
			p1=new Point(500,0);
			p2=new Point(500,-20);
			p3=new Point(500,-40);
			p4=new Point(480,0);
			this.shape=3;
			this.rotation=0;
		}
		
		
	}
	
	
	
	public void rotate() {
		
		if(!this.canMove) {
			return;
		}
		
		
		
		switch(this.shape) {
		case 1:
			
			switch(this.rotation) {
			case 0:
				this.p1.x=this.p1.x-20;
				
				
				this.p2.y=this.p2.y+20;
				this.p3.x=this.p3.x+20;
				this.p3.y=this.p3.y+40;
				this.p4.x=this.p4.x+40;
				this.p4.y=this.p4.y+60;
					
				
				break;
			case 1:
				
				this.p1.x=this.p1.x+20;
				this.p2.y=this.p2.y-20;
				this.p3.x=this.p3.x-20;
				this.p3.y=this.p3.y-40;
				this.p4.x=this.p4.x-40;
				this.p4.y=this.p4.y-60;
				break;
				
				
			case 2:
				this.p1.x=this.p1.x-20;
				
				
				this.p2.y=this.p2.y+20;
				this.p3.x=this.p3.x+20;
				this.p3.y=this.p3.y+40;
				this.p4.x=this.p4.x+40;
				this.p4.y=this.p4.y+60;
					
				
				break;
				
				

				
			
		case 3:

			this.p1.x=this.p1.x+20;
			
			
			this.p2.y=this.p2.y-20;
			this.p3.x=this.p3.x-20;
			this.p3.y=this.p3.y-40;
			this.p4.x=this.p4.x-40;
			this.p4.y=this.p4.y-60;
			
			
			
			break;

			
		}
			break;
		case 2:
			break;
		case 3:
			switch(this.rotation) {
			case 0:
				 this.p2.x=this.p2.x+20;
				 this.p2.y=this.p2.y+20;
				 
				 
				 this.p3.x=this.p3.x+40;
				 this.p3.y=this.p3.y+40;
				 
				 
				 this.p4.x=this.p4.x+20;
				 this.p4.y=this.p4.y-20;
				 
				 break;
			case 1:
				
				
				
				this.p2.x=this.p2.x-20;
				this.p2.y=this.p2.y+20;
				
				
				this.p3.x=this.p3.x-40;
				this.p3.y=this.p3.y+40;
				
				
				
				this.p4.x=this.p4.x+20;
				this.p4.y=this.p4.y+20;
				
				break;
				
				
			case 2:
				
				
				this.p2.x=this.p2.x-20;
				this.p2.y=this.p2.y-20;
				
				this.p3.x=this.p3.x-40;
				this.p3.y=this.p3.y-40;
				
				
				this.p4.x=this.p4.x-20;
				this.p4.y=this.p4.y+20;
				
				
				
				break;
				
				
				
			case 3:
				
				
				
				
				this.p4.x=this.p4.x-20;
				this.p4.y=this.p4.y-20;
				
				
				this.p2.x=this.p2.x+20;
				this.p2.y=this.p2.y-20;
				
				this.p3.x=this.p3.x+40;
				this.p3.y=this.p3.y-40;
				
				break; 
			}
			break;
			
		}
		this.rotation=(this.rotation+1)%4;
	}

	
	public Point getP1() {
		return p1;
	}



	public void setP1(Point p1) {
		this.p1 = p1;
	}



	public Point getP2() {
		return p2;
	}



	public void setP2(Point p2) {
		this.p2 = p2;
	}



	public Point getP3() {
		return p3;
	}



	public void setP3(Point p3) {
		this.p3 = p3;
	}



	public Point getP4() {
		return p4;
	}



	public void setP4(Point p4) {
		this.p4 = p4;
	}



	public void movedown() {
		
		
		
		
		if(this.p1.y<700 && this.p2.y<700 && this.p3.y<700 && this.p4.y<700 && this.canMove) {
			
		
		p1.y=p1.y+20;
		p2.y=p2.y+20;
		p3.y=p3.y+20;
		p4.y=p4.y+20;
		return;
	}
		this.canMove=false;
		
	}

	
	public void moveRight() {
		if(this.p1.x<900 && this.p2.x<900 && this.p3.x<900 && this.p4.x<900 && this.canMove) {
			p1.x=p1.x+20;
			p2.x=p2.x+20;
			p3.x=p3.x+20;
			p4.x=p4.x+20;
			
		}
		
	}
	
	
	
	
	public void moveLeft() {
		if(this.p1.x>20 && this.p2.x>20 && this.p3.x>20 && this.p4.x>20 && this.canMove) {
			p1.x=p1.x-20;
			p2.x=p2.x-20;
			p3.x=p3.x-20;
			p4.x=p4.x-20;
			return;
		}
		
	
		
	}
	
	private int getrand() {

		
		return (int)(Math.random()*3);

	}
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
	
	

}
