public class Averager5
{
  private int one;
  private int two;
  private int three;
  private int four;
  private int five;
  
  public Averager5(int one, int two, int three, int four, int five)
  {
    this.one = one;
    this.two = two;
    this.three = three;
    this.four = four;
    this.five = five;
  }
  
  public double getAverage()
  {
    return ((this.one + this.two + this.three + this.four + this.five) / 5);
  }
  
  public static void main(String[] args)
  {
    Averager5 basicAverage = new Averager5(1,2,3,4,5);
    double average = basicAverage.getAverage();
    System.out.println(average);
  }
}