package firstclass;

public class TV {
	String brand;
	boolean isSmart; // boolean data-type accepts the values "true" or "false"
	boolean isLED; // if the TV LED then this variable should be true; otherwise it should be false
	boolean is4K;
	int screenSize;
	int numberOfHdmiInputs;
	double price;
	boolean status; // this variable shows whether the TV is on or off
	
	void turnOn(){
		status = true;
		// later we will learn the keyword "this" and then we will change the code to: this.status = true;
		System.out.println("TV is on");
	}
	
	void turnOff(){
		status = false;
		// later we will learn the keyword "this" and then we will change the code to: this.status = false;
		System.out.println("TV is off");
	}

}
