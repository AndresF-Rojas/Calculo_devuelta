import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmDevuelta extends JFrame {
    
    //Variables globales
    private int[] denominación=new int[]{100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};
    private int[] existencia = new int[]{denominación.length};
    private JComboBox cmbDenominacion;
    private JTextField txtExistencias;
    
    
    //Método Constructor 
    public FrmDevuelta(){
        setTitle("Calculo de Devueltas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    // Agragar etiquetas
        JLabel lbldenominacion = new JLabel("Denominación");
        lbldenominacion.setBounds(100, 10, 100, 25);
        getContentPane().add(lbldenominacion);

    // Agragar una lista desplegable
        cmbDenominacion = new JComboBox<>();
        cmbDenominacion.setBounds(200, 10, 100, 25);
        getContentPane().add(cmbDenominacion);

    // Crear modelo de datos para lista desplegable
        String[] strDenominacion = new String[denominación.length];
        for (int i=0; i < denominación.length; i++){
            strDenominacion[i] = String.valueOf(denominación[i]);
        }
        cmbDenominacion.setModel(new DefaultComboBoxModel<>(strDenominacion));    

    // Agragar un botón 
        JButton btnActualizarExistencias = new JButton("Actualizar Existencias");
        btnActualizarExistencias.setBounds(10, 40, 180, 25);
        getContentPane().add(btnActualizarExistencias);

    // Agregar una caja de texto 
        txtExistencias = new JTextField();
        txtExistencias.setBounds(200, 40, 100, 25);
        getContentPane().add(txtExistencias);


    // Agregar los eventos para actualizar las existencias
        cmbDenominacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                consultarExistencia();
            }
            
        });
        
        btnActualizarExistencias.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarExistencia();
            }
            
        });

    }

    private void consultarExistencia(){
        int existenciaActual = existencia[cmbDenominacion.getSelectedIndex()];
        txtExistencias.setText(String.valueOf(existenciaActual));
    }

    private void actualizarExistencia(){
        
    };

}
