public abstract class Prototype[
    
    public class Prototype{
      public static void main (String [] args){
        
        JFrame gameFrame = new JFrame("Prototype");
        gameFrame.add(new ProtoPanel());
        gameFrame.setResizable(false);
        gameFrame.pack();
        gameFrame.setPositionRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      }
    }
    
}
