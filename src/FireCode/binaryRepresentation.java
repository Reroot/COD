package FireCode;

public class binaryRepresentation {
	public int binaryRepresentation(int x) {
		if(x>1) {
			return 0;
		}
		return binaryRepresentation(x/2) + binaryRepresentation(x%2);
		
	}
	public static void main(String[] args) {

	}

}
