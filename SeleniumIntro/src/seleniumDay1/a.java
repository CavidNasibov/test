package seleniumDay1;

public class a {
public static void main(String[] args) {
	a b= new a();
	System.out.println(b.areaBetween(4.5, 3.5));
}
private double areaBetween(double a, double b)
{
    if (Math.signum(a) == Math.signum(b))
    {
        if (Math.abs(a) > Math.abs(b))
            return a - b;
        else
            return b - a;
    }
    else
    {
        return a + b;
    }
}
}
