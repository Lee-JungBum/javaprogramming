import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex10_1 extends JFrame {

	public ex10_1()
	{
		
		setTitle("���콺 �ø��� ������");	//Ÿ��Ʋ ����
		setSize(298,200);	//500 300
		setVisible(true); //Ȱ��ȭ
		
		setContentPane(new testPanel());
		getContentPane().setFocusable(true);	//������Ʈ�� ��Ŀ���� ���� �� �ֵ��ϼ���
		getContentPane().requestFocus(); 		//������Ʈ�� ��Ŀ�� ��������
		
	}
	class testPanel extends JPanel
	{
		private JLabel end = new JLabel();	//���
		public testPanel() {
			setLayout(null); // ��ġ������X
			end.setText("Love Kava");
			end.setSize(200,50);	// ���̺�ũ��
			end.setLocation(100,1);	//���̺� ��ġ
			end.setFont(new Font("����",Font.BOLD ,20)); //��Ʈ����
			add(end);	//����
		addMouseListener (new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				end.setText("Love Java");
			}
			public void mouseExited(MouseEvent e)
			{
				end.setText("�����");
			}
		});
			
	}
	
	}
	public static void main(String[] args)
	{
		ex10_1 frame = new ex10_1();	//����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ����
	}
	
}


