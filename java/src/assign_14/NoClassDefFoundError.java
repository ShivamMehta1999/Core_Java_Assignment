//Q14.WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
package assign_14;
public class NoClassDefFoundError {
    static class knolls
    {
        void java()
        {
            System.out.println( "Java section" );
        }
    }
    static class Scala extends knolls
    {
        void showScala()
        {
            System.out.println( "Scala section" );
        }
    }
    static class NoClassDefFoundErrorExample
    {
        public static void main(String[] args)
        {
            Scala data = new Scala();
            data.showScala();
            data.java();
        }
    }
}
