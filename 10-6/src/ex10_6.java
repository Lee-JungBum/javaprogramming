/* 18114323������
 * chap10 �ǽ�2 Ÿ��Ʋ�ٲٱ�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_6 extends JFrame {
	private JLabel [] keyMessage;
	public ex10_6()
	{
		setTitle("KeyListener �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage [0] = new JLabel(" getKeyCode()");	//�ڵ������ɰ�
		keyMessage [1] = new JLabel(" getKeychar()");	//char����ɰ�
		keyMessage [2] = new JLabel(" getKeytext()");	//text����ɰ�
		
		for(int i=0; i<keyMessage.length; i++) {	//ũ������ݺ�
			c.add(keyMessage[i]);	
			keyMessage[i].setOpaque(true);	//������
			keyMessage[i].setBackground(Color.YELLOW);	//��������κ���
			}
			setSize(300,150);	//size 300 150
			setVisible(true);	//Ȱ��ȭ
			c.setFocusable(true);	
			c.requestFocus();
			}
			class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));	//���
			keyMessage[1].setText(Character.toString(keyChar));	//���
			keyMessage[2].setText(e.getKeyText(keyCode));		//���
			}
			}
	public static void main(String[] args)
	{
		new ex10_6();
	}
}
