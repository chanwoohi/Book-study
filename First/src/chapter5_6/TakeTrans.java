package chapter5_6;

public class TakeTrans {
	public static void main(String[ ] args) {
		Student4 studentJames = new Student4("James", 5000);
		Student4 studentTomas = new Student4("Tomas", 10000);
		Student4 studentChanWoo = new Student4("ChanWoo", 3000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentChanWoo.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentChanWoo.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		studentChanWoo.showInfo();
		
	}
	
	
}
