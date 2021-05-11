/* 18114323이정범
 * chap9 실습6 배치관리자없는 컨테이너
 */
import javax.swing.*;
import java.awt.*;

public class ex9_6 extends JFrame {
	public ex9_6()
	{
		setTitle("Null Container Sample");	//타이틀제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료
		
		Container c = getContentPane();
		c.setLayout(null);//null로 생성
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);//시작점
		la.setSize(200,20);	//사이즈
		c.add(la);
		
		for(int i=1; i<=9; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);//간격
			b.setSize(50,20);//버튼사이즈
			c.add(b);
		}
		setSize(300,200);	//프레임 300x200
		setVisible(true);	//활성화
	}
	public static void main(String[] args)
	{
		new ex9_6();
	}
}
