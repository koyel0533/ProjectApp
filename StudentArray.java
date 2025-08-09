import java.util.Scanner;

class StudentArray
{
	public static void main(String args[])
	{
		int choice;
		Student x=null;
		Scanner sc=new Scanner(System.in);
		StudentStack st=new StudentStack(8);
		
		while(true)
		{
			System.out.println("1. Push an element.");
			System.out.println("2. Pop an element.");
			System.out.println("3. Display the top element.");
			System.out.println("4. Display all elements.");
			System.out.println("5. Display the size of the stack.");
			System.out.println("6. email checking.");
			System.out.println("7. Quit.\n\n");
			System.out.println("Enter your Choice\n");
			choice=sc.nextInt();
			
			if (choice==7)
				break;
			
			switch(choice)
			{
				case 1: 
				System.out.println("Enter the element to be pushed....");
				Student st1=new Student(sc.nextInt(), sc.nextLine(), sc.nextLine());
		        st.push(st1);
				st.push(x);
				break;
				
				case 2: 
				x=st.pop();
				System.out.println("Popped element is "+x);
				break;
				
				case 3: 
				
				System.out.println("element at the top is "+st.peek());
				break;
				
				case 4: 
				
				st.display();
				
				break;
				case 5: 
				
				System.out.println("Size of the stack is "+st.size());
				
				break;
				case 6:
				st.searchByEmail(sc.nextLine());
				
				
				break;
				
				default:
				
				System.out.println("WRONG CHOICE!!!!");
			}
			System.out.println("");
		}
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
		