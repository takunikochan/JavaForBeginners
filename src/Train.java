
public class Train extends Vehicle{
	
	public Train(int x,int y,int vx,int vy){
		super(x, y, vx, vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x,    y,   100, 30);
		frame.fillOval(x+5,  y+30, 10, 10);
		frame.fillOval(x+15, y+30, 10, 10);
		frame.fillOval(x+75, y+30, 10, 10);
		frame.fillOval(x+85, y+30, 10, 10);
	}
	public void move() {
		x+=vx; //++で、速くなる(EX2)
		y+=vy;
		
		if(x > 450) {
			x -= 500;
		}
	}
	
	
}


