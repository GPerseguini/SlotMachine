package view;
import controller.SlotController;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tf2;
	private JTextField tf1;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setBounds(175, 83, 87, 73);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setColumns(10);
		tf1.setBounds(69, 83, 87, 73);
		contentPane.add(tf1);
		
		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setColumns(10);
		tf3.setBounds(285, 83, 87, 73);
		contentPane.add(tf3);
		
		JButton btJogar = new JButton("玩儿");
		btJogar.setBounds(297, 220, 117, 29);
		contentPane.add(btJogar);
		
		SlotController slot = new SlotController(tf1, tf2, tf3, btJogar); 
		btJogar.addActionListener(slot);
	}
}
