/* 18114323������
 * chap10 �ǽ�3 Ÿ��Ʋ�ٲٱ�(�͸�Ŭ����)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_3 extends JFrame {
	public ex10_3()
	{
		setTitle("Action �̺�Ʈ ������ ����");			//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		//flowlayout
		JButton btn = new JButton("Action");	//��ư����
		c.add(btn);
		
		btn.addActionListener(new ActionListener(){ //�͸�Ŭ��������
			public void actionPerformed(ActionEvent e)
			{
				JButton b=(JButton)e.getSource();//�Է½�
				if(b.getText().equals("Action"))//������
					b.setText("�׼�");	//�׼�
				else
					b.setText("Action");//action
				setTitle(b.getText());//Ÿ��Ʋ�ٲٱ�
			}
		});
		
		setSize(300,200);		//������300x200
		setVisible(true);		//Ȱ��ȭ
	}

	public static void main(String[] args)
	{
		new ex10_3();
	}
}
