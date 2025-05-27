
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
	*/
		
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
	}
}
