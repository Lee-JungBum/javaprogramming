/* 18114323������
 * chap10 �ǽ�4 ���콺Ŭ���Ѱ����� ���ں�����
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_4 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public ex10_4()
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		
		c.setLayout(null);
		la.setSize(50,20);		//�󺧻����� 50 20
		la.setLocation(30,30);	//�󺧿ű�� 30 30
		c.add(la);
		
		setSize(250,250);	//������250x250
		setVisible(true);	//Ȱ��ȭ
	}
	class MyMouseListener implements MouseListener
	{
		public void mousePressed(MouseEvent e)	//���콺�̵�
		{
			int x= e.getX();	//getx
			int y = e.getY();	//gety
			la.setLocation(x, y);	//��ġ���Ѷ�
		}
		
		public void mouseReleased(MouseEvent e) {};
		public void mouseClicked(MouseEvent e) {};
		public void mouseEntered(MouseEvent e) {};
		public void mouseExited(MouseEvent e) {};
	}

	public static void main(String[] args)
	{
		new ex10_4();
	}
}
