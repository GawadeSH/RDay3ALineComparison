package linecomparison;

public class LineComparisonProgram
{
    int x1 = 2, y1 = 5;         //point 1=(x1,y1)=(1,1)
    int x2 = 1, y2 = 4;         //point 2=(x2,y2)=(4,4)
    Double len1;
    void length()
    {
        len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length between point 1 and 2  ( Line 1 )-" + len1);
    }
    public static void main(String[] args)
    {
        LineComparisonProgram obj = new LineComparisonProgram();
        System.out.println(" Welcome to Line Comparison Computation Program");
        obj.length();

    }
}
