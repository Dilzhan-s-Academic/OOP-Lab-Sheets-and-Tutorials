public class ex03{
    public static void main(String[] arg){
        Calculation.add(10,32);
        Calculation.sub(157,43);
    }
}

public class Calculation{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
}