
@SuppressWarnings("serial");
public class ProtoPanel extends JPanel implements Runnable, KeyListener(){
  public static final int WIDTH = 500;
  public static final HEIGHT = 500;
  
  private Thread thread;
  private boolean running;
  
  private BufferedImage image;
  private Graphics2D g;
  
  private GameStateManager manager;
  
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
    running = true;
    image = new BufferedImage(WIDTH, HEIGHT, 1);
    g = (Graphics2D) image.getGraphics();
    manager = new GameStateManager();
  }
  
  public void update(){
    manager.update();
  }
  
  public void draw(){
    manager.draw(g)
  }
  
  public void drawScreen(){
    Graphics gr = getGraphics();
    gr.drawImage(image, 0, 0, WIDTH, HEIGHT, null);
    gr.dispose();
  }
  
  
}
