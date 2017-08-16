/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2a;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
class JanelaSoma extends JFrame{
    private final JLabel textIntroduceNumber = new JLabel("primeiro Número:"); 
    private final JLabel textIntroduceSecondNumber = new JLabel("segundo Número:");
    private JLabel labelSoma = new JLabel();
    private final JTextField textFirstNumber = new JTextField(15);
    private final JTextField textSecondNumber = new JTextField(15);
    
        public JanelaSoma() throws HeadlessException {
        super("soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(textIntroduceNumber);
        add(textFirstNumber);
        add(textIntroduceSecondNumber);
        add(textSecondNumber);
        labelSoma = new JLabel("");
        add(labelSoma);
        
    }
}
