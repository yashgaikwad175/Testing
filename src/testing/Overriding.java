package testing;
 class Java {
	void run(){System.out.println("Vehicle is running");}
	
}
class Bike2 extends Java
{
   void run()
   {
	   System.out.println("Bike is running safely");
    }
}

class Overriding {
 public static void main(String args[])
   {
  Bike2 obj = new Bike2();
  obj.run();
}
}
