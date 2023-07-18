
public class test {
    public static void main(String [] arg){
        int a = 15;
        a+= 5;
        a-= 4;
        System.out.println(a);
     int b = a;
        b+= 1;
    int x = b + 1;
     if (b % 2 == 0 && b * x % 3 == 0 ){
         System.out.println("il numero è pari ed è multiplo di 3");
     }
         else { System.out.println("Il numero non è pari e non è multiplo di 3");
             System.out.println( "parliamo del numero  " + b);

    }
}}
