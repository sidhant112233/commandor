public class co1{
    public static void main(String args[]){
        int a = 1;
        int b = 10;
        int ch = 1;

        System.out.println(" 1 for abbstraction");
        System.out.println(" 2 for substraction");
        System.out.println(" 3 for multiphication");
        System.out.println(" 4 for addition");
        
        switch (ch){
            case 1 :
                System.out.println(+a+" + " +b+" = "+(a+b));
            case 2 :
                System.out.println(+a+" - " +b+" = "+(a-b));
            case 3 :
                System.out.println(+a+" * " +b+" = "+(a*b));
            case 4 :
                System.out.println(+a+" / " +b+" = "+(a/b));
                
        }
    }
}