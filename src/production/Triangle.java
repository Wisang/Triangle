package production;

public class Triangle {

    public static int getShape(int a, int b, int c) {
        if(a+b<=c || b+c<=a || c+a<=b)
            return -1;
        if(a == b && b==c)
            return 3;
        if(a==b || b==c || c==a)
            return 2;
        return 1;
    }    
}
