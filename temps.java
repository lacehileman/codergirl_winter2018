public class temps
{
    public static int sum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
        return sum;
    }

    private static int findOneColumnSum(int[][] arr, int col)
    {
        int total = 0;
        for (int row = 0; row < arr.length; row += 1)
        {
            total += arr[row][col];
        }
        System.out.println(total/arr.length);
        return total;
    }

    public static int findTotalAvg(int[][] arr)
    {
        int total = 0;
        for (int row = 0; row < arr.length; row += 1)
        {
            for (int col = 0; col < arr.length; col += 1)
            {
                total += arr[row][col];
            }
        }
        int avg = (total / arr.length)/arr.length;
        System.out.println(avg);
        return total;
    }

    public static void main(String[] args)
    {
        String[] weekDays = {"       ","Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
        String[] times = {"7 A.M.", "3 P.M.", "7 P.M.", "3 A.M."};

        int[][] temps =
        {
            {68,70,76,70,68,71,75},
            {76,76,87,84,82,75,83},
            {73,72,81,78,76,73,77},
            {64,65,69,68,70,74,72}
        };

        System.out.println("Temperature Calculator");
        System.out.println("The data provided is:\n");

        //print day names

        for(int k = 0; k < weekDays.length; k++)
        {
            System.out.print(weekDays[k] + "   ");
        }
        System.out.println();

        //print times and temps
        for (int i = 0; i < times.length; i++)
        {
            System.out.print(times[i]);
            for (int j = 0; j < weekDays.length - 1; j++)
            {
                System.out.printf("%7d", temps[i][j]);
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("Based on that data, the following are the average temperatures for the week:\n");

            for (int i = 1; i <= temps.length + 3; i++)
            {
                System.out.print("The average temperature for " + weekDays[i] + " was: ");
                findOneColumnSum(temps, (i - 1));
            }
        System.out.println();

        //weekly avg temp for time stamp
        for (int i = 0; i < times.length; i++)
        {
            System.out.print("The average weekly temperature for " + times[i] + " was: ");
            sum(temps[i]);
        }
        System.out.println();
        
        //overall weekly average:
        System.out.print("The final average temperature for the week was: ");
        findTotalAvg(temps);

    }

}
/*
Data chart
        sun mon tue wed thu fri sat
         0   1   2   3   4   5   6
7 am 0  68  70  76  70  68  71  75 ~71 (498)294
3 pm 1  76  76  87  84  82  75  83 ~80 (563)
7 pm 2  73  72  81  78  76  73  77 ~75 (530)
3 am 3  64  65  69  68  70  74  72 ~68 (482)
       ~70 ~70 ~78 ~75 ~74 ~73 ~76
       516

calculate:
avg temp for each day (7 results; sun, mon, tue...)
avg temp for each time (4 results; 7 am, 3 pm, 7 pm, 3 am)
avg temp overall (1 result; overall) ~ 73

Note: use nested for loops to navigate array.
outer for loop = time of day(row)
inner for loop = day of week(column)
caution rounding
if data changes in main array then check new calculations are correct

Example code:
int[] [] temps = new int [4][7];
temps[0][3] = 68;
temps[3][6] = 72;

 */
