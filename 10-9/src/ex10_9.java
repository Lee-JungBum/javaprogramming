/* 18114323이정범
 * chap10 실습9 마우스 위치따라 색갈바꾸기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_9 extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	public ex10_9() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		setSize(300,200);		//프레임크기 300 200
		setVisible(true);		//활성화
	}
	class MyMouseListener implements MouseListener,MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}		//클릭시
		public void mouseEntered(MouseEvent e) {		//끝라인넘으면
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {	//마우스키손떄면
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {	//드래그시
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");//글자위치
		}
		public void mouseMoved(MouseEvent e) {	//무브시
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");//글자위치
		}
	}
	public static void main(String[] args)
	{
		new ex10_9();
	}
}
