
public class Track extends Vehicle{
	
	public Track(int x,int y,int vx,int vy){
		super(x, y, vx, vy);
	}
	
	public void draw(MyFrame frame) {
		frame.fillRect(x,y,100,20);
		frame.fillRect(x+70, y-20, 30, 30);
		frame.fillOval(x+5, y+20, 15, 15);
		frame.fillOval(x+20, y+20, 15, 15);
		frame.fillOval(x+80, y+20, 15, 15);
	}

	public void move() {
		x+=vx; //++で、速くなる(EX2)
		y+=vy;
	}
}
