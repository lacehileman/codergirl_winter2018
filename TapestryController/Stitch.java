package TapestryController;

public class Stitch
{
    public String stitch;

    public void sew()
    {
        System.out.print(stitch);;
    }

}

class ShortLineStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "-";
        System.out.print(stitch);
    }
}
class SmallCrossStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "x";
        System.out.print(stitch);
    }
}
class LargeCrossStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "X";
        System.out.print(stitch);
    }
}
class CircleStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "o";
        System.out.print(stitch);
    }
}
class FillStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "=";
        System.out.print(stitch);
    }
}
class BlockStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "[]";
        System.out.print(stitch);
    }
}
class ZigZagStitch extends Stitch
{
    public void sew()
    {
        this.stitch = "Z";
        System.out.print(stitch);
    }
}


/*
Stitch will be parent class with 7 child classes (reps a single stitch)

- ShortLineStitch
x SmallCrossStitch
X LargeCrossStitch
o CircleStitch
= FillStitch
[] BlockStitch
Z ZigZagStitch

Each class will have one method to print appropriate character:
public void sew()


 */
