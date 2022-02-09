package parrotHW;

public class ParrotHW {
	
	public static boolean getUp(boolean squawking, int currentHour) {
		if(!squawking) {
			return false;
		}
		if(currentHour < 0 || currentHour > 23) {
			return false;
		}else if(currentHour < 6 || currentHour > 22) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getUp(true, 0));
	}

}
