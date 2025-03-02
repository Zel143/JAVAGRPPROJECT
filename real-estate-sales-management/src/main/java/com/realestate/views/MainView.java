import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JTextField sizeField;
    private JTextField locationField;
    private JTextField priceField;
    private JTextArea lotDisplayArea;
    private JButton searchButton;
    private JButton reserveButton;
    private JButton sellButton;

    public MainView() {
        setTitle("Real Estate Sales & Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Size (sqr. meters):"));
        sizeField = new JTextField();
        inputPanel.add(sizeField);

        inputPanel.add(new JLabel("Location (Block):"));
        locationField = new JTextField();
        inputPanel.add(locationField);

        inputPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        searchButton = new JButton("Search Lots");
        reserveButton = new JButton("Reserve Lot");
        sellButton = new JButton("Sell Lot");

        inputPanel.add(searchButton);
        inputPanel.add(reserveButton);
        inputPanel.add(sellButton);

        lotDisplayArea = new JTextArea();
        lotDisplayArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(lotDisplayArea), BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to search lots based on user input
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to reserve a lot
            }
        });

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to sell a lot
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainView mainView = new MainView();
            mainView.setVisible(true);
        });
    }
}