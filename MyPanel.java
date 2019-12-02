import javax.swing.*;
/**
 * 여기에 MyPanel 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPanel extends JPanel
{
    public MyPanel(){
        JLabel mlName = new JLabel("이름");
        this.add(mlName);
        JTextField mtfName = new JTextField(20);
        this.add(mtfName);
    }
}













