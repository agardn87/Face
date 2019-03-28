package Face;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Face extends JFrame {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel pic = new JPanel();
    private JCheckBox chckbxNewCheckBox = new JCheckBox("Eyes");
    private JCheckBox chckBoxNose = new JCheckBox("Nose");
    private JCheckBox chckbxMouth = new JCheckBox("Mouth");
    private JLabel label = new JLabel("Change face");
    private JLabel eyes = new JLabel();
    private JLabel nose = new JLabel();
    private JLabel mouth = new JLabel();
    private JButton btnUpdate = new JButton();
    private Icon browneyes = new ImageIcon(Face.class.getResource("Images/Browneyes.jpeg"));
    private Icon coolEyes = new ImageIcon(Face.class.getResource("Images/CoolEyes.jpeg"));
    private Icon prettyEyes = new ImageIcon(Face.class.getResource("Images/prettyeyes.jpeg"));
    private Icon whiteNose = new ImageIcon(Face.class.getResource("Images/white nose.jpeg"));
    private Icon crookedNose = new ImageIcon(Face.class.getResource("Images/crookedNose.jpeg"));
    private Icon uglyNose = new ImageIcon(Face.class.getResource("Images/uglynose.jpeg"));
    private Icon plainMouth = new ImageIcon(Face.class.getResource("Images/plainmouth.jpeg"));
    private Icon lipMouth = new ImageIcon(Face.class.getResource("Images/lipmouth.jpeg"));
    private Icon provocativeMouth = new ImageIcon(Face.class.getResource("Images/provocativemouth.jpeg"));

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Face frame = new Face();
                try {
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private Face() {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(westPanel(), BorderLayout.WEST);
        frame.add(picPanel(), BorderLayout.EAST);
    }

    private JPanel westPanel() {
        chckbxNewCheckBox.setBounds(30,150,113,25);
        chckBoxNose.setBounds(30, 200, 113, 25);
        chckbxMouth.setBounds(30, 250, 113, 25);
        label.setBounds(25, 100, 97, 25);
        panel.setVisible(true);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(150, 450));
        panel.setLayout(new GroupLayout(panel));
        panel.add(chckBoxNose);
        panel.add(chckbxMouth);
        panel.add(chckbxNewCheckBox);
        panel.add(updateButton());
        panel.add(label);
        return panel;
    }

    private JPanel picPanel() {
        pic.setVisible(true);
        pic.setLayout(new BorderLayout(0,0));
        pic.setBackground(new Color(200,170,150));
        pic.setPreferredSize(new Dimension(350, 450));
        pic.add(eyes(), BorderLayout.NORTH);
        pic.add(nose(), BorderLayout.CENTER);
        pic.add(mouth(), BorderLayout.SOUTH);
        return pic;
    }

    private JButton updateButton() {
        btnUpdate.setText("Update");
        btnUpdate.doClick();
        btnUpdate.setBounds(30, 300, 97, 25);
        btnUpdate.setPreferredSize(new Dimension(100,50));
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eyes().setVisible(true);
                nose().setVisible(true);
                mouth().setVisible(true);

                if (!btnUpdate.isSelected()){
                    if (chckbxNewCheckBox.isSelected())
                        if(eyes().isVisible())
                        thirdEye().setVisible(true);

                    if (chckBoxNose.isSelected())
                        thirdNose().setVisible(true);


                    if (chckbxMouth.isSelected())
                        thirdMouth().setVisible(true);
                          btnUpdate.setSelected(true);
                }
                else if (btnUpdate.isSelected()) {
                    if (chckbxNewCheckBox.isSelected())
                        if (thirdEye().isVisible())
                        secondEye().setVisible(true);

                    if (chckBoxNose.isSelected())
                        secondNose().setVisible(true);

                    if (chckbxMouth.isSelected())
                        secondMouth().setVisible(true);
                        btnUpdate.setSelected(false);
                }
            }
        });
        return btnUpdate;
    }

    private JLabel eyes() {
        eyes.setIcon(browneyes);
        eyes.setHorizontalAlignment(SwingConstants.CENTER);
        return eyes;
    }

    private JLabel secondEye() {
        eyes.setIcon(prettyEyes);
        eyes.setHorizontalAlignment(SwingConstants.CENTER);
        return eyes;
    }

    private JLabel thirdEye() {
        eyes.setIcon(coolEyes);
        eyes.setHorizontalAlignment(SwingConstants.CENTER);
        return eyes;
    }

    private JLabel nose() {
        nose.setIcon(whiteNose);
        nose.setHorizontalAlignment(SwingConstants.CENTER);
        return nose;
    }

    private JLabel secondNose() {
        nose.setIcon(crookedNose);
        nose.setHorizontalAlignment(SwingConstants.CENTER);
        return nose;
    }

    private JLabel thirdNose() {
        nose.setIcon(uglyNose);
        nose.setHorizontalAlignment(SwingConstants.CENTER);
        return nose;
    }

    private JLabel mouth() {
        mouth.setIcon(plainMouth);
        mouth.setHorizontalAlignment(SwingConstants.CENTER);
        return mouth;
    }

    private JLabel secondMouth() {
        mouth.setIcon(provocativeMouth);
        mouth.setHorizontalAlignment(SwingConstants.CENTER);
        return mouth;
    }

    private JLabel thirdMouth() {
        mouth.setIcon(lipMouth);
        mouth.setHorizontalAlignment(SwingConstants.CENTER);
        return mouth;
    }
}

