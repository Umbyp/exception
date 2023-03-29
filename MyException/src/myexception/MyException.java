package myexception;


public class MyException extends Exception {
    public MyException(String msg) 
    {super(msg);
    }public MyException() {super();}

//  
//    public static void main(String[] args) {
//        try{
//            int[] list = new int[10];
//            System.out.println("list[10] is " + list[10]); // array has just 9 not 10
//        }
//        catch(ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        }
//        catch(RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch(Exception ex) {
//            System.out.println("Exception");
//        }
    }
    
}