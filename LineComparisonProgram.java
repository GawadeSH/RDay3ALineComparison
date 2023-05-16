package linecomparison;

public class LineComparisonProgram
{
    int x1 = 2, y1 = 5;         //point 1=(x1,y1)=(1,1)
    int x2 = 1, y2 = 4;         //point 2=(x2,y2)=(4,4)
    int x3 = 4, y3 = 5;          //point 3=(x3,y3)=(4,5)
    Double len1,len2;
    void length()
    {
        len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length between point 1 and 2  ( Line 1 )-" + len1);
        len2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        System.out.println("length between point 2 and 3 ( Line 2) -"+len2);

        System.out.println("line 1 and line2 are equals  -----" + len1.equals(len2));
        int a=(len1.compareTo(len2));
        if(a == 0)
        {
            System.out.println("Lines are equal");
        }
        if(a > 0)
        {
            System.out.println("Line1 greater than line2");
        }
        if(a < 0)
        {
            System.out.println("Line1 Smaller than line2");
        }

    }

    public static void main(String[] args)
    {
        LineComparisonProgram obj = new LineComparisonProgram();
        System.out.println(" Welcome to Line Comparison Computation Program");
        obj.length();

    }
}
