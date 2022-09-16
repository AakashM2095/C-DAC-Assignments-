class Obj1
{
	//instance variable
	String name;
	int id;
	int age;
	
	public static void main(String args[])
	{
		// local variable
		int i=10;
		
		// Referance object created
		// stored in stack
		Obj1 o1=new Obj1();
		Obj1 o2=new Obj1();
		
		// assigning value to variable instance
		// Stored in Heap
		o1.name="Aakash";
		o1.id=12
		o1.age=23;
		
		o2.name="Nayun";
		o2.id=18
		o2.age=25;
		
		System.out.println("Name= "+o1.name);
		System.out.println("Id= "+o1.id);
		System.out.println("Age= "+o1.age);
		System.out.println("Name= "+o1.name);
		System.out.println("Id= "+o2.id);
		System.out.println("Age= "+o1.age);
		
		
		
	}
}

