public class ex01{
    public static void main(String[] args) {
        int yards,miles;
        double kilometers;

        yards = 385;
        miles = 26;

        kilometers = ( miles + ( yards / 1760 )) * 1.609;

        System.out.println(kilometers);
    }
}