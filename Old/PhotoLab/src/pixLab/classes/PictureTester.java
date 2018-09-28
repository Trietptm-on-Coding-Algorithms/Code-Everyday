package pixLab.classes;
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
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
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
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture breadcat = new Picture("breadcat.png");
	  breadcat.keepOnlyBlue();
	  breadcat.explore();
  }
  
  public static void testNegate()
  {
	  Picture breadcat = new Picture("breadcat.png");
	  breadcat.negate();
	  breadcat.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture breadcat = new Picture("breadcat.png");
	  breadcat.grayScale();
	  breadcat.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture breadcat = new Picture("breadcat.png");
	  breadcat.mirrorVerticalRightToLeft();
	 // breadcat.explore();
	  breadcat.write("awesome_breadcat.jpg");
  }
  
  public static void testFixUnderwater()
  {
	  Picture breadcat = new Picture("water.jpg");
	  breadcat.fixUnderwater();
	  breadcat.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	Picture breadcat = new Picture("breadcat.png");
	breadcat.mirrorHorizontal();
	breadcat.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	Picture breadcat = new Picture("breadcat.png");
	breadcat.mirrorHorizontalBotToTop();
	breadcat.explore();
  }
  
  public static void testChromakey()
  {
	  Picture greensuit = new Picture("hmmm.jpg"); 
	  Picture background = new Picture("random.jpg");
	  greensuit.chromakey(background);
	  greensuit.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//  testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}