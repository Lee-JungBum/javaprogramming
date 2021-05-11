/* 18114323이정범
 * chap9 실습2 버튼생성
 */
import javax.swing.*;
import java.awt.*;

public class ex9_2 extends JFrame {
	public ex9_2()
	{
		setTitle("ContentPane과 JFrame");				//타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료
		
		Container contentPane = getContentPane();		//컨테트팬 배치
		contentPane.setBackground(Color.ORANGE);		//백그라운드 오렌지
		contentPane.setLayout(new FlowLayout());		//flow레이아웃
		
		contentPane.add(new JButton("OK"));				//ok버튼
		contentPane.add(new JButton("Cancel"));			//cancel버튼
		contentPane.add(new JButton("Ignore"));			//ignore버튼
		
		setSize(300,150);		//frame size 300x150
		setVisible(true);			//활성화
	}
	public static void main(String[] args)
	{
		new ex9_2();
	}
}
