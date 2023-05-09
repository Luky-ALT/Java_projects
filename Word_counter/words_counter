
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Word Counter: ");
        jFrame.setLayout(null);
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 150);

        JButton button = new JButton("count a words");
        button.setBounds(10, 10, 150, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();


                if (!text.equals("")) {
                    String[] word = text.split("\\s");

                    JOptionPane.showMessageDialog(jFrame, "Total: "+word.length );
                }
            }
        });

        jFrame.add(textArea);
        jFrame.add(button);

    }
}
