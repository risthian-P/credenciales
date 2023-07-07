import javax.swing.*;

public class credencial {

    //ventana
    private JTextField name;
    private JTextField cedula;
    private JTextField edad;
    private JButton guardar;
    private JPanel roolPanel;
    private JButton cargar;

    //Archivos
    String file = "credenciales_datos.dat"


    //generation main, necesita tener un JPanel
    public static void main(String[] args) {
        JFrame frame = new JFrame("credencial");
        frame.setContentPane(new credencial().roolPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public credencial (){

    }
}

