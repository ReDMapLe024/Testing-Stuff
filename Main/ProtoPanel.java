
@SuppressWarnings("serial");
public class ProtoPanel extends JPanel implements Runnable, KeyListener(){
  public static final int WIDTH = 500;
  public static final HEIGHT = 500;
  
  private Thread thread;
  private boolean running;
  
  private BufferedImage image;
  private Graphics2D g;
  
  private GameStateManager gsm;
  
  public ProtoPanel(){
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setFocusable(true);
    requestFocus();
  }
  
  public void addNotify(){
    super.addNotify();
    if(thread==null){
      addKeylistener(this);
      thread = new Thread(this);
      thread.start();
    }
  }
  
  public void run(){
    
  }
  
  public void init(){
    
  }
  
  public void update(){
    
  }
  
  public void draw(){
    
  }
  
  public void drawScreen(){
    
  }
  
  
}
