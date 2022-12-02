//.....................packages.................................

import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//.............Main Class of this program........................

class Main {

//.........................main function...............................
           public static void main(String[] args) {
    char choice;
    int opr1,opr2,opr3,opr4;

// create an object of Scanner class
    
    Scanner input1 = new Scanner(System.in);

    System.out.println("\n\n     ****************************************************");
    System.out.println("     *WELCOME TO CALCULATOR DEVELOPED BY DEEPANSHU GUPTA*");
    System.out.println("     ****************************************************");

    do{
    System.out.println("          Mode(1)  Simple Calculator\n");
    System.out.println("          Mode(2)  Scientific Calculator\n");
    System.out.println("          Mode(3)  Converter Calculator\n");
    System.out.println("          Choose a mode of the Calculator\n\n");
    opr1= input1.nextInt();
     
            switch(opr1)
            {
                 case 1:
                 System.out.println("*************Welcome To Simple Calculator**************\n");
                 System.out.println("1. Addition                                2. Subtraction\n");
                 System.out.println("3. Multiplication                          4. Division\n");
                 System.out.println("                              5. Modulus\n");
                 System.out.println("                Choose an operation from the above: ");

                 Scanner input2 = new Scanner(System.in);
                 opr2= input2.nextInt(); 

                 

//........................Switch case....................................

        switch(opr2)
        {
         case 1:
Add obj=new Add();
         break;                     
         case 2:
Sub obj1=new Sub();         
         break;

         case 3:
Mul obj2=new Mul();         
         break;

         case 4:
Div obj3=new Div();         
         break;

         case 5:
Mod obj4=new Mod();        
         break;

         default:
         System.out.println("\n Operator Not Found!........");
         } break;
               
   case 2:
              System.out.println("****************Welcome To Scientific Calculator*****************\n");
              System.out.println("1. Square                                                           2. Cube\n");
              System.out.println("3. Sin                                                              4. Cos\n");
              System.out.println("5. Tan                                                              6. Ln\n");
              System.out.println("7. Log                                                              8. Square Root\n");
              System.out.println("9. Cube Root                                                        10. Factorial\n");
              System.out.println("11. Hypotenuse                                                      12. Roots of Equation\n");
              System.out.println("                     Choose an operation from the above: ");
              Scanner input5 = new Scanner(System.in);
              opr3= input5.nextInt(); 

               
           switch(opr3)
                 {
                     case 1:
                     Sq obj5=new Sq();
                     break;
                     
                     case 2:
                     Cb obj6=new Cb();
                     break;

                     case 3:
                     Sin obj7=new Sin();
                     break;

                     case 4:
                     Cos obj8=new Cos();
                     break;

                     case 5:
                     Tan obj9=new Tan();
                     break;

                     case 6:
                     Ln obj10=new Ln();
                     break;

                     case 7:
                     Log obj11=new Log();
                     break;

                     case 8:
                     Sqrt obj12=new Sqrt();
                     break;

                     case 9:
                     Cbrt obj13=new Cbrt();
                     break;

                     case 10: 
                     Fac obj14=new Fac();
                     break;

                     case 11:
                     Hyp obj15=new Hyp();
                     break;

                      case 12:
                     Root obj16=new Root();
                            break;

                     default:
                     System.out.println("\n Operator Not Found!........");
                     }break;
case 3:
System.out.println("*********************Welcome To Converter Calculator*****************\n");
System.out.println("1. Degree Celsius To Fahrenheit                                2. Fahrenheit To Kelvin\n");
System.out.println("3. Kelvin To Degree Celsius                                    4. Meter To Foot\n");
System.out.println("                                             5. Meter To Inch\n\n");
System.out.println("                Choose an operation from the above: ");

                 Scanner input22 = new Scanner(System.in);
                 opr4= input22.nextInt(); 

    //........................Switch case....................................

        switch(opr4)
        {
         case 1:
         Ctf obj17=new Ctf();
         break;
                     
         case 2:
         Ftk obj18=new Ftk();
         break;

         case 3:
         Ktc obj19=new Ktc();
         break;

         case 4:
         Mtf obj20=new Mtf();
         break;

         case 5:
         Mti obj21=new Mti();
         break;

         default:
         System.out.println("\n Operator Not Found!........");
         } break;
                    
                    default:
                    System.out.println("\n ERROR!........");
            }
           System.out.println("\nDo you want to continue(y/n): ");
           Scanner input7 = new Scanner(System.in);
           choice= input7.next().charAt(0);
       }while(choice=='y');
 }
}

class Add extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Add(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("ADD");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=num1+num2;
l1.setText(value1+"");
}       
}
class Sub extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Sub(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("SUB");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=num1-num2;
l1.setText(value1+"");
}       
}
class Mul extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Mul(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("MUL");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=num1*num2;
l1.setText(value1+"");
}       
}
class Div extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Div(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("DIV");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=num1/num2;
l1.setText(value1+"");
}       
}
class Mod extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Mod(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("MOD");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=num1%num2;
l1.setText(value1+"");
}       
}
class Sq extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Sq(){
t1=new JTextField(15);
b1=new JButton("SQUARE");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=num1*num1;
l1.setText(value1+"");
}       
}
class Cb extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Cb(){
t1=new JTextField(15);
b1=new JButton("CUBE");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=num1*num1*num1;
l1.setText(value1+"");
}       
}
class Sin extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Sin(){
t1=new JTextField(15);
b1=new JButton("SIN");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.sin(num1);
l1.setText(value1+"");
}       
}
class Cos extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Cos(){
t1=new JTextField(15);
b1=new JButton("COS");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.cos(num1);
l1.setText(value1+"");
}       
}
class Tan extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Tan(){
t1=new JTextField(15);
b1=new JButton("TAN");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.tan(num1);
l1.setText(value1+"");
}       
}
class Ln extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Ln(){
t1=new JTextField(15);
b1=new JButton("LOG");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.log(num1);
l1.setText(value1+"");
}       
}
class Log extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Log(){
t1=new JTextField(15);
b1=new JButton("LOG Base10");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.log10(num1);
l1.setText(value1+"");
}       
}
class Sqrt extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Sqrt(){
t1=new JTextField(15);
b1=new JButton("SQRT");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.sqrt(num1);
l1.setText(value1+"");
}       
}
class Cbrt extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Cbrt(){
t1=new JTextField(15);
b1=new JButton("CUBRT");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=Math.cbrt(num1);
l1.setText(value1+"");
}       
}
class Fac extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Fac(){
t1=new JTextField(15);
b1=new JButton("FAC");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
int i;
             double fact=1;
             for(i=1;i<=num1;i++)
             { 
             fact=fact*i; 
             }
l1.setText(fact+"");
}       
}
class Hyp extends JFrame implements ActionListener{
JTextField t1,t2;
JButton b1;
JLabel l1;
public Hyp(){
t1=new JTextField(15);
t2=new JTextField(15);
b1=new JButton("HYP");
l1=new JLabel("Result");
add(t1);
add(t2);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double value1=Math.sqrt((num1*num1)+(num2*num2));
l1.setText(value1+"");
}       
}
class Root extends JFrame implements ActionListener{
JTextField t1,t2,t3;
JButton b1;
JLabel l1,l2;
public Root(){
t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);
b1=new JButton("ROOTS");
l1=new JLabel("Result");
l2=new JLabel("Result");
add(t1);
add(t2);
add(t3);
add(b1);
add(l1);
add(l2);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(600,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double det,r1,r2,real,img;
double num1=Double.parseDouble(t1.getText());
double num2=Double.parseDouble(t2.getText());
double num3=Double.parseDouble(t3.getText());
 det=num2*num2-4*num1*num3;
                      if(det>0){
                                      r1=(-num2+Math.sqrt(det))/(2*num1);
                                      r2=(-num2-Math.sqrt(det))/(2*num1);
                                  l1.setText(r1+"");
                                  l2.setText(r2+"");
                                     }
                      else if(det==0){
                                               r1=r2=-num2/(2*num1);
                                              l1.setText(r1+"");
                                              l2.setText(r1+""); 
                                               
                                              }
                      else{
                              real=-num2/(2*num1);
                              img=Math.sqrt(-det)/(2*num1);    
                                 l1.setText(real+"+"+img+"");
                                 l2.setText(real+"-"+img+"");
                             }     
}       
}
class Ctf extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Ctf(){
t1=new JTextField(15);
b1=new JButton("CelToFah");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=(((num1*9)/5)+32);
l1.setText(value1+"");
}       
}
class Ftk extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Ftk(){
t1=new JTextField(15);
b1=new JButton("FahToKel");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=((num1-32)*0.56+273.15);
l1.setText(value1+"");
}       
}
class Ktc extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Ktc(){
t1=new JTextField(15);
b1=new JButton("KelToCel");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=(num1-273.15);
l1.setText(value1+"");
}       
}
class Mtf extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Mtf(){
t1=new JTextField(15);
b1=new JButton("MetToFt");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=(3.281*num1);
l1.setText(value1+"");
}       
}
class Mti extends JFrame implements ActionListener{
JTextField t1;
JButton b1;
JLabel l1;
public Mti(){
t1=new JTextField(15);
b1=new JButton("MetToInc");
l1=new JLabel("Result");
add(t1);
add(b1);
add(l1);

b1.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double num1=Double.parseDouble(t1.getText());
double value1=(39.37*num1);
l1.setText(value1+"");
}       
}
