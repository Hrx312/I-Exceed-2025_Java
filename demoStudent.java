class Student
 {
    String name,dept;
    int roll;
    Address adr;
    Marks mr;
 
    Student(int roll,String name,String dept,Address adr,Marks mr)
    {
        this.roll=roll;
        this.name=name;
        this.dept=dept;
        this.adr=adr;
        this.mr=mr;
    }
 
    public void displayStudent()
        {
            System.out.println("Name of the student"+name);
            System.out.println("Roll"+roll);
            System.out.println("Department"+dept);
            adr.displayAddress();
            mr.displayMarks();
        }
 
 }
 
 class demoStudent
  {
      public static void main(String[] args) {
          Address a1=new Address("Koramangala A blk","Bangalore",2,4324324);
          Marks m1=new Marks(99,100,77,88);
          Student s1=new Student(1,"Rakesh","cse",a1,m1);
          s1.displayStudent();
 
      }
  }