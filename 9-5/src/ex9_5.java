/* 18114323������
 * chap9 �ǽ�1 �Է�ĭ
 */
import javax.swing.*;
import java.awt.*;

public class ex9_5 extends JFrame {
	public ex9_5()
	{
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2); //row 4 cols 2
		grid.setVgap(5);	//�׸��� ���� 5
		
		Container c = getContentPane();
		c.setLayout(grid);	//gird���̾ƿ�
		c.add(new JLabel(" �̸�"));	//�̸���
		c.add(new JTextField(""));	//�ۼ�ĭ
		c.add(new JLabel(" �й�"));	//�й���
		c.add(new JTextField(""));	//�ۼ�ĭ
		c.add(new JLabel(" �а�"));	//�а���
		c.add(new JTextField(""));	//�ۼ�ĭ
		c.add(new JLabel(" ����"));	//�����
		c.add(new JTextField(""));	//�ۼ�ĭ
		setSize(300,200);			//������ 300x200
		setVisible(true);			//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex9_5();
	}
}
