package formularios;

import dao.DAOClientesImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class formClientes extends javax.swing.JFrame{
    private JPanel panel1;
    private JPasswordField clave;
    private JTextField textUsuario;
    private JTextField textFecha_nacimiento;
    private JTextField textEmail;
    private JTextField textTelefono;
    private JTextField textEdad;
    private JTextField textMascota;
    private JTextField textId;
    private JTextField textApellido;
    private JTextField textAlimento;
    private JTextField textNombre;
    private JRadioButton btnInsert;
    private JTable tblData;
    private JRadioButton btnUpdate;
    private JRadioButton btnDelete;

    String columns[] = {"Id","Nombre","Apellido","Mascota","Edad","Fecha Nac","Alimento","Telefono","Email", "Usuario", "Clave"};
    DefaultTableModel modelo = new DefaultTableModel(columns, 0);
    // DAOClientes dao = new DAOClientes() {
    DAOClientesImpl dao = new DAOClientesImpl() ;
    //  @Override
    //  public boolean insert(Object obj) {
    //      return false;
    //  }

    //   @Override
    //  public boolean delete(Object obj) {
    //      return false;
    //  }

    //   @Override
    //  public boolean upDate(Object obj) {
    //      return false;
    //  }

    //    @Override
    //    public ArrayList<Object[]> consultar() {
    //       return null;
    //     }
    // };
    //lo de ocverride no va segun este modelo de yv
    ArrayList<Object[]>data = new ArrayList<>();
    private void createUIComponents() {
        /* TODO: place custom component creation code here */






//public DefaultTableModel(  Object[] columnNames,
 //      int rowCount ){

//       }
 //       Constructs a DefaultTableModel with as many columns as there are elements in columnNames and rowCount of null object values. Each column's name will be taken from the columnNames array.
  ////      Params:
   //     columnNames – array containing the names of the new columns; if this is null then the model has no columns rowCount – the number of rows the table holds

   // public formClientes(){
  //  initComponents();
    cargar();

    }

    private void cargar(){
    this.data = dao.consultar();
    modelo.setNumRows(0);
    for (Object[]dato:this.data) {
        this.modelo.addRow(dato);
    }
        tblData.setModel(modelo);

        }}

