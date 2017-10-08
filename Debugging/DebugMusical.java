public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      this.composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is"  + super.title +
        " by " + author + "\nThe music for " + super.title +
        " is by " + composer);
   }
}