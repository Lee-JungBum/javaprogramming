/* 18114323������
 * chap10 �ǽ�1 �׼ǽ� ���ڹٲٱ�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_1 extends JFrame {
	public ex10_1()
	{
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");	//�׼ǹ�ư����
		btn.addActionListener(new MyActionListener());	//�׼Ǹ�����
		c.add(btn);
		
			setSize(300,200);	//������ 300x200
		setVisible(true);	//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex10_1();
	}
}
class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)//������������
	{
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) //��ư�� �׼��϶�
			b.setText("�׼�");	//���
		else		//�ƴҶ�
			b.setText("Action");	//���
				
	}
}