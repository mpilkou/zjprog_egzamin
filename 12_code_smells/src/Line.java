public class Line implements DistanseInterface{
  private Point point1;
  private Point point2;

  public Line() {}

  public Line(Point point1, Point point2) {
    this.point1 = point1;
    this.point2 = point2;
  }

  public void setPoint1(Point point1) {
    this.point1 = point1;
  }
  public Point getPoint1() {
    return point1;
  }

  public void setPoint2(Point point2) {
    this.point2 = point2;
  }
  public Point getPoint2() {
    return point2;
  }

  public void showPoints() {
    System.out.println("P1 = (" + this.point1.getX() + ", " + this.point1.getY() + ")");
    System.out.println("P2 = (" + this.point2.getX() + ", " + this.point2.getY() + ")");
  }

  static final int POWER = 2;

  public double calculateDistance() {
    return Math.sqrt(Math.pow(this.point1.getX() - this.point2.getX(), POWER) 
          + Math.pow(this.point1.getY() - this.point2.getY(), POWER));
  }

  public static void printResult(double distance) {
    System.out.printf("Distance between P1 and P2: %.2f\n", distance);
  }

  public void euclideanDistance() {
    this.showPoints();
    printResult(this.calculateDistance());
  }
}
