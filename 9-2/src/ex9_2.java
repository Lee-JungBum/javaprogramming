/* 18114323������
 * chap9 �ǽ�2 ��ư����
 */
import javax.swing.*;
import java.awt.*;

public class ex9_2 extends JFrame {
	public ex9_2()
	{
		setTitle("ContentPane�� JFrame");				//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����
		
		Container contentPane = getContentPane();		//����Ʈ�� ��ġ
		contentPane.setBackground(Color.ORANGE);		//��׶��� ������
		contentPane.setLayout(new FlowLayout());		//flow���̾ƿ�
		
		contentPane.add(new JButton("OK"));				//ok��ư
		contentPane.add(new JButton("Cancel"));			//cancel��ư
		contentPane.add(new JButton("Ignore"));			//ignore��ư
		
		setSize(300,150);		//frame size 300x150
		setVisible(true);			//Ȱ��ȭ
	}
	public static void main(String[] args)
	{
		new ex9_2();
	}
}
