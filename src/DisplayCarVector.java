import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();

	//	cars.add(new Car(50,50,1,0));
	//	cars.add(new Car(50,125,2,0));
	//	cars.add(new Car(50,200,3,0));
	//	cars.add(new Car(50,275,4,0));
	//	cars.add(new Car(50,350,5,0));
		
		for(int i=0; i<5; i++) {
			cars.add(new Car(50, 60*i+50,i+1,0));
			
		}
	
		while(true) {
			clear();
			
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.05);
		}
		
		
	}
}
