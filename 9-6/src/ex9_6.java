/* 18114323������
 * chap9 �ǽ�6 ��ġ�����ھ��� �����̳�
 */
import javax.swing.*;
import java.awt.*;

public class ex9_6 extends JFrame {
	public ex9_6()
	{
		setTitle("Null Container Sample");	//Ÿ��Ʋ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����
		
		Container c = getContentPane();
		c.setLayout(null);//null�� ����
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);//������
		la.setSize(200,20);	//������
		c.add(la);
		
		for(int i=1; i<=9; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);//����
			b.setSize(50,20);//��ư������
			c.add(b);
		}
		setSize(300,200);	//������ 300x200
		setVisible(true);	//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex9_6();
	}
}
