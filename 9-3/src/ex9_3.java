/* 18114323������
 * chap9 �ǽ�3 FlowLayOut ��ġ������
 */
import javax.swing.*;
import java.awt.*;

public class ex9_3 extends JFrame {
	public ex9_3()
	{
		setTitle("FlowLayOut Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));	//left���� hgap 30 vgap 40
		c.add(new JButton("add"));	//add��ư
		c.add(new JButton("sub"));	//sub��ư
		c.add(new JButton("mul"));	//mul��ư
		c.add(new JButton("div"));	//div��ư
		c.add(new JButton("Calculate"));	//calculate��ư
		
		setSize(300,200);		//������ 300x200
		setVisible(true);		//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex9_3();
	}
}
