/* 18114323������
 * chap10 �ǽ�2 Ÿ��Ʋ�ٲٱ�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_2 extends JFrame {
	public ex10_2()
	{
		setTitle("Action �̺�Ʈ ������ ����");	//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");		//�׼ǹ�ư����
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
			setSize(300,200);	//������ 300x200
		setVisible(true);		//Ȱ��ȭ
	}
	class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton)e.getSource();		//�Է½�
			if(b.getText().equals("Action"))		//���ڰ� �׼��Ͻ�
				b.setText("�׼�");					//�׼�
			else							//�ƴϸ�
				b.setText("Action");		//action
		ex10_2.this.setTitle(b.getText()); // Ÿ��Ʋ �ٲٱ� 
		}
	}
	public static void main(String[] args)
	{
		new ex10_2();
	}
}
