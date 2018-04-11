import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textFeildH;
	private JTextField textField;
	private JSlider sliderH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// update textFieldH
				JSlider me = (JSlider)e.getSource();
				
				//new update textfiled
				textFeildH.setText("" + me.getValue());
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setBounds(70, 59, 368, 37);
		contentPane.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setMinorTickSpacing(2);
		slider_1.setMaximum(80);
		slider_1.setMajorTickSpacing(20);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setOrientation(SwingConstants.VERTICAL);
		slider_1.setBounds(49, 130, 54, 199);
		contentPane.add(slider_1);
		
		textFeildH = new JTextField();
		textFeildH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField me = (JTextField)e.getSource();
				
				//updtae slider to match value here	
				sliderH.setValue(Integer.parseInt(me.getText)));
			}
		});
		textFeildH.setBounds(348, 28, 86, 20);
		contentPane.add(textFeildH);
		textFeildH.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(49, 340, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
