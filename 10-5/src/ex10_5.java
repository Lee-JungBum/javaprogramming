/* 18114323������
 * chap10 �ǽ�5 ���콺�� ���ں�����(�����)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_5 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public ex10_5()
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		
		c.setLayout(null);
		la.setSize(50,20);	//�󺧻����� 50 20
		la.setLocation(30,30); //����ġ 30 30
		c.add(la);
		
		setSize(250,250);	//�����ӻ����� 250 250
		setVisible(true);	//Ȱ��ȭ
	}
	class MyMouseAdapter extends MouseAdapter	//�����Ŭ����
	{
		public void mousePressed(MouseEvent e)
		{
			int x= e.getX();		//getx
			int y = e.getY();		//gety
			la.setLocation(x, y);	//��ġ�̵�
		}
	}

	public static void main(String[] args)
	{
		new ex10_5();
	}
}
