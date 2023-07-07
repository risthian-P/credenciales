import javax.swing.*;

public class credencial {
    private JTextField name;
    private JTextField cedula;
    private JTextField edad;
    private JButton guardar;
    private JPanel roolPanel;
    private JButton cargar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("credencial");
        frame.setContentPane(new credencial().roolPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
