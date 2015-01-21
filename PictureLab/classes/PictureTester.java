/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test OnlyBlue */
    public static void testOnlyBlue()
    {
        Picture red = new Picture("beach.jpg");
        red.explore();
        red.keepOnlyBlue();
        red.explore();
    }

    /** Method to test zeroBlue */
    public static void testGrayScale()
    {
        Picture red = new Picture("beach.jpg");
        red.explore();
        red.grayScale();
        red.explore();
    }


    /** Method to test zeroBlue */
    public static void testfixWater()
    {
        Picture beach = new Picture("water.jpg");
        beach.explore();
        beach.fixWater();
        beach.explore();
    }

    /** Method to test zeroBlue */
    public static void testsmallAplaca()
    {
        Picture alpaca= new Picture("Alpaca.jpg");
        alpaca.explore();
        //alpaca.equals(alpaca.scale(0.25,0.25));
        Picture smallP = alpaca.scale(0.25,0.25);
        //smallP.write("smallMyPicture.jpg"); 
        smallP.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("koala.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("koala.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test mirrorDiagnal */
    public static void testMirrorDiagonal()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorDiagonal();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {

        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }


    public static void testCollage2()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage2();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    public static void Collage()
    {
        Picture canvas = new Picture(800, 800);
        Picture alpaca = new Picture("alpaca.jpg");
        alpaca = alpaca.scale(0.25,0.25);
        alpaca.explore();
        canvas.equals(canvas.paste(canvas, alpaca,200,200));
        canvas.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}