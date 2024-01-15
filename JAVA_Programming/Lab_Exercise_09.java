import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartGridGUI extends JFrame {

    private JLabel statusLabel;
    private JButton startButton;
    private JButton stopButton;

    public SmartGridGUI() {
        setTitle("Smart Grid Control Panel");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
        setupLayout();
    }

    private void initializeComponents() {
        statusLabel = new JLabel("Smart Grid Status: Offline");

        startButton = new JButton("Start Smart Grid");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to start the smart grid system
                statusLabel.setText("Smart Grid Status: Online");
            }
        });

        stopButton = new JButton("Stop Smart Grid");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to stop the smart grid system
                statusLabel.setText("Smart Grid Status: Offline");
            }
        });
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JPanel statusPanel = new JPanel();
        statusPanel.add(statusLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);

        add(statusPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SmartGridGUI smartGridGUI = new SmartGridGUI();
                smartGridGUI.setVisible(true);
            }
        });
    }
}
