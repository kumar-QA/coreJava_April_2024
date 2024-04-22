package aboutVaraibles;

public class LocalVaribles {
	
	LocalVaribles(){
		int r=600;//local
	}
	
	static {
		int g=700;//local
	}
	
	public static void main(String[] args) {
		int y=40;//
		if(true) {
		   System.out.println("hi");	
		   System.out.println("hello");	
		   System.out.println("bye");	
		   int b=100+200;//local
		}
		
	}

}
