import javax.swing.*;

public class Exercise2_DisplayingMenuUsingSwitchCase{

private int country;

public Exercise2_DisplayingMenuUsingSwitchCase(int country){

this.country = country;

}

public int getcountry(){

return this.country;

}

public void displaycountry(){

switch(getcountry()){

case 1:
JOptionPane.showMessageDialog(null,"Riyadh");
break;

case 2:
JOptionPane.showMessageDialog(null,"London");
break;

case 3:
JOptionPane.showMessageDialog(null,"Washington");
break;

case 4:
JOptionPane.showMessageDialog(null,"Montreal");
break;

case 5:
JOptionPane.showMessageDialog(null,"Paris");
break;

case 6:
JOptionPane.showMessageDialog(null,"Berlin");
break;

case 7:
JOptionPane.showMessageDialog(null,"Rome");
break;

case 8:
JOptionPane.showMessageDialog(null,"Tunis");
break;

case 9:
JOptionPane.showMessageDialog(null,"Rabat");
break;

case 10:
JOptionPane.showMessageDialog(null,"Alger");
break;

default:
JOptionPane.showMessageDialog(null,"Not Valid");
break;

}


}



}