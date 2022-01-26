package static2;

public class Main01P276 {
	public static void main(String[] args) {
		//System.out.println(Asean.presentationScore);
		Asean a1 = new Asean(30,20,29);
		a1.showAseanInfo();
		Asean a2 = new Asean(25,20,27);
		a2.showAseanInfo();
		Asean a3 = new Asean(29,20,29);
		a3.showAseanInfo();
		Asean a4 = new Asean(28,20,29);
		a4.showAseanInfo();
		System.out.println(Asean.getPresentationScore());
		
	}

}
