package Car_Chapter15;

public class Car_Chapter15 {
	private int justBeforeGear = 1;
	private int gear = 1;
	private int speed = 10;


public void gearChange(int afterGear) {
	this.justBeforeGear = this.gear;
	this.gear = afterGear; 
	
	switch(this.gear) {
	case 1 -> speed =10;
	case 2 -> speed =20;
	case 3 -> speed =30;
	case 4 -> speed =40;
	case 5 -> speed =50;
	default -> speed =10;
	}
	
	
}

public void run() {
	System.out.println("ギア" + this.justBeforeGear + "から" + this.gear + "に切り替えました");
	 System.out.println("速度は時速" + this.speed +"kmです");
	
	}
	
}

