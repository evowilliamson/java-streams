import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * LambdaCapture
 */
public class LambdaCapture {

    static JTextField staticTextField;
    static int FIELD_WIDTH = 100;

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        staticTextField = new JTextField();
        staticTextField.setText("Static field");
        JTextField localTextField = new JTextField(FIELD_WIDTH);
        localTextField.setText(("Local field"));
        JButton helloButton = new JButton("Say Hello");

        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                staticTextField.setText("Hello world!");
                localTextField.setText("Hello world!");
            }
        });

        JButton goodbyeButton = new JButton("Say goodbye");
        goodbyeButton.addActionListener(event -> {
            staticTextField.setText("Goodbye world!");
            localTextField.setText("Goodbye world!");
        });

        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        contentPane.add(staticTextField);
        contentPane.add(localTextField);
        contentPane.add(helloButton);
        contentPane.add(goodbyeButton);

        jFrame.setAlwaysOnTop(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }

}
