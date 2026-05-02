package atombuilder;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gui extends JFrame implements ActionListener { //mostly copied from zybooks ngl
   private JLabel searchLabel;
   private JLabel findLabel;
   private JTextField searchField;
   private JTextField findField;


   gui() {
      GridBagConstraints layoutConst = null;

      setTitle("Atom Builder");

      searchLabel = new JLabel("Atom abbreviation:");
      findLabel = new JLabel("Full name:");

      searchField = new JTextField(15);
      searchField.setEditable(true);
      searchField.setText("");
      searchField.addActionListener(this);

      findField = new JTextField(15);
      findField.setEditable(false);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Add component using the specified constraints
      add(searchLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(searchField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(findLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(findField, layoutConst);
   }

   @Override
   public void actionPerformed(ActionEvent event) {
	   ArrayList<Atom> periodic = new ArrayList<Atom>();
	   atombuilder.populateAtomList(periodic);
	   findField.setText(atombuilder.searchForAtomAbbreviation(periodic, searchField.getText()).name);
   }
}
