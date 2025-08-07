class sample6
{
    String name,dept;
    int age; 
    sample6(String name,int age,String dept)
	{
	  this.name=name;
	  this.age=age;	 
	  this.dept=dept;
	}
    public void displayStudent()
	{
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
	   System.out.println("Department="+dept);
	}
   }
 
class teacher extends sample6
{
    teacher(String name,int age,String dept)
	{
	   super(name,age,dept);
	   System.out.println("Name of the Teacher is = "+name);
	}
}
 
class dmeoinher2
{
    public static void main(String asd[])
	{
	    teacher obj=new teacher("Harsh",23,"ISE");
	}
}