package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Coordinates;
import utils.Painting;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RouteHandler extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final int IMAGE_WIDTH = 903;
    private final int IMAGE_HEIGHT = 497;
    private final int ANIMATION_STEPS = 12;
    private Painting paintingPanel;

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
        mapImage.setBounds(10, 11, IMAGE_WIDTH, IMAGE_HEIGHT);
        mapImage.setIcon(resizeImage("src/resources/full-map.png"));
        mapImage.addMouseListener(new MouseAdapter() {
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

        JComboBox<?> cmbFrom = new JComboBox<Object>();
        cmbFrom.setBounds(89, 525, 191, 26);
        contentPane.add(cmbFrom);

        JComboBox<?> cmbWhere = new JComboBox<Object>();
        cmbWhere.setBounds(384, 525, 191, 26);
        contentPane.add(cmbWhere);

        JLabel lblWhereLabel = new JLabel("Destino");
        lblWhereLabel.setFont(new Font("Consolas", Font.BOLD, 14));
        lblWhereLabel.setBounds(305, 526, 69, 26);
        contentPane.add(lblWhereLabel);

        // Create the painting panel
        paintingPanel = new Painting(resizeImage("src/resources/full-map.png"));
        paintingPanel.setBounds(10, 11, IMAGE_WIDTH, IMAGE_HEIGHT);
        contentPane.add(paintingPanel);

        JButton btnShowRoute = new JButton("Dibujar Ruta");
        btnShowRoute.setBounds(761, 527, 152, 23);
        contentPane.add(btnShowRoute);

        btnShowRoute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintSegment(new Coordinates(141, 303), new Coordinates(449, 178), ANIMATION_STEPS);
            }
        });
    }

    private ImageIcon resizeImage(String path) {
        return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, java.awt.Image.SCALE_SMOOTH));
    }

    private void paintSegment(Coordinates A, Coordinates B, int animationSteps) {
        paintingPanel.paintSegment(A, B, animationSteps);
    }
}
