public class Triangle extends Shape implements Measure {
    private int a , b , c , aHight;
    public Triangle (int a1 , int b1 , int c1 , int aHight1){
        this.setA(a1);
        this.setB(b1);
        this.setC(c1);
        this.setaHight(aHight1);
    }

    public void setA(int a1) {
        this.a = a1;
    }

    public void setB(int b1) {
        this.b = b1;
    }

    public void setC(int c1) {
        this.c = c1;
    }

    public void setaHight(int aHight1) {
        this.aHight = aHight1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getaHight() {
        return aHight;
    }

    @Override
    public void area() {
        System.out.println( (float) a * aHight / 2 );
    }

    @Override
    public void perimeter() {
        System.out.println( a + b + c );
    }

    @Override
    public void show() {
        System.out.println("三角形");
        System.out.println("a 邊長 =  " + getA() );
        System.out.println("b 邊長 =  " + getB() );
        System.out.println("c 邊長 =  " + getC() );
        System.out.println("a 邊高 =  " + getaHight() );
        System.out.print("面積 =  "); area();
        System.out.print("周長 =  "); perimeter();
        System.out.println("============================");
    }
}
