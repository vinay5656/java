package upcastingAndDownCasting;


public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera camera1 = new Camera();
		Machine machine1 = new Machine();
		
		camera1.feature();
		camera1.work();
		
		machine1.work();
		
		/*
		 *  Upcasting :- upcasting is safe.
		 * it depands on what type of object you referring to.
		 * You can access the feature/access area less or same as your access area.
		 * You cannot access the feature in which you don't have access or you are not having in your access area
		 * 
		 * */
		// machine is parent class 
		//camera is child class
		// So, Machine type of object can refer to Camera type of object it's called upcasting
		
		Machine machine2 = new Camera();
		machine2.work();// Camera::work() is invoked. it depands on actual object it is referring to.
		
		/*
		 * Downcasting is unsafe.
		 * we should avoid downcasting.*/
		
		Camera camera2 = (Camera)machine2;// machine2 is actually referring to a Camera type of object
		//So, it can access the all feature in it's access area
		camera2.work();
		camera2.feature();
		
		// This doesn't work// Downcasting
//		Camera camera3 = (Camera)machine1;//new Machine();//both give error// even after adding casting error will come in console
//		camera3.feature();
//		camera3.work();
		
		
		
		

	}

}
