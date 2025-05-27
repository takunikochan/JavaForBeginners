
public class RectIf extends MyFrame{
	public void run() {
		
		int x=50;
		int y=50;
		setColor(0,128,0);
		int i;
		for( i=0 ; i<10 ; i++) {
		   fillRect(y,30,10,x);
			x+=20;
			y+=20;
			fillRect(y,30,10,x);
		
		}
	
	}
}
