class Marks
 {
    int math,science,chem,history;

 
      Marks(int math,int science,int chem,int history)
        {
            this.math=math;
            this.science=science;
            this.chem=chem;
            this.history=history;
        }
     public void displayMarks()
     {
        System.out.println("Math marks"+math);
        System.out.println("Science marks"+science);
        System.out.println("Chemistry marks"+chem);
        System.out.println("History marks"+history);
     }
 }