import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class studentInfo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COMPUTER SCIENCE STUDENT REGISTRATION");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create the menu dashboard
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1, 3));

        JButton registerButton = new JButton("Register");
        JButton editProfileButton = new JButton("Edit Profile");
        JButton studentListButton = new JButton("Student List");

        menuPanel.add(registerButton);
        menuPanel.add(editProfileButton);
        menuPanel.add(studentListButton);

        frame.add(menuPanel, BorderLayout.NORTH);

        // Create the main panel to switch between different views
        JPanel mainPanel = new JPanel(new CardLayout());

        // Register Panel
        JPanel registerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Profile Picture
        JLabel profilePicLabel = new JLabel("Profile Picture:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(profilePicLabel, gbc);

        JLabel profilePicViewer = new JLabel();
        profilePicViewer.setPreferredSize(new Dimension(100, 100));
        profilePicViewer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gbc.gridx = 1;
        gbc.gridy = 0;
        registerPanel.add(profilePicViewer, gbc);

        JButton uploadButton = new JButton("Upload Image");
        gbc.gridx = 2;
        gbc.gridy = 0;
        registerPanel.add(uploadButton, gbc);

        // Action listener for the upload button
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    ImageIcon imageIcon = new ImageIcon(fileChooser.getSelectedFile().getPath());
                    Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    profilePicViewer.setIcon(new ImageIcon(image));
                }
            }
        });

        // Surname
        JLabel surnameLabel = new JLabel("Surname:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        registerPanel.add(surnameLabel, gbc);

        JTextField surnameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        registerPanel.add(surnameField, gbc);

        // Given Name
        JLabel givenNameLabel = new JLabel("Given Name:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        registerPanel.add(givenNameLabel, gbc);

        JTextField givenNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        registerPanel.add(givenNameField, gbc);

        // Middle Name
        JLabel middleNameLabel = new JLabel("Middle Name:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        registerPanel.add(middleNameLabel, gbc);

        JTextField middleNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        registerPanel.add(middleNameField, gbc);

        // School Year
        JLabel schoolYearLabel = new JLabel("School Year:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        registerPanel.add(schoolYearLabel, gbc);

        String[] schoolYears = {"Freshman", "Sophomore", "Junior", "Senior"};
        JComboBox<String> schoolYearComboBox = new JComboBox<>(schoolYears);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        registerPanel.add(schoolYearComboBox, gbc);

        // Section
        JLabel sectionLabel = new JLabel("Section:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        registerPanel.add(sectionLabel, gbc);

        JTextField sectionField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        registerPanel.add(sectionField, gbc);

        // Addresses
        JLabel addressesLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 6;
        registerPanel.add(addressesLabel, gbc);

        JTextField addressesField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        registerPanel.add(addressesField, gbc);

        // BirthDate
        JLabel birthDateLabel = new JLabel("Birth Date:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        registerPanel.add(birthDateLabel, gbc);

        JTextField birthDateField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        registerPanel.add(birthDateField, gbc);

        // Place of Birth
        JLabel placeOfBirthLabel = new JLabel("Place of Birth:");
        gbc.gridx = 0;
        gbc.gridy = 8;
        registerPanel.add(placeOfBirthLabel, gbc);

        JTextField placeOfBirthField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        registerPanel.add(placeOfBirthField, gbc);

        // Phone Number
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        gbc.gridx = 0;
        gbc.gridy = 9;
        registerPanel.add(phoneNumberLabel, gbc);

        JTextField phoneNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        registerPanel.add(phoneNumberField, gbc);

        // Email Addresses
        JLabel emailAddressesLabel = new JLabel("Email Address:");
        gbc.gridx = 0;
        gbc.gridy = 10;
        registerPanel.add(emailAddressesLabel, gbc);

        JTextField emailAddressesField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        registerPanel.add(emailAddressesField, gbc);

        // Register Button
        JButton submitButton = new JButton("Register");
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        registerPanel.add(submitButton, gbc);

        // Add the register panel to the main panel
        mainPanel.add(registerPanel, "Register");

        // Edit Profile Panel
        JPanel editProfilePanel = new JPanel();
        editProfilePanel.add(new JLabel("Edit Profile Form"));
        // Add more components for edit profile form here

        // Student List Panel
        JPanel studentListPanel = new JPanel();
        studentListPanel.add(new JLabel("Student List"));
        // Add more components for student list here

        mainPanel.add(editProfilePanel, "Edit Profile");
        mainPanel.add(studentListPanel, "Student List");

        frame.add(mainPanel, BorderLayout.CENTER);

        // Action Listeners for buttons
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Register");
            }
        });

        editProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Edit Profile");
            }
        });

        studentListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Student List");
            }
        });

        frame.setVisible(true);
    }
}
