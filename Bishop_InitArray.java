public class Bishop_InitArray
{
  public static void main(String[] args)
  {
    //declare variable array and initializing it with the object
    int[] array = new int[10];//create array object
    System.out.printf("%s%8s%n", "Index", "Value"); //column headings
    //output each array element's value
    for(int counter = 0; counter < array.length; counter++)
      System.out.printf("%5d%8d%n", counter, array[counter]);
  }
}//End of class