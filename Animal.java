package day;

public class Animal {
	
	 public static void main(String[]args) {
		 
		 pet H=new pet();
		 
		 H.dog();
		 H.cat();
		 H.makesound();
		 
		 
	 }
	

	
	
}
	class Dog{
		
	 void makesound(){
		 System.out.println(" This animal makes soud");
	 
	 }
	}
	 
	 class pet extends Dog{
		  void dog() {
			  System.out.println(" The do bark");
		  }
		  void cat() {
			  System.out.println("The cat meows");
		  }
	 }

		 
			
		 
		 
	 

	

	


