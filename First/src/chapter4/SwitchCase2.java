package chapter4;

public class SwitchCase2 {
		// Switch 문 예문 2
	public static void main(String[] args) {
		String medalColor = "Gold";
		
		switch(medalColor){
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		
		}

	}

}
