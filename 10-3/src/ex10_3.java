/* 18114323이정범
 * chap10 실습3 타이틀바꾸기(익명클래스)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_3 extends JFrame {
	public ex10_3()
	{
		setTitle("Action 이벤트 리스너 예제");			//타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		//flowlayout
		JButton btn = new JButton("Action");	//버튼생성
		c.add(btn);
		
		btn.addActionListener(new ActionListener(){ //익명클래스생성
			public void actionPerformed(ActionEvent e)
			{
				JButton b=(JButton)e.getSource();//입력시
				if(b.getText().equals("Action"))//같을시
					b.setText("액션");	//액션
				else
					b.setText("Action");//action
				setTitle(b.getText());//타이틀바꾸기
			}
		});
		
		setSize(300,200);		//프레임300x200
		setVisible(true);		//활성화
	}

	public static void main(String[] args)
	{
		new ex10_3();
	}
}
