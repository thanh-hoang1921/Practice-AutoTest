package Slide1.staticBlock;

//public class Demo  
//{  
//    static double percentage;  
//    static int rank;  
//    static  
//    {  
//        percentage = 44.6;  
//        rank = 12;  
//        System.out.println("STATIC BLOCK");  
//    }  
//    public static void main(String args[])  
//    {  
//        Demo st = new Demo();  
//        System.out.println("MAIN METHOD");  
//        System.out.println("RANK: " + rank);  
//    }  
//}  

//------ multiple static block
//public class Demo  {  
//   static   {  
//       System.out.println("FIRST STATIC BLOCK");  
//   }  
//   static  {  
//       System.out.println("SECOND STATIC BLOCK");  
//   }  
//   static  {  
//       System.out.println("THIRD STATIC BLOCK");  
//   }  
//   public static void main(String[] args)   {  
//   }  
//}  

//---- memory management of static block
public class Demo  
{  
    static int i;  
    static  
    {  
        i=20;  
    }  
    static void print()  
    {  
        System.out.println(i);  
    }  
    public static void main(String[] args)  
    {  
        print();  
        i=200;  
        print();  
    }  
}  
