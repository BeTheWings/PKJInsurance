package view_insuranceRegistration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import control.cCarInsuranceRegistration;
import global.constant.eAccidentHistory;
import global.constant.eGender;
import global.constant.eJob;
import global.constant.eLongTerm;
import global.constant.ecarType;

public class carInsuranceRegistrationView extends JFrame {
   private static final long serialVersionUID = 1L;

   private JLabel inputLabel;
   private JTextField[] inputText;
   private actionHandler actionHandler;
   private Vector<JRadioButton> buttons;
   private boolean painted = true;
   private boolean stopper = true;
   private ButtonGroup group1, group2, group3, group4, group5;
   private String carType, gender, job, longterm, accidentHistory, selectAccidentHistory, date, name;
   private int totalPrice;
   private ArrayList<String> list;
   private String nothing;

   private cCarInsuranceRegistration cCarInsuranceRegistration;

   public carInsuranceRegistrationView() {
      this.actionHandler = new actionHandler();
      this.inputText = new JTextField[9];
      group1 = new ButtonGroup();
      group2 = new ButtonGroup();
      group3 = new ButtonGroup();
      group4 = new ButtonGroup();
      group5 = new ButtonGroup();
      this.cCarInsuranceRegistration = new cCarInsuranceRegistration();
      this.buttons = new Vector<JRadioButton>();

      this.carType = null;
      this.gender = null;
      this.job = null;
      this.longterm = null;
      this.accidentHistory = null;
      this.selectAccidentHistory = null;
      this.nothing = null;
   }

   public void association() {}

   public void getInformation(String name, String date, int totalPrice) {
      this.name = name;
      this.date = date;
      this.totalPrice = totalPrice;
   }

   public void run() {
      if (painted == true) {
         this.setTitle("1. 화재보험");
         this.setSize(1000, 700);
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

         BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
         this.setLayout(layout);
         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(new GridLayout(14, 2));
         mainPanel.setBackground(Color.white);

         JPanel panel0 = new JPanel();
         inputLabel = new JLabel("<자동차보험 가입>");
         inputLabel.setFont(new Font("serif", Font.BOLD, 20));
         panel0.setBackground(Color.white);
         panel0.setLayout(new BoxLayout(panel0, BoxLayout.X_AXIS));
         panel0.add(inputLabel);

         JPanel topPanel = new JPanel();
         topPanel.add(panel0);
         topPanel.setBackground(Color.white);
         this.add(topPanel);

         JPanel panel1 = new JPanel();
         inputLabel = new JLabel("                                                  1. 이름을 입력해주세요");
         panel1.add(inputLabel);
         panel1.setBackground(Color.white);
         panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
         mainPanel.add(panel1);

         JPanel panel1_1 = new JPanel();
         inputText[0] = new JTextField(30);
         inputText[0].setToolTipText("ex)홍길동");
         panel1_1.add(inputText[0]);
         panel1_1.setBackground(Color.white);
         mainPanel.add(panel1_1);

         JPanel panel2 = new JPanel();
         inputLabel = new JLabel("                                                  2. 주민등록번호를 입력해주세요");
         panel2.add(inputLabel);
         panel2.setBackground(Color.white);
         panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
         mainPanel.add(panel2);

         JPanel panel2_1 = new JPanel();
         inputText[1] = new JTextField(30);
         inputText[1].setToolTipText("ex)990101-2991990");
         panel2_1.add(inputText[1]);
         panel2_1.setBackground(Color.white);
         mainPanel.add(panel2_1);

         JPanel panel3 = new JPanel();
         inputLabel = new JLabel("                                                  3. 나이를 입력해주세요");
         panel3.add(inputLabel);
         panel3.setBackground(Color.white);
         panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
         mainPanel.add(panel3);

         JPanel panel3_1 = new JPanel();
         inputText[2] = new JTextField(30);
         inputText[2].setToolTipText("ex)22");
         panel3_1.add(inputText[2]);
         panel3_1.setBackground(Color.white);
         mainPanel.add(panel3_1);

         JPanel panel4 = new JPanel();
         inputLabel = new JLabel("                                                  4. 성별을 선택해주세요");
         panel4.add(inputLabel);
         panel4.setBackground(Color.white);
         panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
         mainPanel.add(panel4);

         JPanel panel4_1 = new JPanel();
         for (eGender eGender : eGender.values()) {
            JRadioButton button = new JRadioButton(eGender.getText());
            button.setActionCommand(eGender.getText());
            button.addActionListener(actionHandler);
            this.buttons.add(button);
            this.add(button);
            group1.add(button);
            panel4_1.add(button);
            button.setBackground(Color.white);
         }
         panel4_1.setBackground(Color.white);
         mainPanel.add(panel4_1);

         JPanel panel5 = new JPanel();
         inputLabel = new JLabel("                                                  5. 전화번호를 입력해주세요");
         panel5.add(inputLabel);
         panel5.setBackground(Color.white);
         panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
         mainPanel.add(panel5);

         JPanel panel5_1 = new JPanel();
         inputText[3] = new JTextField(30);
         inputText[3].setToolTipText("ex)010-1111-2222");
         panel5_1.add(inputText[3]);
         panel5_1.setBackground(Color.white);
         mainPanel.add(panel5_1);

         JPanel panel6 = new JPanel();
         inputLabel = new JLabel("                                                  6. 주소를 입력해주세요");
         panel6.add(inputLabel);
         panel6.setBackground(Color.white);
         panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
         mainPanel.add(panel6);

         JPanel panel6_1 = new JPanel();
         inputText[4] = new JTextField(30);
         inputText[4].setToolTipText("ex)서울특별시 서대문구 남가좌동 거북골로34 명지대학교 인문생활관 8405호");
         panel6_1.add(inputText[4]);
         panel6_1.setBackground(Color.white);
         mainPanel.add(panel6_1);

         JPanel panel7 = new JPanel();
         inputLabel = new JLabel("                                                  7. 계좌번호를 입력해주세요");
         panel7.add(inputLabel);
         panel7.setBackground(Color.white);
         panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));
         mainPanel.add(panel7);

         JPanel panel7_1 = new JPanel();
         inputText[5] = new JTextField(30);
         inputText[5].setToolTipText("ex)국민 67300201222444");
         panel7_1.add(inputText[5]);
         panel7_1.setBackground(Color.white);
         mainPanel.add(panel7_1);

         JPanel panel7_2 = new JPanel();
         inputLabel = new JLabel("                                                  8. 이메일을 입력해주세요");
         panel7_2.add(inputLabel);
         panel7_2.setBackground(Color.white);
         panel7_2.setLayout(new BoxLayout(panel7_2, BoxLayout.X_AXIS));
         mainPanel.add(panel7_2);

         JPanel panel7_3 = new JPanel();
         inputText[6] = new JTextField(30);
         inputText[6].setToolTipText("ex)email@naver.com");
         panel7_3.add(inputText[6]);
         panel7_3.setBackground(Color.white);
         mainPanel.add(panel7_3);

         JPanel panel8 = new JPanel();
         inputLabel = new JLabel("                                                  9. 직업을 선택해주세요");
         panel8.add(inputLabel);
         panel8.setBackground(Color.white);
         panel8.setLayout(new BoxLayout(panel8, BoxLayout.X_AXIS));
         mainPanel.add(panel8);

         JPanel panel8_1 = new JPanel();
         for (eJob eJob : eJob.values()) {
            JRadioButton button = new JRadioButton(eJob.getText());
            button.setActionCommand(eJob.getText());
            button.addActionListener(actionHandler);
            this.buttons.add(button);
            this.add(button);
            group2.add(button);
            panel8_1.add(button);
            button.setBackground(Color.white);
         }
         panel8_1.setBackground(Color.white);
         mainPanel.add(panel8_1);

         JPanel panel13 = new JPanel();
         inputLabel = new JLabel("                                                  10. 소유차량을 선택해주세요");
         panel13.add(inputLabel);
         panel13.setBackground(Color.white);
         panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
         mainPanel.add(panel13);

         JPanel panel13_1 = new JPanel();
         for (ecarType eProperty : ecarType.values()) {
            JRadioButton button = new JRadioButton(eProperty.getText());
            button.setActionCommand(eProperty.getText());
            button.addActionListener(actionHandler);
            this.buttons.add(button);
            this.add(button);
            group3.add(button);
            panel13_1.add(button);
            button.setBackground(Color.white);
         }
         inputLabel = new JLabel("차량번호 : ");
         inputText[7] = new JTextField(10);
         inputText[7].setToolTipText("ex)경기 12아2149");
         panel13_1.add(inputLabel);
         panel13_1.add(inputText[7]);
         panel13_1.setBackground(Color.white);
         mainPanel.add(panel13_1);

         JPanel panel9 = new JPanel();
         inputLabel = new JLabel("                                                  11. 장기보험 여부를 선택해주세요");
         panel9.add(inputLabel);
         panel9.setBackground(Color.white);
         panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
         mainPanel.add(panel9);

         JPanel panel9_1 = new JPanel();
         for (eLongTerm eLongTerm : eLongTerm.values()) {
            JRadioButton button = new JRadioButton(eLongTerm.getText());
            button.setActionCommand(eLongTerm.getText());
            button.addActionListener(actionHandler);
            this.buttons.add(button);
            this.add(button);
            group4.add(button);
            panel9_1.add(button);
            button.setBackground(Color.white);
         }
         panel9_1.setBackground(Color.white);
         mainPanel.add(panel9_1);

         JPanel panel10 = new JPanel();
         inputLabel = new JLabel("                                                  12. 참고사항을 선택해주세요");
         panel10.add(inputLabel);
         panel10.setBackground(Color.white);
         panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));
         mainPanel.add(panel10);

         JPanel panel10_01 = new JPanel();
         for (eAccidentHistory eAccidentHistory : eAccidentHistory.values()) {
            JRadioButton button = new JRadioButton(eAccidentHistory.getText());
            button.setActionCommand(eAccidentHistory.getText());
            button.addActionListener(actionHandler);
            this.buttons.add(button);
            this.add(button);
            group5.add(button);
            panel10_01.add(button);
            button.setBackground(Color.white);
         }
         panel10_01.setBackground(Color.white);
         mainPanel.add(panel10_01);

         JPanel panel10_0 = new JPanel();
         inputLabel = new JLabel("                                                  13. 사고이력을 입력해주세요");
         panel10_0.setBackground(Color.white);
         panel10_0.add(inputLabel);
         panel10_0.setLayout(new BoxLayout(panel10_0, BoxLayout.X_AXIS));
         mainPanel.add(panel10_0);

         JPanel panel10_1 = new JPanel();
         inputText[8] = new JTextField(30);
         panel10_1.add(inputText[8]);
         inputText[8].setToolTipText("ex)서울특별시 서대문구 남가좌동 명지대학교 앞 사거리에서 보행자와 추돌사고");
         inputText[8].setEditable(false);
         panel10_1.setBackground(Color.white);
         mainPanel.add(panel10_1);

         JPanel panel11 = new JPanel();
         JButton bu11 = new JButton("완료");
         bu11.addActionListener(actionHandler);
         bu11.setActionCommand("완료");
         panel11.setBackground(Color.white);
         mainPanel.add(panel11);
         panel11.add(bu11);

         JPanel panel12 = new JPanel();
         JButton bu12 = new JButton("취소");
         bu12.addActionListener(actionHandler);
         bu12.setActionCommand("취소");
         panel12.setBackground(Color.white);
         mainPanel.add(panel12);
         panel12.add(bu12);

         this.add(mainPanel);
         painted = false;
      }
      this.setVisible(true);
   }

   public void putText() {
	   this.list = new ArrayList<String>();
	   
	   this.list.add(this.inputText[0].getText());
	   this.list.add(this.inputText[1].getText());
	   this.list.add(this.inputText[2].getText());
	   this.list.add(this.inputText[3].getText());
	   this.list.add(this.inputText[4].getText());
	   this.list.add(this.inputText[5].getText());
	   this.list.add(this.inputText[6].getText());
	   if(inputText[7].isEditable() != false) {
		   this.list.add(this.inputText[7].getText());
	   } else {
		   this.list.add(nothing);
	   }
	   this.list.add(this.inputText[8].getText());
	   
	   list.add(group1.getSelection().getActionCommand());
	   list.add(group2.getSelection().getActionCommand());
	   list.add(group3.getSelection().getActionCommand());
	   list.add(group4.getSelection().getActionCommand());//
	   list.add(group5.getSelection().getActionCommand());
	   list.add(Integer.toString(this.totalPrice));
	   list.add(this.date);

       this.cCarInsuranceRegistration.setData(list);
   }

   public boolean isBlank() {

      String name = this.inputText[0].getText();
      String residnetRegistrationNumber = this.inputText[1].getText();
      String age = this.inputText[2].getText();
      String phoneNumber = this.inputText[3].getText();
      String address = this.inputText[4].getText();
      String accountNumber = this.inputText[5].getText();
      String eMail = this.inputText[6].getText();
      String carNumber = this.inputText[7].getText();

      if (inputText[8].isEditable() != false) {
         accidentHistory = inputText[8].getText();
      } else {
         accidentHistory = "사고 이력 없음";
      }

      if (name.equals("")) {
         JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
      } else if (residnetRegistrationNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "주민등록번호를 입력해주세요!");
      } else if (age.equals("")) {
         JOptionPane.showMessageDialog(null, "나이를 입력해주세요!");
      } else if (gender == null) {
         JOptionPane.showMessageDialog(null, "성별을 선택해주세요!");
      } else if (phoneNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요!");
      } else if (address.equals("")) {
         JOptionPane.showMessageDialog(null, "주소를 입력해주세요!");
      } else if (accountNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "계좌번호를 입력해주세요!");
      } else if (eMail.equals("")) {
         JOptionPane.showMessageDialog(null, "이메일을 입력해주세요!");
      } else if (job == null) {
         JOptionPane.showMessageDialog(null, "직업을 선택해주세요!");
      } else if (carType == null) {
         JOptionPane.showMessageDialog(null, "소유차량을 선택해주세요!");
      } else if (carNumber.equals("")) {
         JOptionPane.showMessageDialog(null, "차량번호를 입력해주세요!");
      } else if (longterm == null) {
         JOptionPane.showMessageDialog(null, "장기보험여부를 선택해주세요!");
      } else if (selectAccidentHistory == null && inputText[8].isEditable() != true) {
         JOptionPane.showMessageDialog(null, "참고사항을 선택해주세요!");
      } else if (accidentHistory.equals("") && inputText[8].isEditable() != false) {
         JOptionPane.showMessageDialog(null, "사고이력을 입력해주세요!");
      } else {
         return true;
      }
      return false;
   }

   class actionHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getActionCommand() == "완료") {
            // 완료
            stopper = isBlank();
            if (stopper == true) {
               if (!inputText[0].getText().equals(name)) {
                  JOptionPane.showMessageDialog(null, "입력된 이름이 일치하지 않습니다.");
               } else {
                  putText();
                  dispose();

               }
            }
         } else if (e.getActionCommand() == "취소") {
            int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
               dispose();
            } else if (result == JOptionPane.NO_OPTION) {

            } else if (result == JOptionPane.CLOSED_OPTION) {
               // 그냥 창 닫은 경우
            }
         } else if (e.getActionCommand().equals("남성")) {
            gender = "남성";
         } else if (e.getActionCommand().equals("여성")) {
            gender = "여성";
         } else if (e.getActionCommand().equals("운전수") || e.getActionCommand().equals("군인")
               || e.getActionCommand().equals("현장직") || e.getActionCommand().equals("기장")
               || e.getActionCommand().equals("승무원") || e.getActionCommand().equals("선장")
               || e.getActionCommand().equals("선원") || e.getActionCommand().equals("기타")) {
            job = e.getActionCommand();
         } else if (e.getActionCommand().equals("경차") || e.getActionCommand().equals("중형차")
               || e.getActionCommand().equals("대형차")) {
            carType = e.getActionCommand();
         } else if (e.getActionCommand().equals("장기보험") || e.getActionCommand().equals("단기보험")) {
            longterm = e.getActionCommand();
         } else if (e.getActionCommand().equals("사고 이력 있음")) {
            inputText[8].setEditable(true);
         } else if (e.getActionCommand().equals("사고 이력 없음")) {
            if (inputText[8].isEditable() == true) {
               inputText[8].setEditable(false);
            }
            selectAccidentHistory = "사고 이력 없음";
         }
      }
   }

}