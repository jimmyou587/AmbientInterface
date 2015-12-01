import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Panel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ambient_Interface extends JFrame implements ActionListener {

	JFrame frame;
	JButton btnAdd;
	Panel panel;
	JLabel lblRest;
	JButton btnEdit;
	Panel panel_1;
	JLabel lblRest_1;
	JRadioButton rdbtnNewRadioButton;
	Panel panel_2;
	JLabel lblEditRest;
	JButton btnCancel;
	JButton btnSave;
	JLabel lblRest_2;
	JLabel lblFrom;
	JLabel lblTo;
	JLabel lblFrequency;
	JLabel lblViberation;
	private JToggleButton tglbtnOff;
	private JTextField to_hrs_text;
	private JTextField from_hrs_text;
	private JTextField from_min_text;
	private JTextField to_min_text;
	private JToggleButton toggleButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ambient_Interface window = new Ambient_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ambient_Interface() {
		initialize();
		//RestExecuter.proceed = true;

	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		panel = new Panel();
		panel.setBounds(10, 10, 630, 47);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);

		lblRest = new JLabel("REST");
		lblRest.setBounds(309, 22, 31, 14);
		panel.add(lblRest);

		btnEdit = new JButton("EDIT");
		btnEdit.setBounds(10, 18, 62, 23);
		panel.add(btnEdit);

		btnAdd = new JButton("ADD");
		btnAdd.setBounds(558, 18, 62, 23);
		btnAdd.addActionListener(this);
		panel.add(btnAdd);

		panel_1 = new Panel();
		panel_1.setBounds(10, 63, 630, 389);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.lightGray);

		lblRest_1 = new JLabel("REST 1");
		lblRest_1.setBounds(26, 23, 46, 14);
		panel_1.add(lblRest_1);

		rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(584, 7, 26, 31);
		panel_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(Color.lightGray);
//		rdbtnNewRadioButton.setSelected(true);

		panel_2 = new Panel();
		panel_2.setBounds(10, 63, 630, 389);
		// panel_1.add(panel_2);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);

		lblEditRest = new JLabel("ADD REST");
		lblEditRest.setBounds(270, 0, 63, 14);
		panel_2.add(lblEditRest);

		btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(10, 0, 89, 23);
		panel_2.add(btnCancel);
		btnCancel.addActionListener(this);

		btnSave = new JButton("SAVE");
		btnSave.setBounds(530, 0, 89, 23);
		panel_2.add(btnSave);
		btnSave.addActionListener(this);

		lblRest_2 = new JLabel("REST 2");
		lblRest_2.setBounds(20, 45, 46, 14);
		panel_2.add(lblRest_2);

		lblFrom = new JLabel("FROM");
		lblFrom.setBounds(20, 98, 46, 14);
		panel_2.add(lblFrom);

		lblFrequency = new JLabel("FREQUENCY");
		lblFrequency.setBounds(20, 250, 79, 14);
		panel_2.add(lblFrequency);

		lblViberation = new JLabel("VIBERATION");
		lblViberation.setBounds(20, 307, 79, 14);
		panel_2.add(lblViberation);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 250, 190, 20);
		panel_2.add(comboBox);
		comboBox.addItem("Every 15 sec");
		comboBox.addItem("Every 30 sec");
		comboBox.addItem("Every 45 sec");
		comboBox.addItem("Every 60 sec");
		

		to_hrs_text = new JTextField();
		to_hrs_text.setBounds(166, 188, 86, 20);
		panel_2.add(to_hrs_text);
		to_hrs_text.setColumns(10);

		JButton btnNewButton = new JButton("UP");
		btnNewButton.setBounds(166, 73, 89, 23);
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("DOWN");
		btnNewButton_1.setBounds(163, 119, 89, 23);
		panel_2.add(btnNewButton_1);

		JButton btnUp_1 = new JButton("UP");
		btnUp_1.setBounds(166, 164, 89, 23);
		panel_2.add(btnUp_1);

		from_hrs_text = new JTextField();
		from_hrs_text.setColumns(10);
		from_hrs_text.setBounds(166, 99, 86, 20);
		panel_2.add(from_hrs_text);

		JButton btnDown_1 = new JButton("DOWN");
		btnDown_1.setBounds(166, 214, 89, 23);
		panel_2.add(btnDown_1);

		JLabel label = new JLabel(":");
		label.setBounds(262, 102, 17, 14);
		panel_2.add(label);

		from_min_text = new JTextField();
		from_min_text.setColumns(10);
		from_min_text.setBounds(272, 99, 86, 20);
		panel_2.add(from_min_text);

		JButton btnUp = new JButton("UP");
		btnUp.setBounds(269, 73, 89, 23);
		panel_2.add(btnUp);

		JButton btnDown = new JButton("DOWN");
		btnDown.setBounds(272, 119, 89, 23);
		panel_2.add(btnDown);

		JLabel label_1 = new JLabel(":");
		label_1.setBounds(262, 191, 17, 14);
		panel_2.add(label_1);

		JButton btnUp_2 = new JButton("UP");
		btnUp_2.setBounds(269, 164, 89, 23);
		panel_2.add(btnUp_2);

		to_min_text = new JTextField();
		to_min_text.setColumns(10);
		to_min_text.setBounds(272, 188, 86, 20);
		panel_2.add(to_min_text);

		JButton btnDown_2 = new JButton("DOWN");
		btnDown_2.setBounds(269, 214, 89, 23);
		panel_2.add(btnDown_2);

		JLabel lblSound = new JLabel("SOUND");
		lblSound.setBounds(20, 348, 46, 14);
		panel_2.add(lblSound);

		tglbtnOff = new JToggleButton("OFF");
		tglbtnOff.setBounds(166, 348, 73, 27);
		panel_2.add(tglbtnOff);

		toggleButton = new JToggleButton("OFF");
		toggleButton.setBounds(166, 307, 73, 27);
		panel_2.add(toggleButton);

		lblTo = new JLabel("TO");
		lblTo.setBounds(20, 191, 46, 14);
		panel_2.add(lblTo);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAdd) {
			panel.setVisible(false);
			panel_1.setVisible(false);
			panel_2.setVisible(true);
		}

		if (e.getSource() == btnSave) {
			panel.setVisible(true);
			panel_1.setVisible(true);
			panel_2.setVisible(false);

			String from_hour_time;
			from_hour_time = from_hrs_text.getText();
//			System.out.println("hour time:" + from_hour_time);

			String from_min_time;
			from_min_time = from_min_text.getText();
//			System.out.println("min time:" + from_min_time);
			String to_hour_time;
			to_hour_time = to_hrs_text.getText();
//			System.out.println("min time:" + to_hour_time);

			String to_min_time;
			to_min_time = to_min_text.getText();
//			System.out.println("min time:" + to_min_time);

			String from_time = from_hour_time.concat(from_min_time);
//			System.out.println("total from time:" + from_time);

			String to_time = to_hour_time.concat(to_min_time);
//			System.out.println("total to time:" + to_time);

			new SimpleDateFormat("HHmm");

			Calendar cal_from_time = Calendar.getInstance();
			cal_from_time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(from_hour_time));
			cal_from_time.set(Calendar.MINUTE, Integer.parseInt(from_min_time));
			cal_from_time.set(Calendar.SECOND, 0);
			// cal.set(Calendar.MILLISECOND,0);

//			System.out.println("total from time:" + cal_from_time.getTime());

			Calendar cal_to_time = Calendar.getInstance();
			cal_to_time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(to_hour_time));
			cal_to_time.set(Calendar.MINUTE, Integer.parseInt(to_min_time));
			cal_to_time.set(Calendar.SECOND, 0);
			// cal.set(Calendar.MILLISECOND,0);

			// System.out.println("total from time:" + cal_to_time.getTime() );

			WorkDuration wd = new WorkDuration("Rest1", cal_from_time, cal_to_time,
					// Integer.parseInt(lblFrequency.getText()),
					12, true, false, true);
			rdbtnNewRadioButton.setSelected(true);
			
			new BrightnessObserver(wd.getSub());
			new SoundObserver(wd.getSub());
			new MessageObserver(wd.getSub());
			
			Calendar curr = Calendar.getInstance();
			System.out.println(curr.getTime());
			while(curr.before(wd.getTo())) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				curr = Calendar.getInstance();
				wd.setDistance(curr);
			}
			System.exit(0);
		}

		if (e.getSource() == btnCancel) {
			panel.setVisible(true);
			panel_1.setVisible(true);
			panel_2.setVisible(false);
		}

	}
}
