package utils;

import javax.swing.*;
import models.Coordinates;
import models.Segment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Painting extends JPanel {
    private static final long serialVersionUID = 1L;
    private List<Segment> segmentsToDraw = new ArrayList<>();
    private int currentStep;
    private int animationSteps;
    private Timer timer;
    private Stroke lineStroke = new BasicStroke(5.0f); // To make the line thicker
    private Image backgroundImage;
    private ActionListener animationCompleteListener;

    
    
    
    /**
	 * @return the segmentsToDraw
	 */
	public List<Segment> getSegmentsToDraw() {
		return segmentsToDraw;
	}

	/**
	 * @param segmentsToDraw the segmentsToDraw to set
	 */
	public void setSegmentsToDraw(List<Segment> segmentsToDraw) {
		this.segmentsToDraw = segmentsToDraw;
	}

	public Painting(ImageIcon imageIcon) {
        this.backgroundImage = imageIcon.getImage();
        currentStep = 0;
        animationSteps = 0;

        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentStep < animationSteps) {
                    currentStep++;
                    repaint();
                } else {
                    timer.stop();
                    if (animationCompleteListener != null) {
                        animationCompleteListener.actionPerformed(null);
                    }
                }
            }
        });
    }

    public void paintSegment(Segment segment, int animationSteps, ActionListener listener) {
        segmentsToDraw.add(segment);
        this.animationSteps = animationSteps;
        currentStep = 0;
        animationCompleteListener = listener;
        if (!timer.isRunning()) {
            timer.start();
        }
    }

    public void paintSegment(Segment segment, int animationSteps) {
        paintSegment(segment, animationSteps, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This version of the method doesn't need an ActionListener
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this);
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(lineStroke);
        g2d.setColor(Color.ORANGE);

        for (Segment segment : segmentsToDraw) {
            Coordinates start = segment.getStart();
            Coordinates finish = segment.getFinish();

            int x1 = (int) (start.getX() + (double) currentStep / animationSteps
                    * (finish.getX() - start.getX()));
            int y1 = (int) (start.getY() + (double) currentStep / animationSteps
                    * (finish.getY() - start.getY()));
            g2d.drawLine(start.getX(), start.getY(), x1, y1);
        }
    }
}
