package testing;

public class MethodOverloading {

    // this method accepts int
    static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
       static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display("OK");
    }

}
