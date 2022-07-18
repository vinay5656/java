package interfaceEx;

public class Persion implements Student,Youtuber{

	public static void main(String[] args) {
		Persion p = new Persion();
		p.GoingToCollege("Thapar  University");
		p.Study("Vinay");
		p.makeVideo("Comedy");
		p.editVideo("middle part");
		

	}

	@Override
	public void makeVideo(String namevideo) {
		System.out.println(name+" is making "+namevideo+" video ");
	}

	@Override
	public void editVideo(String partvideo) {
		System.out.println(name+" is editing "+partvideo+" of video");
		
	}

	@Override
	public void GoingToCollege(String nameCollege) {
		System.out.println(Sname+" is going to "+nameCollege);
		
	}

	@Override
	public void Study(String name) {
		System.out.println(name+" is doing her tudy");
		
	}

}
