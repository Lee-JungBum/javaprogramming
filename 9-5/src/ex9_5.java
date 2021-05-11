/* 18114323이정범
 * chap9 실습1 입력칸
 */
import javax.swing.*;
import java.awt.*;

public class ex9_5 extends JFrame {
	public ex9_5()
	{
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2); //row 4 cols 2
		grid.setVgap(5);	//그리드 간격 5
		
		Container c = getContentPane();
		c.setLayout(grid);	//gird레이아웃
		c.add(new JLabel(" 이름"));	//이름라벨
		c.add(new JTextField(""));	//작성칸
		c.add(new JLabel(" 학번"));	//학번라벨
		c.add(new JTextField(""));	//작성칸
		c.add(new JLabel(" 학과"));	//학과라벨
		c.add(new JTextField(""));	//작성칸
		c.add(new JLabel(" 과목"));	//과목라벨
		c.add(new JTextField(""));	//작성칸
		setSize(300,200);			//프레임 300x200
		setVisible(true);			//활성화
	}
	public static void main(String[] args)
	{
		new ex9_5();
	}
}
