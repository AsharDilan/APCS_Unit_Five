public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;

        if (numerator>0 && denominator<0)
        {
            this.numerator*=-1;
            this.denominator*=-1;
        }
        reduce();
    }
    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }
    @Override
    public String toString() {
        if (denominator > numerator)
            return "" + numerator + "/" + denominator;
        int wholeNum = numerator/denominator;
        int newNumerator = numerator%denominator;
        return wholeNum + " " + newNumerator + "/" + denominator;

    }
        public static int gcd(int a,int b){
        int t;
        while(a%b!=0){
            t=b;
            b = a%b;
            a = t;
        }
        return b;

    }
    public void reduce(){
        int gcd = gcd(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;

    }
    public static Fraction add(Fraction f1,Fraction f2)
    {
        return new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator,f1.denominator*f2.denominator);
    }
    public static Fraction sub(Fraction f1,Fraction f2)
    {
        return new Fraction(f1.numerator*f2.denominator-f2.numerator*f1.denominator,f1.denominator*f2.denominator);
    }
    public static Fraction mul(Fraction f1,Fraction f2)
    {
        return new Fraction(f1.numerator*f2.numerator,f1.denominator*f2.denominator);
    }
    public static Fraction div(Fraction f1,Fraction f2){

        return new Fraction(f1.numerator*f2.denominator,f1.denominator*f2.numerator);
    }
}
