/* 18114323������
 * chap10 �ǽ�10 ����Ŭ���� ��׶��� ������
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_10 extends JFrame {
	public ex10_10() {
		setTitle("Click and DoubleClick ����");	//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);	//������ 300x200
		setVisible(true);	//Ȱ��ȭ
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) { //����Ŭ��
			int r = (int)(Math.random()*256); //������
			int g = (int)(Math.random()*256); //������
			int b = (int)(Math.random()*256);// ������
			Component c = (Component)e.getSource();
			c.setBackground(new Color(r,b,g));	//����rgb������
			}
		}
	}
	public static void main(String[] args)
	{
		new ex10_10();
	}
}
