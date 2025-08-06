class car
{
    String  nameofCompany;
    boolean isAvailable;
 
    car(String nameofCompany,boolean isAvailable)
	{
	   this.nameofCompany=nameofCompany;
	   this.isAvailable=isAvailable;
 
	}
 
    public void getCarDetails()
	{
	  System.out.println("Company"+nameofCompany);
	  System.out.println("Availability"+isAvailable);
 
	}
   }
 
   class Bmw extends car  // derived class
     {
	 String carName,modelName,color;
 
	 Bmw(String carName,String modelName,String color)
	  {
	     super("Bmw",true);
	     this.carName=carName;
	     this.modelName=modelName;
	     this.color=color;
	   }
 
	  public void displayCarModel()
		{
	           System.out.println("Name of the car"+carName);
		   System.out.println("Model"+modelName);
		   System.out.println("Color"+color);
		}
      }	
 
    class demoinher3
     {
       public static void main(String ads[])
	{
	   Bmw c1=new Bmw("Bmw","M4 competetion","black");
	   c1.getCarDetails();
	   c1.displayCarModel();				
	}
     }	
 