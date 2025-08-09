import java.util.EmptyStackException;
class StudentStack{
	
	private Student[] stackArray;
	private int top;
	StudentStack(int maxSize)
	{
		stackArray=new Student [maxSize];
		top=-1;
		System.out.println("array is ready for given no of employee");
		
		
	}
	public int size(){
		return top+1;
		
	}
	public boolean isFull()
	{
		return(top==stackArray.length-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
		
	}
    	
	
	
	public void searchByEmail(String email) {
        if(isEmpty())
        {
            System.out.println("The stack is empty");
            throw new EmptyStackException();
        }
        for (Student st:stackArray) {
            if (st.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Found by email: " + st.getEmail());

            }
            else
            {
                System.out.println("Not found by email: " + email);
            }
        }
	}
	
	
	public void push(Student x)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
			
		}
		top=top+1;
		stackArray[top]=x;
		
		
	}
	public Student pop()
	{
		Student x;
		if(isEmpty())
		{
		System.out.println("Stack underflow");
		throw new EmptyStackException();
		}
		x=stackArray[top];
		top=top-1;
		return x;
	    
	}
	
	public Student peek()
	{    Student x;
		if(isEmpty())
		{
		System.out.println("Stack underflow");
		throw new EmptyStackException();
		}
		return stackArray[top];
	
	}
	public void display()
	{
		if(isEmpty())
		{
		System.out.println("Stack underflow");
		return;
		}
		for(int i=top;i>=0;i--)
			System.out.println(stackArray[i]+" ");
		System.out.println();		
	}

	
}
