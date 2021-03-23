package Beispiel.Paint;

public class Main{
    public static void main(String[] args) {
        Paint paint = new Paint();
    }
}


/*public class Main {
    public static void main(String[] args) {
        var window = new JFrame();
        window.setVisible(true);
        window.setSize(600, 600);
        window.setContentPane().add(new ArtPanel());
    }
}

class ArtPanel extends JPanel {
    private Point pointToDraw;

    ArtPanel() {
        this.addMouseMotionListener() = new MouseEventHandler();
        this.setBackground(new Color(0, 0, 0));
    }

    public void print(Graphics g) {
        pointToDraw.draw(g);
    }
    class MouseEventHandler implements MouseMotionListener {
        public void MouseDragged(MouseEvent e){
            pointToDraw = new Point(e.getX(),e.getY());
            repaint();
        }
        public void MouseMoved(MouseEvent e){

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
}
class Point {
    private  int x;
    private  int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public  void draw(Graphics g){
        g.setColor(new Color(255,255,255));
        g.fillOval(x,y,10,10);
    }
}

 */
