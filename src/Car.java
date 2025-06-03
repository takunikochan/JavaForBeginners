
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx,int vy){
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+50,23,23);
		frame.fillOval(x+55,y+50,23,23);
		frame.fillRect(x+20,y,50,30);
		frame.fillRect(x,y+30,90,20);
	}
	public void move() {
		x+=vx;
		y+=vy;
		
	}
	
	
}
