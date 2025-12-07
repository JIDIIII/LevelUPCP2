import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Test extends JFrame{
    private JPanel LevelUP;
    private JPanel Start;
    private JPanel CreateAcc;
    private JPanel SignIn;
    private JPanel ForgotPass;
    private JPanel HomePage;
    private JPanel StreakPage;
    private JPanel ChallPage;
    private JPanel LogPage;
    private JPanel AccPage;
    private JButton SignInPageBT;
    private JButton CreateAccPageBT;
    private JTextField CreateUserTextField;
    private JTextField CreatePassTextField;
    private JButton CreateAccountBT;
    private JTextField CheckUsernameField;
    private JButton SignInBT;
    private JTextField CheckPassField;
    private JTextField EnterUsernameTextField;
    private JTextField EnterNewPasswordTextField;
    private JButton ChangePasswordButton;
    private JLabel STKBTNHomePage;
    private JLabel CHALBTNHomePage;
    private JLabel LOGBTNHomePage;
    private JLabel ACCBTNHomePage;
    private JLabel HMBTNStreakPage;
    private JLabel CHALBTNStreakPage;
    private JLabel LOGBTNStreakPage;
    private JLabel ACCBTNStreakPage;
    private JLabel HMBTNChallPage;
    private JLabel STKBTNChallPage;
    private JLabel LOGBTNChallPage;
    private JLabel ACCBTNChallPage;
    private JLabel HMBTNLogPage;
    private JLabel STKBTNLogPage;
    private JLabel CHALBTNLogPage;
    private JLabel ACCBTNLogPage;
    private JLabel HMBTNAccPage;
    private JLabel STKBTNAccPage;
    private JLabel CHALBTNAccPage;
    private JLabel LOGBTNAccPage;
    private JLabel SignInForgotPassword;
    private JLabel FIRESTREAK;
    private JLabel USERNAME;
    private JLabel ACCOUNTID;
    private JProgressBar HMPageProgressBar;
    private JLabel HMPageStreakCount;
    private JLabel HMPageEXPCount;
    private JLabel StreakCount;
    private JLabel SDay;
    private JLabel MDay;
    private JLabel TDay;
    private JLabel WDay;
    private JLabel ThDay;
    private JLabel FDay;
    private JLabel StDay;
    private JProgressBar ChallPageProgressBar;
    private JPanel TimerJPanel;
    private JButton CompleteChallengeButton;
    private JLabel RewardLabel;
    private JLabel RewardCount;
    private JButton LogWorkoutButton;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JCheckBox checkBox12;
    private JCheckBox checkBox13;
    private JCheckBox checkBox14;
    private JCheckBox checkBox15;
    private JCheckBox checkBox16;
    private JComboBox ProteinComboBox;
    private JComboBox CarbohydratesComboBox;
    private JButton LogMealButton;
    private JLabel HomePageDisplayName;
    private JLabel HomePageDisplayDate;
    private JButton SignOutButton;
    private JLabel CPassAccPage;
    private JLabel AppFBAccPage;
    private JLabel CheckLogAccPage;
    private JPanel Days;
    private JCheckBox Chall1;
    private JCheckBox Chall2;
    private JCheckBox Chall3;
    private JCheckBox Chall4;
    private JLabel ChallCount1;
    private JLabel ChallCount2;
    private JLabel ChallCount3;
    private JLabel ChallCount4;
    private JPanel Challenge;


    Test(){
        setContentPane(LevelUP);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        List<JLabel> STKBTNs = Arrays.asList(
                STKBTNHomePage, STKBTNChallPage, STKBTNLogPage, STKBTNAccPage
        );

        List<JLabel> CHALBTNs = Arrays.asList(
                CHALBTNHomePage, CHALBTNStreakPage, CHALBTNLogPage, CHALBTNAccPage
        );

        List<JLabel> LOGBTNs = Arrays.asList(
                LOGBTNHomePage, LOGBTNStreakPage, LOGBTNChallPage, LOGBTNAccPage
        );

        List<JLabel> HMBTNs = Arrays.asList(
                HMBTNStreakPage, HMBTNChallPage, HMBTNLogPage, HMBTNAccPage
        );

        List<JLabel> ACCBTNs = Arrays.asList(
                ACCBTNHomePage, ACCBTNStreakPage, ACCBTNChallPage, ACCBTNLogPage
        );

        List<JLabel> allButtons = new ArrayList<>();
        allButtons.addAll(STKBTNs);
        allButtons.addAll(CHALBTNs);
        allButtons.addAll(LOGBTNs);
        allButtons.addAll(HMBTNs);
        allButtons.addAll(ACCBTNs);

        MouseAdapter goToHomePage = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "HomePage");
            }
        };

        MouseAdapter goToStreakPage = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "StreakPage");
            }
        };

        MouseAdapter goToChallengePage = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "ChallPage");
            }
        };

        MouseAdapter goToLogPage = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "LogPage");
            }
        };

        MouseAdapter goToAccountPage = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "AccPage");
            }
        };

        for (JLabel lbl : HMBTNs) {
            lbl.addMouseListener(goToHomePage);
        }

        for (JLabel lbl : STKBTNs) {
            lbl.addMouseListener(goToStreakPage);
        }

        for (JLabel lbl : CHALBTNs) {
            lbl.addMouseListener(goToChallengePage);
        }

        for (JLabel lbl : LOGBTNs) {
            lbl.addMouseListener(goToLogPage);
        }

        for (JLabel lbl : ACCBTNs) {
            lbl.addMouseListener(goToAccountPage);
        }

        for (JLabel lbl : allButtons) {
            lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        SignInPageBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "SignIn");
            }
        });

        CreateAccPageBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "CreateAcc");
            }
        });

        SignInForgotPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "ForgotPass");
                SignInForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        SignOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "SignIn");
            }
        });
        CPassAccPage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) LevelUP.getLayout();
                cl.show(LevelUP, "ForgotPass");
                SignInForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
    }

    static void main() {
        SwingUtilities.invokeLater(() -> {
            try {
                // Option A: Nimbus (modern cross-platform)
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
                // Option B: Force Metal
                // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

                // Option C: System L&F
                // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Decorate frames with the chosen L&F (call before creating frames)
                JFrame.setDefaultLookAndFeelDecorated(true);

            } catch (Exception e) {
                // If setting L&F fails, continue with default
                System.err.println("Failed to set Look and Feel: " + e.getMessage());
            }

            // Create and show UI on EDT
            Test frame = new Test();
            frame.setVisible(true);
        });
    }
}
