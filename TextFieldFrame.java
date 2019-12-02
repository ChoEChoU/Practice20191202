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
        this.setTitle("이미지 버튼 연습");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mp = new MyPanel();
        this.add(mp);

        this.setSize(300, 400);
        this.setVisible(true);
    }
}
