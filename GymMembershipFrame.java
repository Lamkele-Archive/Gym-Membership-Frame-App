
package za.ac.tut.ui;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class GymMembershipFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    private JCheckBox personalTrainerChkBx;
    
    private JTextArea commentsTxtArea;
    
    private ButtonGroup btnGrp;
    
    private JScrollPane scrollableTxtArea;
    
    private JButton applyBtn;
    
    public GymMembershipFrame(){
        setTitle("GYM MEMBERSHIP");
        setSize(500,500);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Client Details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Contract Options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.PINK);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name:");
        surnameLbl = new JLabel("Surname:");
        idNoLbl = new JLabel("id No:");
        genderLbl = new JLabel("Gender:");
        contractTypeLbl = new JLabel("Type of contract:");
        personalTrainerLbl = new JLabel("Select checkbox if you need a personal trainer.");
        
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        idNoTxtFld = new JTextField(10);
        
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        monthToMonthRadBtn = new JRadioButton("Month-to-month");
        sixMonthsRadBtn = new JRadioButton("Six months");
        annualRadBtn = new JRadioButton("Annual");
        
        personalTrainerChkBx = new JCheckBox();
        
        btnGrp = new ButtonGroup();
        btnGrp.add(monthToMonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        
        commentsTxtArea = new JTextArea(20,40);
        commentsTxtArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Comments"));
        
        scrollableTxtArea = new JScrollPane(commentsTxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("APPLY");
        
        headingPnl.add(headingLbl);
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl, BorderLayout.NORTH);
        
        contractsPnl.add(contractTypeLbl);
        contractsPnl.add(monthToMonthRadBtn);
        contractsPnl.add(sixMonthsRadBtn);
        contractsPnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChkBx);
        
        membershipPnl.add(contractsPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(membershipPnl,BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl,BorderLayout.CENTER);
        
        btnsPnl.add(applyBtn);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
    }
}
