package anonymousClass;

interface Plant{
	void description();
}

class Tree{
	void description() {
		System.out.println("Hello, I am a big Tree.");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.description();
		
//        Plant plant = new Plant(); No, you cannot instantiate an interface.
		Plant plant1 = new Plant() {
			@Override
			public void description() {
				System.out.printf("Plant1 is the object of class which implements the Plant interface.\nIt means plant1 is object of anonymous class.");
			}
		};
		plant1.description();
		
		// Anonymous child class for Tree class
		
		Tree tree1 = new Tree() {
			@Override
			void description() {
				System.out.printf("Hello, I am a object of child class of Tree Class.\nChild class is ANONYMOUS");
			}	
		};
		
		tree1.description();
	}

}
