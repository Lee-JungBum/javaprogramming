/* 18114323������
 * chap10 �ǽ�9 ���콺 ��ġ���� �����ٲٱ�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_9 extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	public ex10_9() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		setSize(300,200);		//������ũ�� 300 200
		setVisible(true);		//Ȱ��ȭ
	}
	class MyMouseListener implements MouseListener,MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}		//Ŭ����
		public void mouseEntered(MouseEvent e) {		//�����γ�����
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {	//���콺Ű�Ջ���
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {	//�巡�׽�
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");//������ġ
		}
		public void mouseMoved(MouseEvent e) {	//�����
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");//������ġ
		}
	}
	public static void main(String[] args)
	{
		new ex10_9();
	}
}
