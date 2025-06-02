
public class Animation extends MyFrame{
	public void run() {
		//【確認問題5-1】
	//	int x=30;
	//	int y=180;
	//	
	//	while(y>=50) {
	//		clear();
	//		setColor(0,128,0);
	//		fillRect(x,y,10,100);
	//		y-=5;
	//		sleep(0.1);
	//	}
	//	while(x<=170) { 
	//		// 画面を消す
	//		clear();
	//		// 四角形を表示する
	//		setColor(0,128,0);
	//		fillRect(x,y,10,100);
	//		x+=5;
	//		sleep(0.1);
	//	}
		
		//【確認問題5-2】
		
	/*	int x=30;
		int y=50;
		
		while(y<=250){
	     clear();
		setColor(0,128,0);
		fillRect(x,y,10,100);
		x+=5;
		y+=5;
		sleep(0.1);
		}
		while(x>=30){
		     clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
	     }
		while(x<=250){
		     clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			y-=5;
			sleep(0.1);
			}
	
		
		//【確認問題5-3】
		int y=100;
		int x=30;
		
		for(int i=0 ; i<4 ; i++) {
		while(x<=170) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
			while(x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
			
		}
		}
		
		
		//【EX問題１】
		int x=50;
		int y=50;
		while(true) {
		while(x<=180) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.03);
		}
		while(y<=180) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y+=5;
			sleep(0.03);
		}
		while(x>=50) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.03);
		}
		while(y>=50) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.03);
		}
		}
		*/
		
		//【EX問題２】
		
		while(true) {
			int x=50;
			int y=50;
		while(x<=180) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.03);
		}
		while(y<=180) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y+=5;
			sleep(0.03);
		}
		while(x>=50) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.03);
		}
		while(y<=240) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y+=5;
			sleep(0.03);
		}
		}
	}
}
