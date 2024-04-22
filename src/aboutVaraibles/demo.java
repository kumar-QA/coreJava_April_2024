package aboutVaraibles;
public class demo {
   int a=500;//global
   int d=500;//global
     void m1(int f,int u) {
    	 
    	 System.out.println(f+u);//
    	 //f u --local varaibles
    	 if(true) {
    		 int j=5000;//local
    	 }
    	 int i=550;//local
     }
     int m=44;//global
	public static void main(String[] args) {
		//args local varibles
		int r=600;//local
		if(true) {
			int p=55;//local
		}
		int w=55;//local
	}
	int c=44;//global
	static {
		int y=770;//local
		int t=600;//local
	}
	
	 int l=6;//global	
}
