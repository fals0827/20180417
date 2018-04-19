public class Rectangle extends Shape implements Measure{
    private int weight , height ;
    public Rectangle (int weight1 , int height1){
        this.setWeight(weight1);
        this.setHeight(height1);
    }

    public void setHeight(int height1) {
        this.height = height1;
    }

    public void setWeight(int weight1) {
        this.weight = weight1;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void area() {
        System.out.println(weight * height);
    }

    @Override
    public void perimeter() {
        System.out.println( (weight + height) * 2 );
    }

    @Override
    public void show() {
        System.out.println("矩形");
        System.out.println("寬 =  " + getWeight());
        System.out.println("長 =  " + getHeight());
        System.out.print("面積 =  "); area();
        System.out.print("周長 =  "); perimeter();
        System.out.println("============================");
    }
}
