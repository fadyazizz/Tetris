package tetris;

import java.awt.Point;
import java.util.ArrayList;

public class Simulator {

	private ArrayList<wholeShape> allshapes=new ArrayList<wholeShape>();
	public wholeShape shapeInHand=new wholeShape();
	
	
	
	
	
	public void Collisondetection() {
		if(this.allshapes.size()==0) {
			return;
		}
		
		Point temp1=this.shapeInHand.getP1();
		Point temp2=this.shapeInHand.getP2();
		Point temp3=this.shapeInHand.getP3();
		Point temp4=this.shapeInHand.getP4();
		
	
		
		for(int i=0;i<this.allshapes.size();i++) {
			Point tempmap1=this.allshapes.get(i).getP1();
			Point tempmap2=this.allshapes.get(i).getP2();
			Point tempmap3=this.allshapes.get(i).getP3();
			Point tempmap4=this.allshapes.get(i).getP4();
			
			if(temp1.distance(tempmap1)<=23 || temp1.distance(tempmap2)<=23 || temp1.distance(tempmap3)<=23|| temp1.distance(tempmap4)<=23) {
				this.shapeInHand.stopmoving();
			}
			if(temp2.distance(tempmap1)<=23 || temp2.distance(tempmap2)<=23 || temp2.distance(tempmap3)<=23|| temp2.distance(tempmap4)<=23) {
				this.shapeInHand.stopmoving();
			}
			if(temp3.distance(tempmap1)<=23 || temp3.distance(tempmap2)<=23 || temp3.distance(tempmap3)<=23|| temp3.distance(tempmap4)<=23) {
				this.shapeInHand.stopmoving();
			}
			if(temp4.distance(tempmap1)<=23 || temp4.distance(tempmap2)<=23 || temp4.distance(tempmap3)<=23|| temp4.distance(tempmap4)<=23) {
				this.shapeInHand.stopmoving();
			}
			
			
			
		}
		
		
		
	}
	
	public boolean gameover() {
		Point temp1=this.shapeInHand.getP1();
		Point temp2=this.shapeInHand.getP2();
		Point temp3=this.shapeInHand.getP3();
		Point temp4=this.shapeInHand.getP4();
		Collisondetection();
		
		
		if(temp1.getY()<=0 || temp2.getY()<=0|| temp3.getY()<=0 || temp4.getY()<=0) {
			if(!this.shapeInHand.canMove()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	public ArrayList<wholeShape> getallshapes(){
		return this.allshapes;
	}
	
	
	
	
	
	
	
	public void Play() {
		
		if(this.shapeInHand==null) {
			this.shapeInHand=new wholeShape();
		}
		
		if(!gameover()) {
			
			
			if(this.shapeInHand.canMove()==false) {
				this.allshapes.add(shapeInHand);
				this.shapeInHand=new wholeShape();
				
			}
			
			//this.shapeInHand.movedown();
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
