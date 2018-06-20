package TapestryController;

import java.util.Random;

public class Pattern
{
    Stitch shortLine = new ShortLineStitch();
    Stitch smallCross = new SmallCrossStitch();
    Stitch largeCross = new LargeCrossStitch();
    Stitch circle = new CircleStitch();
    Stitch fill = new FillStitch();
    Stitch block = new BlockStitch();
    Stitch zigZag = new ZigZagStitch();



    public void pattern()//needs to check how many stitches are required,
                         // one loop equals stitch pattern
    {
    }


}
//  xXxXxXxXxX pattern xX
class CrossStitchWigglePattern extends Pattern
{
    public void pattern()
    {
        smallCross.sew();
        largeCross.sew();
    }
}

//  ZZZ===ZZZ=== pattern ZZZ===
class ZigZagLinesPattern extends Pattern
{
    public void pattern()
    {
        for (int i = 0; i <= 2; i++)
        {
            zigZag.sew();//3stitches
        }
        for (int i = 0; i <= 2; i++)
        {
            fill.sew();//3stitches
        }
    }
}

//  --o--o--o--o--o pattern --o
class BaublePattern extends Pattern
{
    public void pattern()
    {
        for (int i = 0; i <= 1; i++)
        {
            shortLine.sew();//2stitches
        }
            circle.sew();//1stitch
    }
}

//  []--o--[]--o--[]--o-- pattern []--o
class BlockyBaublePattern extends Pattern
{
    public void pattern()
    {
        block.sew();//1stitch
        for (int i = 0; i <= 1; i++) {
            shortLine.sew();//2stitches
        }
        circle.sew();//1stitch
        for (int i = 0; i <= 1; i++) {
            shortLine.sew();//2stitches
        }
    }
}

//  xXxXxXxXxX pattern xX
class BrokenWigglePattern extends Pattern
{
    public void pattern()
    {
        smallCross.sew();
        largeCross.sew();
    }
}

/*
provides a pattern() method

pattern will be parent class with 5 child classes (reps a pattern)

Pattern                 Class Name                      Needle Jam Rate
xXxXxXxXxX              CrossStitchWigglePattern        5%
ZZZ===ZZZ===            ZigZagLinesPattern              0%
--o--o--o--o--o         BaublePattern                   0%
[]--o--[]--o--[]--o--   BlockyBaublePattern             10%
xXxXxXxXxX              BrokenWigglePattern (see note)  40%

Needs to simulate a failure rate for needle jams (break)

Use a random number generator, new value each time called

Example:
 */
