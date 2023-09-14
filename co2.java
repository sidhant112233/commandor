public class co2{
    public static void main(String args[]){
        int a[]={10,20,30};
        int b[]={40,50,60};
        int i;
        int sum;
        for(i=0;i<a.length;i++)
        {
            sum = a[i] + b[i];
            System.out.println("A + b = "+sum);
        }
    }
}