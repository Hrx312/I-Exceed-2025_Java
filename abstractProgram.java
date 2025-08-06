abstract class Car1{
    void baseStruct () {
        System.out.println("basic car body.");
    }
    abstract void addColor();
    abstract void addbodykit();
 
}
 
class mercedes extends Car1 {
    @Override
    void addColor() {
        System.out.println("Added color to the car.");
    }
    @Override
    void addbodykit() {
        System.out.println("Added bodykit to the car.");
    }
}
 
public class abstractProgram {
    public static void main(String[] args) {
        mercedes mCar =new mercedes();
        mCar.baseStruct();
        mCar.addColor();
        mCar.addbodykit();
        System.out.println("Car has been Made");
    }
   
}