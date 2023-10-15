package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Coordinates;
import models.Segment;
import models.Street;
import utils.Painting;
import utils.Places;
import utils.Streets;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RouteHandler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final int IMAGE_WIDTH = 1680;
	private final int IMAGE_HEIGHT = 700;
	private final int ANIMATION_STEPS = 2;
	private final Places placesInstance = Places.getInstance();
	private final Streets streetsInstance = Streets.getInstance();
	private final List<Street> ALL_STREETS = streetsInstance.getContent();
    private Queue<Segment> segmentQueue = new LinkedList<>();
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
		setBounds(5, 30, IMAGE_WIDTH + 40, IMAGE_HEIGHT + 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFromLabel = new JLabel("Inicio");
		lblFromLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		lblFromLabel.setBounds(10, 730, 69, 26);
		contentPane.add(lblFromLabel);

		DefaultComboBoxModel<String> fromComboBoxModel = new DefaultComboBoxModel<>(placesInstance.getPlaceNames());
		DefaultComboBoxModel<String> whereComboBoxModel = new DefaultComboBoxModel<>(placesInstance.getPlaceNames());

		JComboBox<String> cmbFrom = new JComboBox<String>(fromComboBoxModel);
		cmbFrom.setBounds(89, 730, 245, 26);
		contentPane.add(cmbFrom);

		JComboBox<String> cmbWhere = new JComboBox<String>(whereComboBoxModel);
		cmbWhere.setBounds(423, 730, 245, 26);
		contentPane.add(cmbWhere);

		JLabel lblWhereLabel = new JLabel("Destino");
		lblWhereLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		lblWhereLabel.setBounds(344, 730, 69, 26);
		contentPane.add(lblWhereLabel);

		JButton btnShowRoute = new JButton("Dibujar Ruta");
		btnShowRoute.setBounds(1538, 731, 152, 23);
		contentPane.add(btnShowRoute);

		JLabel mapImage = new JLabel("");
		mapImage.setBounds(10, 11, IMAGE_WIDTH, IMAGE_HEIGHT);
		mapImage.setIcon(resizeImage("src/resources/full-map.png"));
		mapImage.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		contentPane.add(mapImage);

		// Create the painting panel
		paintingPanel = new Painting(resizeImage("src/resources/full-map.png"));
		paintingPanel.setBounds(10, 11, IMAGE_WIDTH, IMAGE_HEIGHT);
		contentPane.add(paintingPanel);
		
			btnShowRoute.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Clear the queue before adding new segments
	                segmentQueue.clear();

	                // Add segments to the queue
	                for (Street street : ALL_STREETS) {
	                	for (Segment segment : street.getStreetSegments()) {
	                		segmentQueue.add(segment);
						}
					}
	                
	                // segmentQueue.add(ALL_STREETS.get(21).getStreetSegments().get(0));
	                // segmentQueue.add(ALL_STREETS.get(20).getStreetSegments().get(0));

	                // Start painting the segments
	                startPainting();
	            }
	        });
				
				// TODO: SEND PLACES TO PROLOG AND RECEIVE THE STREETS ARRAY
				// TODO: PARSE STREETS WITH ITS SEGMENT AND PAINT EACH SEGMENT
				
				// (String) cmbFrom.getSelectedItem(), (String) cmbWhere.getSelectedItem()   ----> Getting from and to place's names
					
			
	}
	
	private void startPainting() {
        if (!segmentQueue.isEmpty()){
            Segment segment = segmentQueue.poll();
            paintSegment(segment.getStart(), segment.getFinish());
        }
    }

	private void paintSegment(Coordinates A, Coordinates B) {
	    Segment segment = new Segment(A, B); // Create a Segment object
	    paintingPanel.paintSegment(segment, ANIMATION_STEPS, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Continue with the next segment after the animation is complete
	            startPainting();
	        }
	    });
	}


	private ImageIcon resizeImage(String path) {
		return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT,
				java.awt.Image.SCALE_SMOOTH));
	}

	private void paintRoute() {
		
		/*
		 * if(placesInstance.isValidPlace(where) && placesInstance.isValidPlace(from) &&
		 * from != where) { System.out.println(from + " -> " + where); paintSegment(new
		 * Coordinates(660,274), new Coordinates(199,330)); }
		 */
	}
}
