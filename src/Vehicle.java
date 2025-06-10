
public class Vehicle {
	int x,y,vx,vy;
	
	public Vehicle(int x,int y,int vx,int vy){
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame f) {
		
	}
	public void move(MyFrame frame) {
		x+=vx; //++で、速くなる(EX2)
		y+=vy;
		
		if(x > frame.getWidth()) {
			x -= frame.getWidth()+100;
		}
		if(x < 100) {
			x += frame.getWidth();
		}
		
	}

}
