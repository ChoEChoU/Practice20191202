
import javax.swing.*;
import java.awt.event.*;
/**
 * JPanel를 상속받고 ActionListener를 implements 받은 MyPanel
 * 
 * @author (2018315017 임민택, 2018315010 박채린, 2018315058 오타오아키) 
 * @version (2019.12.02 실습_4)
 */
public class MyPanel extends JPanel implements ActionListener
{
    JTextField mtfName;
    JTextField mtfDept;
    JTextField mtfAddress;
    JComboBox<String[]> mbSchoolYear;
    JTextArea ta;
    public MyPanel(){
        JLabel mlName = new JLabel("이름");
        this.add(mlName);
        mtfName = new JTextField(20);
        this.add(mtfName);
        
        JLabel mlDept = new JLabel("학과");
        this.add(mlDept);
        mtfDept = new JTextField(20);
        mtfDept.setText("글로벌소프트웨어학과");
        this.add(mtfDept);
        
        JLabel mlAddress = new JLabel("주소");
        this.add(mlAddress);
        mtfAddress = new JTextField(20);
        mtfAddress.setText("서울시..");
        this.add(mtfAddress);
        
        JLabel mlSchoolYear = new JLabel("학년");
        this.add(mlSchoolYear);
        
        String[] items = new String[4];
        items[0] = "1학년";
        items[1] = "2학년";
        items[2] = "3학년";
        items[3] = "4학년";
        
        mbSchoolYear = new JComboBox(items);
        this.add(mbSchoolYear);
        
        JButton mb = new JButton("추가");
        mb.addActionListener(this);
        this.add(mb);
        
        JButton mbClear = new JButton("Clear");
        mbClear.addActionListener(this);
        this.add(mbClear);
        
        ta = new JTextArea(10,24);
        JScrollPane jsp = new JScrollPane(ta);
        this.add(jsp);
    }
    
    public void actionPerformed(ActionEvent e){
        JButton btn = (JButton)e.getSource();
        String result = "";
        if (btn.getText() == "추가") {
            result += mtfName.getText() + "\n";
            result += mtfDept.getText() + "\n";
            result += mbSchoolYear.getSelectedItem().toString() + "\n";
            result += mtfAddress.getText() + "\n";
            result += "________________________________" + "\n";
            ta.append(result);
        }
        
        else if (btn.getText() == "Clear") {
            mtfName.setText("");
            mtfDept.setText("");
            mtfAddress.setText("");
            ta.setText("");
        }
    }
}