/* 18114323이정범
 * chap9 실습3 FlowLayOut 배치관리자
 */
import javax.swing.*;
import java.awt.*;

public class ex9_3 extends JFrame {
	public ex9_3()
	{
		setTitle("FlowLayOut Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));	//left정렬 hgap 30 vgap 40
		c.add(new JButton("add"));	//add버튼
		c.add(new JButton("sub"));	//sub버튼
		c.add(new JButton("mul"));	//mul버튼
		c.add(new JButton("div"));	//div버튼
		c.add(new JButton("Calculate"));	//calculate버튼
		
		setSize(300,200);		//프레임 300x200
		setVisible(true);		//활성화
	}
	public static void main(String[] args)
	{
		new ex9_3();
	}
}
