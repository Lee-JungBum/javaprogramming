/* 18114323������
 * chap9 �ǽ�4 boderlayout
 */
import javax.swing.*;
import java.awt.*;

public class ex9_4 extends JFrame {
	public ex9_4()
	{
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 40));	//30 40����
		c.add(new JButton("add"), BorderLayout.NORTH);	//��
		c.add(new JButton("sub"), BorderLayout.SOUTH);	//��
		c.add(new JButton("mul"), BorderLayout.EAST);	//��
		c.add(new JButton("div"), BorderLayout.WEST);	//��
		c.add(new JButton("Calculate"), BorderLayout.CENTER);		//����
		
		setSize(300,200);	//������300x200
		setVisible(true);	//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex9_4();
	}
}
