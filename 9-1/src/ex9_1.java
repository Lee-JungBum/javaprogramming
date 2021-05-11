/* 18114323이정범
 * chap9 실습1 프레임생성
 */
import javax.swing.*;

public class ex9_1 extends JFrame {
	public ex9_1()
	{
		setTitle("300x300 스윙 프레임 만들기"); //타이틀
		setSize(300,300);					//300x300크기
		setVisible(true);					//활성화
	}
	
	public static void main(String[] args)
	{
		ex9_1 frame = new ex9_1();
	}
}
