class company

{

    String nameofcom;

    String city;
 
    company(String nameofcom,String city)

	{

	  this.nameofcom=nameofcom;

	  this.city=city;

	}
public void display1()
{
	System.out.println("Name of company:"+nameofcom);
        System.out.println("name of the city:"+city);

}

  }
 
class HR extends company

{
    String nameofhr,age;
    HR(String nameofhr,String age)

	{
         super("iexceed","Bengaluru");
         this.nameofhr=nameofhr;
         this.age=age;
          
	}
public void display()
{

         System.out.println("Name of the Hr is "+nameofhr);
         System.out.println("Age of the hr="+age);
         
}

}
class Finance extends company

{
    String salary,fname;
    Finance(String salary,String fname)

	{
         super("iexceed","Bengaluru");
         this.salary=salary;
         this.fname=fname;
 
	}
public void display()
{
         System.out.println("Name of the Financer is "+fname);
         System.out.println("salary="+salary);
}

}
class company1
{
	public static void main(String ads[])
	{
		HR obj=new HR("Harsh","23");
                Finance fin=new Finance("23000","Dhruthi");
                obj.display();
                fin.display();
		obj.display1();
                

	}
}


 