import javax.swing.*;


public class Exercise2_TestDisplayingMenuUsingSwitchCase{

public static void main(String [] args){

int country;



country = Integer.parseInt(JOptionPane.showInputDialog("Type a country of your choice \n 1.Saudi Arabia \n 2.United Kingdom \n 3.United States of America \n 4.Canada \n 5.France \n 6.Germany \n 7.Italy \n 8.Tunisia \n 9.Morocco \n 10.Algeria"));


Exercise2_DisplayingMenuUsingSwitchCase n = new Exercise2_DisplayingMenuUsingSwitchCase(country);
n.displaycountry();  


}


}