import javax.swing.*;
/**
 * mp를 붇인 JFrame을 상속받은 TextFieldFrame
 * 
 * @author (2018315017 임민택, 2018315010 박채린, 2018315058 오타오아키) 
 * @version (2019.12.02 실습_4)
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
