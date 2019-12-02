import javax.swing.*;
/**
 * 여기에 TextFieldFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFieldFrame extends JFrame
{
    MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mp = new MyPanel();
        this.add(mp);

        this.setSize(280, 400);
        this.setVisible(true);
    }
}
