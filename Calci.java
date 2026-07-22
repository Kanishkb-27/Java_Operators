class Calci{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Guess the answers");
        System.out.println("Unary Operator"+(a++));
        System.out.println("Unary Operator"+(++b));
        System.out.println("Value of a:"+(a));
        System.out.println("Value of b:"+(b));
        System.out.println("13+16="+(13+16));
        int i=++a*b++;
        System.out.println(i);
        System.out.println("Value of a:"+(a));
        System.out.println("Value of b:"+(b));
        int x=(a>b)?a:b;
        System.out.println(x);
    }
}