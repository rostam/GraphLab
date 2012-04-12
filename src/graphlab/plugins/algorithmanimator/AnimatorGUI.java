// GraphLab Project: http://graphlab.sharif.edu
// Copyright (C) 2008 Mathematical Science Department of Sharif University of Technology
// Distributed under the terms of the GNU General Public License (GPL): http://www.gnu.org/licenses/

package graphlab.plugins.algorithmanimator;

import graphlab.graph.ui.GHTMLPageComponent;
import graphlab.platform.core.BlackBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Azin Azadi
 */
public class AnimatorGUI {
    public JPanel animatorFrame;
    public JButton pauseButton;
    public JButton playButton;
    public JButton playOneStepButton;
    public JSlider speedSlider;
    public GHTMLPageComponent algorithmOutputTextArea;
    private BlackBoard blackboard;

    public AnimatorGUI(ActionListener listener, BlackBoard blackboard) {
        this.blackboard = blackboard;
        pauseButton.addActionListener(listener);
        playButton.addActionListener(listener);
        playOneStepButton.addActionListener(listener);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        animatorFrame = new JPanel();
        animatorFrame.setLayout(new GridBagLayout());
        animatorFrame.setOpaque(true);
        animatorFrame.setPreferredSize(new Dimension(275, 500));
        pauseButton = new JButton();
        pauseButton.setText("Pause");
        pauseButton.setVerticalAlignment(1);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(pauseButton, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        animatorFrame.add(spacer2, gbc);
        playButton = new JButton();
        playButton.setText("Play");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(playButton, gbc);
        playOneStepButton = new JButton();
        playOneStepButton.setText("Play One Step");
        playOneStepButton.setToolTipText("Play just one step of algorithm");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(playOneStepButton, gbc);
        speedSlider = new JSlider();
        speedSlider.setMajorTickSpacing(25);
        speedSlider.setMaximum(100);
        speedSlider.setMinimum(0);
        speedSlider.setMinorTickSpacing(5);
        speedSlider.setPaintLabels(true);
        speedSlider.setPaintTicks(false);
        speedSlider.setPaintTrack(true);
        speedSlider.setSnapToTicks(true);
        speedSlider.setToolTipText("The delay between steps of algorithm");
        speedSlider.setValue(50);
        speedSlider.setValueIsAdjusting(false);
        speedSlider.putClientProperty("Slider.paintThumbArrowShape", Boolean.TRUE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(speedSlider, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Speed:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        animatorFrame.add(label1, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        animatorFrame.add(spacer3, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        animatorFrame.add(algorithmOutputTextArea, gbc);
//        scrollPane1.setViewportView(algorithmOutputTextArea);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        animatorFrame.add(spacer4, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        animatorFrame.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        animatorFrame.add(spacer6, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return animatorFrame;
    }

    private void createUIComponents() {
        String html = "<html>" +
                "<head>" +
                "<style type='text/css'>" +
                "body{ font-family: monospace; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h2>Algorithm Output:</h2>" +
                "</body>" +
                "</html>";

        algorithmOutputTextArea = new GHTMLPageComponent(blackboard);
        algorithmOutputTextArea.setAutoscrolls(true);
//        algorithmOutputTextArea.getEditorPane().setLineWrap(true);
        algorithmOutputTextArea.getEditorPane().setText(html);
        algorithmOutputTextArea.setToolTipText("Messages sent by algorithm");
        algorithmOutputTextArea.autoScroll();
    }
}
