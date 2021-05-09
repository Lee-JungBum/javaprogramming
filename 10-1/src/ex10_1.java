import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex10_1 extends JFrame {

	public ex10_1()
	{
		
		setTitle("마우스 올리기 내리기");	//타이틀 설정
		setSize(298,200);	//500 300
		setVisible(true); //활성화
		
		setContentPane(new testPanel());
		getContentPane().setFocusable(true);	//컴포넌트가 포커스를 받을 수 있도록설정
		getContentPane().requestFocus(); 		//컴포넌트에 포커스 강제지정
		
	}
	class testPanel extends JPanel
	{
		private JLabel end = new JLabel();	//결과
		public testPanel() {
			setLayout(null); // 배치관리자X
			end.setText("Love Kava");
			end.setSize(200,50);	// 레이블크기
			end.setLocation(100,1);	//레이블 위치
			end.setFont(new Font("돋움",Font.BOLD ,20)); //폰트설정
			add(end);	//생성
		addMouseListener (new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				end.setText("Love Java");
			}
			public void mouseExited(MouseEvent e)
			{
				end.setText("사랑해");
			}
		});
			
	}
	
	}
	public static void main(String[] args)
	{
		ex10_1 frame = new ex10_1();	//생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 누르면 종료
	}
	
}


