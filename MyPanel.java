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
        
        JLabel mlDept = new JLabel("학과");
        this.add(mlDept);
        JTextField mtfDept = new JTextField(20);
        mtfDept.setText("글로벌소프트웨어학과");
        this.add(mtfDept);
        
        JLabel mlAddress = new JLabel("주소");
        this.add(mlAddress);
        JTextField mtfAddress = new JTextField(20);
        mtfAddress.setText("서울시..");
        this.add(mtfAddress);
        
        JLabel mlSchoolYear = new JLabel("학년");
        this.add(mlSchoolYear);
        
        String[] items = new String[4];
        items[0] = "1학년";
        items[1] = "2학년";
        items[2] = "3학년";
        items[3] = "4학년";
        
        JComboBox<String[]> mbSchoolYear = new JComboBox(items);
        this.add(mbSchoolYear);
   }
}













