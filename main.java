
package p01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			okno window = new okno();
			
			int xPad;
			int yPad;
	}

}
class okno extends JFrame{
	public okno() {
		setBounds(0,0,800,600);
		setTitle("mini paint");
		add(new panel());
		setVisible(true);
	}
}

class panel extends JPanel{
	private Color[] masColor;
	private int tCol=0;
	private int mX,mY;
	private boolean flag=false;
	panel(){
		addMouseListener(new myMouse());
		addMouseMotionListener(new myMotionMouse());
		setFocusable(true);
	}
	public void paintComponent(Graphics gr) {
		masColor=new Color[8];
		Color col1=new Color(255,255,255);
		masColor[0]=new Color(55,100,255);
		masColor[1]=Color.GREEN;
		masColor[2]=Color.BLUE;
		masColor[3]=Color.RED;
		masColor[4]=Color.YELLOW;
		masColor[5]=Color.WHITE;
		masColor[6]=Color.ORANGE;
		masColor[7]=Color.BLACK;
		
		for(int i=0;i<8;i++) {
			gr.setColor(masColor[i]);
			gr.fillRect(i*100,0,100,50);
			}
		if(flag==true) {
			gr.setColor(masColor[tCol]);
			gr.fillRect(mX, mY, 3, 3);
			if(tCol==7) {
				gr.setColor(masColor[7]);
				gr.fillRect(mX, mY, 100, 100);
			}
		}
	}
	private class myMouse implements MouseListener {
		
		@Override
		public void mouseClicked(MouseEvent arg0) {}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		
		@Override
		public void mouseExited(MouseEvent arg0) {}
		
		@Override
		public void mousePressed(MouseEvent e) {
			int tX=e.getX();
			int tY=e.getY();
			int col=e.getClickCount();
			int btn=e.getButton();
			if(tX>0 && tX<700 && tY>0 && tY<50) {
				if(col==1) {
					if(btn==1) {tCol=tX/100;}
				}
			}	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			flag=false;
		}
	}
case 2:
    g2.setStroke(new  BasicStroke(3.0f));
    g2.setColor(Color.WHITE);
    g2.drawLine(xPad, yPad, e.getX(), e.getY());
     break;
}
xPad=e.getX();
yPad=e.getY();
}
japan.repaint();
}
});
japan.addMouseListener(new  MouseAdapter()
{
public void mouseClicked(MouseEvent e) {

Graphics g = imag.getGraphics();
Graphics2D g2 = (Graphics2D)g;
	
case 2:
    g2.setStroke(new  BasicStroke(3.0f));
     g2.setColor(Color.WHITE);
     g2.drawLine(xPad, yPad, xPad+1, yPad+1);
break;

	 private class myMotionMouse implements MouseMotionListener{
		
				
		@Override
		public void mouseDragged(MouseEvent e) {
			int tX=e.getX();
			int tY=e.getY();
			if(tY>50) {
				mX=tX;
				mY=tY;
				flag=true;
				repaint();
			}
		}
		@Override 
		public void mouseMoved(MouseEvent e) {
			System.out.println(e.getX()+"      "+e.getY());
			int tX=e.getX();
			int tY=e.getY();
			if(tX>0 && tX<700 && tY>0 && tY<50) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			} 
			else {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		}
	}
}