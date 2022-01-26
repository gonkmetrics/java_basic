package static2;

public class Asean {
	private int check;
	private int midTerm;
	private int finalTerm;
	private static int presentationScore = 19;
	
	public Asean(int check, int midTerm, int finalTerm) {
		this.check=check;
		this.midTerm=midTerm;
		this.finalTerm=finalTerm;
	}
	
	public void showAseanInfo() {
		System.out.println("check: "+check+"점");
		System.out.println("midTerm: "+midTerm+"점");
		System.out.println("finalTerm: "+finalTerm+"점");
		System.out.println("presenationScore: "+presentationScore+"점");
	}

	public static int getPresentationScore() {
		return presentationScore;
	}

	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}
	
	

}
