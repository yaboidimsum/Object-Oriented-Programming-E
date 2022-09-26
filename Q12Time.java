
public class Q12Time {
// Function to compute the angle between the hour and minute hand
public static int findAngle(int hh, int mm)
{
    // handle 24-hour notation
    hh = hh % 12;

    // find the position of the hour's hand
    int h = (hh * 360) / 12 + (mm * 360) / (12 * 60); //30+0

    // find the position of the minute's hand
    int m = (mm * 360) / (60); //246

    // calculate the angle difference
    int angle = Math.abs(h - m);

    // consider the shorter angle and return it
    if (m*5 > h) {
        angle = 360 - angle;
    }
    else
    {
    	return angle;
    }

    return angle;
}

// Clock Angle Problem
public static void main(String[] args)
{
    int hh;
    int mm;

    System.out.println(findAngle(9, 00));
    System.out.println(findAngle(3, 00));
    System.out.println(findAngle(18, 00));
    System.out.println(findAngle(1, 00));
    System.out.println(findAngle(2, 30));
    System.out.println(findAngle(4, 41));
    
}
}