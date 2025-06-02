
public class Car {
	int x,y;
	public Car(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+50,23,23);
		frame.fillOval(x+55,y+50,23,23);
		frame.fillRect(x+20,y,50,30);
		frame.fillRect(x,y+30,90,20);
	}
	
}
