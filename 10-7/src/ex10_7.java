/* 18114323������
 * chap10 �ǽ�7 �Է±��ڿ����� ��׶���ٲٱ�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_7 extends JFrame {
	
	private JLabel la = new JLabel();
	public ex10_7()
	{
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");	//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);	//������ 300 150
		setVisible(true);		//Ȱ��ȭ
		c.setFocusable(true); //Ű�Է¹������ְ�
		c.requestFocus();//��������
	}
		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				Container contentPane = (Container)e.getSource();
				la.setText(e.getKeyText(e.getKeyCode()));	//�Է°�
				
				if(e.getKeyChar() == '%')	//%�Է½�
					contentPane.setBackground(Color.YELLOW);	//��׶��� ����
					else if(e.getKeyCode() == KeyEvent.VK_F1)		//f1�Է½�
					contentPane.setBackground(Color.GREEN);		//��׶��� �׸�
			}
		}
	public static void main(String[] args)
	{
		new ex10_7();
	}
}
