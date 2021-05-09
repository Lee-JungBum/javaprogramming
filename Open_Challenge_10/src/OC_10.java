import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OC_10 extends JFrame {

	public OC_10()
	{
		
		setTitle("Open Challenge 10");	//Ÿ��Ʋ ����
		setSize(500,300);	//500 300
		setVisible(true); //Ȱ��ȭ
		
		setContentPane(new GamePanel());
		getContentPane().setFocusable(true);	//������Ʈ�� ��Ŀ���� ���� �� �ֵ��ϼ���
		getContentPane().requestFocus(); 		//������Ʈ�� ��Ŀ�� ��������
		
	}
	class GamePanel extends JPanel
	{
		private JLabel abc[] = new JLabel[3]; //3������
		private JLabel end;	//���
		public GamePanel() {
			setLayout(null); // ��ġ�����ڸ� ���X
			
			for(int i=0; i<abc.length; i++) {	//abc�� ũ�⵿��(3��)
				abc[i] = new JLabel("0"); // ���̺� ����
				abc[i].setSize(100, 50); // ���̺� ũ��
				abc[i].setLocation(40+150*i, 80); // x= 40 + 150*i  y= 80 
				abc[i].setHorizontalAlignment(JLabel.CENTER); // �������
				abc[i].setOpaque(true); // �������� true
				abc[i].setBackground(Color.MAGENTA); // ���� ���� ����
				abc[i].setForeground(Color.YELLOW); //���ڻ�����			
				abc[i].setFont(new Font("", Font.ITALIC, 40)); //��Ʈ����	
				add(abc[i]); // ����
			}
			end = new JLabel("�����մϴ�");	//���� �ʱ�ȭ
			end.setSize(200,50);	// ���̺�ũ��
			end.setLocation(180,170);	//���̺� ��ġ
			end.setFont(new Font("����",Font.BOLD ,20)); //��Ʈ����
			add(end);	//����
			
			
			addKeyListener(new KeyAdapter() //����ȰŸ� ���Ŵϱ� adapter��
			{
				@Override
				public void keyPressed(KeyEvent e) {	//�Է�
					if(e.getKeyChar() == '\n') { //�����Է��ΰ��
						int x1 = (int)(Math.random()*5); // 0~4
						abc[0].setText(Integer.toString(x1));	//string����
						int x2 = (int)(Math.random()*5);	//0~4
						abc[1].setText(Integer.toString(x2));	//string����
						int x3 = (int)(Math.random()*5);	//0~4
						abc[2].setText(Integer.toString(x3)); //string����
						
						//3�������� ��
						if(x1 == x2 && x2 == x3)	end.setText("�����մϴ�!!");
						else						end.setText("�ƽ�����");
					}
				}
			});
	}
	
	}
	public static void main(String[] args)
	{
		OC_10 frame = new OC_10();	//����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ������ ����
	}
	
}


