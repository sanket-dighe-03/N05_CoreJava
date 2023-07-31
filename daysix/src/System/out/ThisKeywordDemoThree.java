package System.out;

public class ThisKeywordDemoThree {
	void print(ThisKeywordDemoThree A)
	{
		System.out.println("Hey there,iam using 'this'"+"keyword");
	}
	void display() 
	{
		print(this);
		/* when u call any parametrized method inside
		 * non-paramertrized  mmethod then,we get an error 
		 * tok overcome this we have to use this keyword as an argument
		 * in this call
		 */
	}

	public static void main(String[] args) {
		 ThisKeywordDemoThree A=new ThisKeywordDemoThree();
		 A.display();
	}

}
