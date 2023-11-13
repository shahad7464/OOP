import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class MyCalculator extends JFrame implements ActionListener{

    JButton btn0,btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDiv,btnMul,btnSub,btnAdd,btnDot,btnClear,btnEqual,btnPercent,btnSquare,btnCut,btnRoot;
    JTextField txt1;
    JLabel l1,l2,l3;
    String str1 = "";
    String str2 = "";

    double input1,input2,result;
    int flag = 0;


    public MyCalculator(){

        setTitle("Calculator");
        setSize(300, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(0,121,131));
        setResizable(false);

        Font myFont = new Font("Arial", Font.BOLD, 30);
        Font newFont = new Font("Akira Expanded", Font.BOLD, 16);
        Font newFont1 = new Font("Akira Expanded", Font.BOLD, 8);
        Font newFont2 = new Font("Arial Black", Font.BOLD, 8);

        l1 = new JLabel();
        l1.setBounds(5,2,111,30);
        l1.setText("Shahad's");
        l1.setFont(newFont);
        l1.setForeground(Color.white);
        add(l1);

        l2 = new JLabel();
        l2.setBounds(117,0,50,30);
        l2.setText("TM");
        l2.setFont(newFont1);
        l2.setForeground(Color.white);
        add(l2);

        l3 = new JLabel();
        l3.setBounds(125,435,170,20);
        l3.setText("© 2023 Shahad'S™. All rights reserved");
        l3.setFont(newFont2);
        l3.setForeground(Color.white);
        add(l3);

        txt1 = new JTextField();
        txt1.setBounds(5,34,288,77);
        txt1.setFont(myFont);
        txt1.setText("");
        add(txt1);
        txt1.setBackground(Color.white);
        txt1.setBorder(null);
        txt1.setHorizontalAlignment(JTextField.RIGHT);

        btnPercent = new JButton("%");
        btnPercent.setBounds(2,116,72,50);
        add(btnPercent);
        btnPercent.addActionListener(this);

        btnSquare = new JButton("x²");
        btnSquare.setBounds(76,116,72,50);
        add(btnSquare);
        btnSquare.addActionListener(this);


        btnRoot = new JButton("√ ");
        btnRoot.setBounds(150,116,72,50);
        add(btnRoot);
        btnRoot.addActionListener(this);

        btnCut = new JButton("⌫");
        btnCut.setBounds(224,116,72,50);
        add(btnCut);
        btnCut.addActionListener(this);

        btn7 = new JButton("7");
        btn7.setBounds(2,168,72,50);
        add(btn7);
        btn7.addActionListener(this);

        btn8 = new JButton("8");
        btn8.setBounds(76,168,72,50);
        add(btn8);
        btn8.addActionListener(this);


        btn9 = new JButton("9");
        btn9.setBounds(150,168,72,50);
        add(btn9);
        btn9.addActionListener(this);

        btnDiv = new JButton("➗");
        btnDiv.setBounds(224,168,72,50);
        add(btnDiv);
        btnDiv.addActionListener(this);

        btn4 = new JButton("4");
        btn4.setBounds(2,220,72,50);

        add(btn4);
        btn4.addActionListener(this);

        btn5 = new JButton("5");
        btn5.setBounds(76,220,72,50);
        add(btn5);
        btn5.addActionListener(this);

        btn6 = new JButton("6");
        btn6.setBounds(150,220,72,50);
        add(btn6);
        btn6.addActionListener(this);

        btnMul = new JButton("X");
        btnMul.setBounds(224,220,72,50);
        add(btnMul);
        btnMul.addActionListener(this);

        btn1 = new JButton("1");
        btn1.setBounds(2,272,72,50);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        btn2.setBounds(76,272,72,50);
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        btn3.setBounds(150,272,72,50);
        add(btn3);
        btn3.addActionListener(this);

        btnSub = new JButton("-");
        btnSub.setBounds(224,272,72,50);
        add(btnSub);
        btnSub.addActionListener(this);

        btn0 = new JButton("0");
        btn0.setBounds(76,324,72,50);
        add(btn0);
        btn0.addActionListener(this);

        btnDot = new JButton(".");
        btnDot.setBounds(2,324,72,50);
        add(btnDot);
        btnDot.addActionListener(this);

        btnClear = new JButton("C");
        btnClear.setBounds(150,324,72,50);
        add(btnClear);
        btnClear.addActionListener(this);

        btnAdd = new JButton("+");
        btnAdd.setBounds(224,324,72,50);
        add(btnAdd);
        btnAdd.addActionListener(this);

        btnEqual = new JButton("=");
        btnEqual.setBounds(2,376,295,50);
        add(btnEqual);
        btnEqual.addActionListener(this);

        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if(e.getSource() == btn0){
                txt1.setText(txt1.getText()+"0");
            }else if(e.getSource() == btn1){
                txt1.setText(txt1.getText()+"1");
            }else if(e.getSource() == btn2){
                txt1.setText(txt1.getText()+"2");
            }else if(e.getSource() == btn3){
                txt1.setText(txt1.getText()+"3");
            }else if(e.getSource() == btn4){
                txt1.setText(txt1.getText()+"4");
            }else if(e.getSource() == btn5){
                txt1.setText(txt1.getText()+"5");
            }else if(e.getSource() == btn6){
                txt1.setText(txt1.getText()+"6");
            }else if(e.getSource() == btn7){
                txt1.setText(txt1.getText()+"7");
            }else if(e.getSource() == btn8){
                txt1.setText(txt1.getText()+"8");
            }else if(e.getSource() == btn9){
                txt1.setText(txt1.getText()+"9");
            }else if(e.getSource() == btnDot){
                txt1.setText(txt1.getText()+".");
            }else if(e.getSource()== btnClear){
                txt1.setText("");
            }else if(e.getSource() == btnAdd){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                txt1.setText("");
                flag = 1;
            }else if(e.getSource() == btnSub){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                txt1.setText("");
                flag = 2;
            }else if(e.getSource() == btnMul){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                txt1.setText("");
                flag = 3;
            }else if(e.getSource() == btnDiv){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                txt1.setText("");
                flag = 4;
            }else if(e.getSource() == btnPercent){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                result = input1 / 100;
                txt1.setText(Double.toString(result));
            }else if(e.getSource() == btnSquare){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                result = input1*input1;
                txt1.setText(Double.toString(result));
            }else if(e.getSource() == btnRoot){
                str1 = txt1.getText();
                input1 = Double.parseDouble(str1);
                result = Math.sqrt(input1);
                txt1.setText(Double.toString(result));
            }else if(e.getSource() == btnCut){
                String str1 = txt1.getText();
                txt1.setText(str1.substring(0,str1.length()-1));

            }
            if(e.getSource() == btnEqual){
                if(flag == 1){
                    str2 = txt1.getText();
                    input2 = Double.parseDouble(str2);
                    result = input1 + input2;
                    txt1.setText(Double.toString(result));

                }else if(flag == 2){
                    str2 = txt1.getText();
                    input2 = Double.parseDouble(str2);
                    result = input1 - input2;
                    txt1.setText(Double.toString(result));

                }else if(flag == 3){
                    str2 = txt1.getText();
                    input2 = Double.parseDouble(str2);
                    result = input1 * input2;
                    txt1.setText(Double.toString(result));

                }else if(flag == 4){
                    str2 = txt1.getText();
                    input2 = Double.parseDouble(str2);
                    result = input1 / input2;
                    txt1.setText(Double.toString(result));

                }
            }



        }catch (NumberFormatException ex){
            txt1.setText("Syntax Error");
        }

    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}