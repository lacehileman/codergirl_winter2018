package TapestryController;

public class TapestryController
{



    private static void printPattern(Pattern pattern, double failRate) {
        boolean needleJam = (Math.random() > failRate);
        //FIX!: Switched operator = bad!
        //Works with wrong logic; If needlejam true should print correct length
        //if needlejam false should print half; do I need to set a limit for math.random?

        if (needleJam)
        {
            for (int i = 0; i < 3; i++) {
                for (int t = 0; t < 8; t++) {
                    pattern.pattern();
                }
                System.out.println();
            }

            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
            for (int i = 0; i < 8; i++) {
                for (int t = 0; t < 6; t++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
        } else {
        //print half; there's got to be a cleaner, shorter way
            for (int i = 0; i < 3; i++) {
                for (int t = 0; t < 4; t++) {
                    pattern.pattern();
                }
                System.out.println();
            }

            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
            for (int i = 0; i < 8; i++) {
                for (int t = 0; t < 3; t++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Pattern crossWigglePat = new CrossStitchWigglePattern();
        Pattern zigZagPat = new ZigZagLinesPattern();
        Pattern baublePat = new BaublePattern();
        Pattern blockyPat = new BlockyBaublePattern();
        Pattern brokenwigglePat = new BrokenWigglePattern();

        printPattern(crossWigglePat, 0.05);
        printPattern(zigZagPat,0.00);
        printPattern(baublePat,0.00);
        printPattern(blockyPat,0.10);
        printPattern(brokenwigglePat, 0.40d);
    }
}
/*
Will contain the main method to print patterns and introduce Jam rate

boolean needleJam = (Math.random() < 0.40d); <-given code for jam rate

for each pattern print 8 blocks by 3 rows
few blank lines
for each pattern print 6 blocks by 8 rows


 - ShortLineStitch
x SmallCrossStitch
X LargeCrossStitch
o CircleStitch
= FillStitch
[] BlockStitch
Z ZigZagStitch

//xXxXxXxXxX              CrossStitchWigglePattern        5%
//ZZZ===ZZZ===            ZigZagLinesPattern              0%
//--o--o--o--o--o         BaublePattern                   0%
//[]--o--[]--o--[]--o--   BlockyBaublePattern             10%
//xXxXxXxXxX              BrokenWigglePattern (see note)  40%
*/
