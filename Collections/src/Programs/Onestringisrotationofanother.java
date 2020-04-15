package Programs;

public class Onestringisrotationofanother {
	
	
	
	public static boolean isRotated(String s, String s1){
		if(s.length()!=s1.length()){
			return false;
		}
		String sAdd = s + s;
		if(sAdd.contains(s1)){
			return true;
		}else{
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="soujanya";
		String s1="nyasouja";
		//Onestringisrotationofanother o=new Onestringisrotationofanother();
		System.out.println(isRotated(s,s1));
		

}
}
