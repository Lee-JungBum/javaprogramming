import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OC_10 extends JFrame {

	public OC_10()
	{
		
		setTitle("Open Challenge 10");	//타이틀 설정
		setSize(500,300);	//500 300
		setVisible(true); //활성화
		
		setContentPane(new GamePanel());
		getContentPane().setFocusable(true);	//컴포넌트가 포커스를 받을 수 있도록설정
		getContentPane().requestFocus(); 		//컴포넌트에 포커스 강제지정
		
	}
	class GamePanel extends JPanel
	{
		private JLabel abc[] = new JLabel[3]; //3개생성
		private JLabel end;	//결과
		public GamePanel() {
			setLayout(null); // 배치관리자를 사용X
			
			for(int i=0; i<abc.length; i++) {	//abc의 크기동안(3개)
				abc[i] = new JLabel("0"); // 레이블 생성
				abc[i].setSize(100, 50); // 레이블 크기
				abc[i].setLocation(40+150*i, 80); // x= 40 + 150*i  y= 80 
				abc[i].setHorizontalAlignment(JLabel.CENTER); // 가운데정렬
				abc[i].setOpaque(true); // 배경색설정 true
				abc[i].setBackground(Color.MAGENTA); // 글자 배경색 설정
				abc[i].setForeground(Color.YELLOW); //글자색설정			
				abc[i].setFont(new Font("", Font.ITALIC, 40)); //폰트설정	
				add(abc[i]); // 생성
			}
			end = new JLabel("시작합니다");	//시작 초기화
			end.setSize(200,50);	// 레이블크기
			end.setLocation(180,170);	//레이블 위치
			end.setFont(new Font("돋움",Font.BOLD ,20)); //폰트설정
			add(end);	//생성
			
			
			addKeyListener(new KeyAdapter() //선언된거만 쓸거니까 adapter로
			{
				@Override
				public void keyPressed(KeyEvent e) {	//입력
					if(e.getKeyChar() == '\n') { //엔터입력인경우
						int x1 = (int)(Math.random()*5); // 0~4
						abc[0].setText(Integer.toString(x1));	//string만됨
						int x2 = (int)(Math.random()*5);	//0~4
						abc[1].setText(Integer.toString(x2));	//string만됨
						int x3 = (int)(Math.random()*5);	//0~4
						abc[2].setText(Integer.toString(x3)); //string만됨
						
						//3개같은지 비교
						if(x1 == x2 && x2 == x3)	end.setText("축하합니다!!");
						else						end.setText("아쉽군요");
					}
				}
			});
	}
	
	}
	public static void main(String[] args)
	{
		OC_10 frame = new OC_10();	//생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 누르면 종료
	}
	
}


