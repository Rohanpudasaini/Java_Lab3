import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonJava implements ActionListener, MouseListener, KeyListener, WindowListener {
    JTextField t1;
    JButton b1;
    public ButtonJava(){
        JFrame frame = new JFrame("Listining Events");
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(420, 420);
        t1 = new JTextField(20);
        t1.addKeyListener(this);
        t1.addMouseListener(this);
        b1 = new JButton("Submit");
        GridBagConstraints gx = new GridBagConstraints();
        gx.insets = new Insets(7, 7, 7, 7);

        gx.gridx = 3;
        gx.gridy = 1;
        frame.add(t1, gx);

        gx.gridx = 3;
        gx.gridy = 2;
        frame.add(b1, gx);
        b1.addMouseListener(this);

        frame.setVisible(true);


    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == t1) {
            System.out.println(e.getKeyChar()+ " is "+e.getKeyCode()+" in key code ");
            
        }

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == b1) {
            System.out.println(t1.getText());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == b1) {
            b1.setBackground(Color.GREEN);
            System.out.println("Mouse in");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        if (e.getSource() == b1) {
            b1.setBackground(Color.white);
            System.out.println("Mouse out");
        }
         if (e.getSource()== t1) {
            System.out.println("Finished Typing?");
        }
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        
        System.out.println("Closed Window");
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        System.out.println("Closing Window");
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {

    }

    @Override
    public void windowIconified(WindowEvent arg0) {
    }

    @Override
    public void windowOpened(WindowEvent arg0) {
    }

}
