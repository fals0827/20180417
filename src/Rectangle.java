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

    }

    @Override
    public void perimeter() {

    }

    @Override
    public void show() {

    }
}
