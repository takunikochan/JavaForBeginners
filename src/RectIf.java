
public class RectIf extends MyFrame{
	public void run() {
		
		int x=30;
		int y=30;
		setColor(0,128,0);
		int i;
		for( i=0 ; i<10 ; i++) {
		   fillRect(x,y,10,100);
			x+=15;
			y+=20;
			fillRect(x,y,10,100);
		
		}
	
	}
}
