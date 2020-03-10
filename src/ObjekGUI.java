/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class ObjekGUI {
       public static void main(String[] args) {
	GUI g = new GUI();
   }
}
class GUI extends JFrame {
   final JTextField fnama = new JTextField(10);

   JLabel lnama = new JLabel(" Nama Lengkap ");
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lhobby = new JLabel(" Hobby ");

   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");

   JButton btnSave = new JButton("OK");
   JLabel hasilNama = new JLabel();
   JLabel hasiljeniskelamin = new JLabel();
   JLabel hasilagama = new JLabel();

   public GUI() {
    setTitle("Mencoba Kombinasi Komponen GUI");
	setDefaultCloseOperation(3);
	setSize(350,500);
        setLocation(720,300);
        
        btnSave.addActionListener(((e) -> {
           if (fnama.getText().length()==0){
               JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
           }else{
               String nama = fnama.getText();
               hasilNama.setText(nama);
              }
          if(rbPria.isSelected()){
              hasiljeniskelamin.setText("Pria");
          }else if(rbWanita.isSelected()){
              hasiljeniskelamin.setText("Wanita");
          }
          String agama = (String) cmbAgama.getSelectedItem();
          hasilagama.setText(agama);
        }));

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);
        
        
	setLayout(null);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
	add(lhobby);
	add(cbSepakbola);
	add(cbBasket);
	add(btnSave);
        add(hasilNama);
        add(hasiljeniskelamin);
        add(hasilagama);
        
	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
	ljeniskelamin.setBounds(10,35,120,20);
	rbPria.setBounds(130,35,100,20);
	rbWanita.setBounds(230,35,100,20);
	lagama.setBounds(10,60,150,20);
	cmbAgama.setBounds(130,60,150,20);
	lhobby.setBounds(10,85,120,20);
	cbSepakbola.setBounds(130,85,100,20);
	cbBasket.setBounds(230,85,150,20);
	btnSave.setBounds(100,130,120,20);
        hasilNama.setBounds(10,150,120,20);
        hasiljeniskelamin.setBounds(10,170,120,20);
        hasilagama.setBounds(10,190,120,20);
	setVisible(true);
   }

}
