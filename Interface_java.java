abstract class A{
    public abstract void show();
    public abstract void hide();
}

interface C{

    int age =  21;                //Final and Static
    String area = "Bhandup";
    void run();
    void stop();
}


 class B extends A implements C{

     @Override
     public void show() {
         System.out.println("Showing");
     }

     @Override
     public void hide() {
         System.out.println("Hiding");
     }

     public void run(){
         System.out.println("Running");
     }

     public void stop(){
         System.out.println("Stopping");
     }

//     int age = 20;
//     String Area = "KanjurMarg";
 }

public class Interface_java {
    public static void main(String[] args) {
    A a = new B();
    a.show();
    a.hide();

    B b = new B();
    b.run();
    b.stop();



    //Manipulate interface
    int age = b.age;
    age = 50;
    String area = b.area;
    area = "V";
    System.out.println(age);
    System.out.println(area);

    //Get
    System.out.println(C.age);
    System.out.println(C.area);

    }
}
