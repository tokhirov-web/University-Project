import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame {

    Frame frame;

    TextField field1;
    TextField field2;

    Button button;


    GUI() {
        frame = new Frame("Hiring Company");

        field1 = new TextField("Enter the step number that you want to see");
        field2 = new TextField();

        button = new Button("Click");

        button.setBounds(490, 100, 150, 30);

        field1.setBounds(380, 70, 400, 30);
        field2.setBounds(1000, 70, 350, 700);



        Perform other = new Perform(this);

        button.addActionListener(other);


        frame.add(field1);
        frame.add(field2);

        frame.add(button);


        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    public static void main(String[] args) {
        new GUI();
    }


}


class Perform implements ActionListener {

    GUI gObj;
    String userInput;

    Perform(GUI gObj) {
        this.gObj = gObj;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gObj.button) {
            userInput = gObj.field1.getText();
            System.out.println(userInput);
        }

        if (userInput == "2") {

        }

    }

}