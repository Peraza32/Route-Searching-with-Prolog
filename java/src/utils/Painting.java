package utils;

import javax.swing.*;
import models.Coordinates;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painting extends JPanel {
    private static final long serialVersionUID = 1L;
    private Coordinates start;
    private Coordinates end;
    private int steps;
    private int currentStep;
    private Timer timer;
    private Stroke lineStroke = new BasicStroke(5.0f); // To make the line thicker
    private Image backgroundImage;

    public Painting(ImageIcon imageIcon) {
    	this.backgroundImage = imageIcon.getImage();
        start = null;
        end = null;
        steps = 0;
        currentStep = 0;

        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentStep < steps) {
                    currentStep++;
                    repaint();
                } else {
                    timer.stop();
                }
            }
        });
	}

	public void paintSegment(Coordinates A, Coordinates B, int animationSteps) {
        start = A;
        end = B;
        steps = animationSteps;
        currentStep = 0;
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this);
        }

        if (start != null && end != null) {
            Graphics2D g2d = (Graphics2D) g;

            double ratio = (double) currentStep / steps;
            int x1 = (int) (start.getX() + ratio * (end.getX() - start.getX()));
            int y1 = (int) (start.getY() + ratio * (end.getY() - start.getY()));

            g2d.setStroke(lineStroke); // Set the line thickness
            g2d.setColor(Color.ORANGE); // Set the line color (you can change this)
            g2d.drawLine(start.getX(), start.getY(), x1, y1);
        }
    }
}
