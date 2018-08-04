package in.com.inherit;
//Main function
public class ChildTest {

	public static void main(String[] args) {
		Parent1 parent1;
		Parent2 parent2;
		
		 
		parent1=new Child();//upcasting
		parent1.display();
		
		
		parent2=new Child();//upcasting
		parent2.display();

	}

}
