package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RouteHandler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final int IMAGE_WIDTH = 903;
	private final int IMAGE_HEIGHT = 497;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouteHandler frame = new RouteHandler();
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
	public RouteHandler() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mapImage = new JLabel("");
		mapImage.setBounds(10, 11, 903, 497);
		mapImage.setIcon(resizeImage("src/resources/full-map.png"));
		mapImage.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                int x = e.getX(); // Get the x-coordinate of the click
                int y = e.getY(); // Get the y-coordinate of the click
                System.out.println("[" + x + "," + y + "]");
            }
        });
		contentPane.add(mapImage);
		
		JLabel lblFromLabel = new JLabel("Inicio");
		lblFromLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		lblFromLabel.setBounds(10, 526, 69, 26);
		contentPane.add(lblFromLabel);
		
		JComboBox cmbFrom = new JComboBox();
		cmbFrom.setBounds(89, 525, 191, 26);
		contentPane.add(cmbFrom);
		
		JComboBox cmbWhere = new JComboBox();
		cmbWhere.setBounds(384, 525, 191, 26);
		contentPane.add(cmbWhere);
		
		JLabel lblWhereLabel = new JLabel("Destino");
		lblWhereLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		lblWhereLabel.setBounds(305, 526, 69, 26);
		contentPane.add(lblWhereLabel);
	}
	
	 private ImageIcon resizeImage(String path) {
	        return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, java.awt.Image.SCALE_SMOOTH));
	 }
}
