
public class RectIf extends MyFrame{
	public void run() {
		
		int x=50;
		int y=0;
		int i;
		
		for( i=0 ; i<10 ; i++) {
			setColor(y,y,y);
		   fillRect(x,50,10,100);
			x+=20;
			y+=20;
			fillRect(x,50,10,100);
		
		}
	
	}
}
