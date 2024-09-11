package micropolisj.util;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ResourceBundle;

public class Mechanics extends JFrame {

    static ResourceBundle strings = ResourceBundle.getBundle("micropolisj.GuiStrings");

    private JPanel contentPanel;
    private JLabel activeTestLabel;

    public Mechanics() {
        setTitle("Mechanics");
        setSize(1000, 400);
        setLocationRelativeTo(null);

        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel(strings.getString("menu.mechanics.title.money"));
        label1.setFont(new Font("Arial", Font.PLAIN, 18));
        label1.setAlignmentX(Component.LEFT_ALIGNMENT);
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.money"), 1);
            }
        });
        contentPanel.add(label1);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label2 = new JLabel(strings.getString("menu.mechanics.title.population"));
        label2.setFont(new Font("Arial", Font.PLAIN, 18));
        label2.setAlignmentX(Component.LEFT_ALIGNMENT);
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.population"), 2);
            }
        });
        contentPanel.add(label2);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label3 = new JLabel(strings.getString("menu.mechanics.title.bulldozer"));
        label3.setFont(new Font("Arial", Font.PLAIN, 18));
        label3.setAlignmentX(Component.LEFT_ALIGNMENT);
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.bulldozer"), 3);
            }
        });
        contentPanel.add(label3);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label4 = new JLabel(strings.getString("menu.mechanics.title.wire"));
        label4.setFont(new Font("Arial", Font.PLAIN, 18));
        label4.setAlignmentX(Component.LEFT_ALIGNMENT);
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.wire"), 4);
            }
        });
        contentPanel.add(label4);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label5 = new JLabel(strings.getString("menu.mechanics.title.park"));
        label5.setFont(new Font("Arial", Font.PLAIN, 18));
        label5.setAlignmentX(Component.LEFT_ALIGNMENT);
        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.park"), 5);
            }
        });
        contentPanel.add(label5);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label6 = new JLabel(strings.getString("menu.mechanics.title.bigpark"));
        label6.setFont(new Font("Arial", Font.PLAIN, 18));
        label6.setAlignmentX(Component.LEFT_ALIGNMENT);
        label6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.bigpark"), 6);
            }
        });
        contentPanel.add(label6);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label7 = new JLabel(strings.getString("menu.mechanics.title.roads"));
        label7.setFont(new Font("Arial", Font.PLAIN, 18));
        label7.setAlignmentX(Component.LEFT_ALIGNMENT);
        label7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.roads"), 7);
            }
        });
        contentPanel.add(label7);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label8 = new JLabel(strings.getString("menu.mechanics.title.residential"));
        label8.setFont(new Font("Arial", Font.PLAIN, 18));
        label8.setAlignmentX(Component.LEFT_ALIGNMENT);
        label8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.residential"), 8);
            }
        });
        contentPanel.add(label8);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label9 = new JLabel(strings.getString("menu.mechanics.title.commercial"));
        label9.setFont(new Font("Arial", Font.PLAIN, 18));
        label9.setAlignmentX(Component.LEFT_ALIGNMENT);
        label9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.commercial"), 9);
            }
        });
        contentPanel.add(label9);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label10 = new JLabel(strings.getString("menu.mechanics.title.industrial"));
        label10.setFont(new Font("Arial", Font.PLAIN, 18));
        label10.setAlignmentX(Component.LEFT_ALIGNMENT);
        label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.industrial"), 10);
            }
        });
        contentPanel.add(label10);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label11 = new JLabel(strings.getString("menu.mechanics.title.cityhall"));
        label11.setFont(new Font("Arial", Font.PLAIN, 18));
        label11.setAlignmentX(Component.LEFT_ALIGNMENT);
        label11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.cityhall"), 11);
            }
        });
        contentPanel.add(label11);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label12 = new JLabel(strings.getString("menu.mechanics.title.fire"));
        label12.setFont(new Font("Arial", Font.PLAIN, 18));
        label12.setAlignmentX(Component.LEFT_ALIGNMENT);
        label12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.fire"), 12);
            }
        });
        contentPanel.add(label12);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label13 = new JLabel(strings.getString("menu.mechanics.title.police"));
        label13.setFont(new Font("Arial", Font.PLAIN, 18));
        label13.setAlignmentX(Component.LEFT_ALIGNMENT);
        label13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.police"), 13);
            }
        });
        contentPanel.add(label13);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label14 = new JLabel(strings.getString("menu.mechanics.title.powerplant"));
        label14.setFont(new Font("Arial", Font.PLAIN, 18));
        label14.setAlignmentX(Component.LEFT_ALIGNMENT);
        label14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.powerplant"), 14);
            }
        });
        contentPanel.add(label14);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label15 = new JLabel(strings.getString("menu.mechanics.title.nuclear"));
        label15.setFont(new Font("Arial", Font.PLAIN, 18));
        label15.setAlignmentX(Component.LEFT_ALIGNMENT);
        label15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.nuclear"), 15);
            }
        });
        contentPanel.add(label15);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label16 = new JLabel(strings.getString("menu.mechanics.title.solar"));
        label16.setFont(new Font("Arial", Font.PLAIN, 18));
        label16.setAlignmentX(Component.LEFT_ALIGNMENT);
        label16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.solar"), 16);
            }
        });
        contentPanel.add(label16);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label17 = new JLabel(strings.getString("menu.mechanics.title.wind"));
        label17.setFont(new Font("Arial", Font.PLAIN, 18));
        label17.setAlignmentX(Component.LEFT_ALIGNMENT);
        label17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.wind"), 17);
            }
        });
        contentPanel.add(label17);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label18 = new JLabel(strings.getString("menu.mechanics.title.school"));
        label18.setFont(new Font("Arial", Font.PLAIN, 18));
        label18.setAlignmentX(Component.LEFT_ALIGNMENT);
        label18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.school"), 18);
            }
        });
        contentPanel.add(label18);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label19 = new JLabel(strings.getString("menu.mechanics.title.university"));
        label19.setFont(new Font("Arial", Font.PLAIN, 18));
        label19.setAlignmentX(Component.LEFT_ALIGNMENT);
        label19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.university"), 19);
            }
        });
        contentPanel.add(label19);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label20 = new JLabel(strings.getString("menu.mechanics.title.openair"));
        label20.setFont(new Font("Arial", Font.PLAIN, 18));
        label20.setAlignmentX(Component.LEFT_ALIGNMENT);
        label20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.openair"), 20);
            }
        });
        contentPanel.add(label20);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label21 = new JLabel(strings.getString("menu.mechanics.title.stadium"));
        label21.setFont(new Font("Arial", Font.PLAIN, 18));
        label21.setAlignmentX(Component.LEFT_ALIGNMENT);
        label21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.stadium"), 21);
            }
        });
        contentPanel.add(label21);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label22 = new JLabel(strings.getString("menu.mechanics.title.museum"));
        label22.setFont(new Font("Arial", Font.PLAIN, 18));
        label22.setAlignmentX(Component.LEFT_ALIGNMENT);
        label22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.museum"), 22);
            }
        });
        contentPanel.add(label22);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label23 = new JLabel(strings.getString("menu.mechanics.title.seaport"));
        label23.setFont(new Font("Arial", Font.PLAIN, 18));
        label23.setAlignmentX(Component.LEFT_ALIGNMENT);
        label23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.seaport"), 23);
            }
        });
        contentPanel.add(label23);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JLabel label24 = new JLabel(strings.getString("menu.mechanics.title.airport"));
        label24.setFont(new Font("Arial", Font.PLAIN, 18));
        label24.setAlignmentX(Component.LEFT_ALIGNMENT);
        label24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showTestLabel(strings.getString("menu.mechanics.body.airport"), 24);
            }
        });
        contentPanel.add(label24);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scrollPane);
    }

    private void showTestLabel(String str, int index) {
        if (activeTestLabel != null) {
            contentPanel.remove(activeTestLabel);
        }

        activeTestLabel = new JLabel(str);
        activeTestLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        activeTestLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        int labelIndex = (index - 1) * 2 + 1;
        contentPanel.add(activeTestLabel, labelIndex);

        contentPanel.revalidate();
        contentPanel.repaint();
    }
}