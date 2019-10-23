package travel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Travelling {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		ConnectionManager cmanager=new ConnectionManager();
		Connection con=cmanager.connection();
		Statement st=con.createStatement();
		JFrame jf=new JFrame("Travelling Ticketing Syestem");
		jf.setSize(1000,730);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setVisible(true);
		
		JLabel h1=new JLabel("Travelling Ticketing Syestem");
		Font fo = new Font("TimesRoman",Font.BOLD,25);
	    h1.setFont(fo);
		h1.setBounds(215,15,450,30);
		jf.add(h1);
		JLabel h2=new JLabel("Ticket Type");
		h2.setBounds(20,80,150,30);
		jf.add(h2);
		
		JRadioButton type1=new JRadioButton("Standard");
		type1.setBounds(20, 110, 100, 20);
		JRadioButton type2=new JRadioButton("Economy");
		type2.setBounds(20, 130, 100, 20);
		JRadioButton type3=new JRadioButton("First class");
		type3.setBounds(20, 150, 100, 20);
		jf.add(type1);jf.add(type2);jf.add(type3);
		ButtonGroup first=new ButtonGroup();
		first.add(type1);first.add(type2);first.add(type3);
		
		
		
		JRadioButton tkt1=new JRadioButton("Single Ticket");
		tkt1.setBounds(130, 110, 100, 20);
		JRadioButton tkt2=new JRadioButton("Return Ticket");
		tkt2.setBounds(130, 130, 120, 20);
		jf.add(tkt1);jf.add(tkt2);
		ButtonGroup second=new ButtonGroup();
		second.add(tkt1);second.add(tkt2);
		
		JRadioButton adult=new JRadioButton("Adult");
		adult.setBounds(250, 110, 80, 20);
		JRadioButton child=new JRadioButton("Child");
		child.setBounds(250, 130, 80, 20);
		jf.add(adult);jf.add(child);
		ButtonGroup third=new ButtonGroup();
		third.add(adult);
		ButtonGroup fourth=new ButtonGroup();
		fourth.add(adult);
		
		String place[]= {"Coimbathore","Chennai","Madhurai","Kochi"};
		JComboBox jp=new JComboBox(place);
		jp.setBounds(170, 170, 150, 20);
		jf.add(jp);
		
		JLabel cl=new JLabel("Class");
		cl.setBounds(400, 80, 100, 20);
		JLabel t=new JLabel("Ticket");
		t.setBounds(500, 80, 100, 20);
		JLabel ad=new JLabel("Adult");
		ad.setBounds(600, 80, 100, 20);
		JLabel ch=new JLabel("Child");
		ch.setBounds(700, 80, 100, 20);
		jf.add(cl);jf.add(t);jf.add(ad);jf.add(ch);
		
		JTextField clt=new JTextField();
		clt.setBounds(400, 100, 100, 20);
		JTextField tt=new JTextField();
		tt.setBounds(500, 100, 100, 20);
		JTextField adt=new JTextField("NIL");
		adt.setBounds(600, 100, 100, 20);
		JTextField cht=new JTextField("NIL");
		cht.setBounds(700, 100, 100, 20);
		jf.add(clt);jf.add(tt);jf.add(adt);jf.add(cht);

		JLabel tax=new JLabel("Tax");
		tax.setBounds(15, 250, 50, 20);
		JLabel subt=new JLabel("Subtotal");
		subt.setBounds(15, 280, 50, 20);
		JLabel tot=new JLabel("Total");
		tot.setBounds(15, 310, 50, 20);
		jf.add(tax);jf.add(subt);jf.add(tot);
		
		JTextField taxt=new JTextField();
		taxt.setBounds(70, 250, 70, 20);
		JTextField subtt=new JTextField();
		subtt.setBounds(70, 280, 70, 20);
		JTextField tott=new JTextField();
		tott.setBounds(70, 310, 70, 20);
		jf.add(taxt);jf.add(subtt);jf.add(tott);
		
		JButton ok=new JButton("OK");
		ok.setBounds(15, 400, 100, 30);
		JButton reset=new JButton("Reset");
		reset.setBounds(120, 400, 100, 30);
		JButton exit=new JButton("Exit");
		exit.setBounds(240, 400, 100, 30);
		jf.add(ok);jf.add(reset);jf.add(exit);
		
		JLabel from=new JLabel("From");
		from.setBounds(400, 200, 50, 20);
		JLabel to=new JLabel("To");
		to.setBounds(400, 240, 50, 20);
		JLabel date=new JLabel("Date");
		date.setBounds(400, 280, 50, 20);
		JLabel time=new JLabel("Time");
		time.setBounds(400, 320, 50, 20);
		jf.add(from);jf.add(to);jf.add(date);jf.add(time);
		
		JTextField ft=new JTextField();
		ft.setBounds(460, 200, 100, 20);
		JTextField totxt=new JTextField();
		totxt.setBounds(460, 240, 100, 20);
		JTextField dt=new JTextField();
		dt.setBounds(460, 280, 100, 20);
		JTextField timet=new JTextField();
		timet.setBounds(460, 320, 100, 20);
		jf.add(ft);jf.add(totxt);jf.add(dt);jf.add(timet);
		
		JLabel no=new JLabel("Ticket Number");
		no.setBounds(650, 210, 170, 20);
		JTextField not=new JTextField();
		not.setBounds(650, 230, 50, 20);
		JLabel pr=new JLabel("Price");
		pr.setBounds(650, 250, 70, 20);
		JTextField prt=new JTextField();
		prt.setBounds(650, 270, 50, 20);
		JLabel ro=new JLabel("Route");
		ro.setBounds(650, 290, 70, 20);
		JTextField rot=new JTextField();
		rot.setBounds(650, 310, 50, 20);
		jf.add(no);jf.add(not);jf.add(pr);jf.add(prt);jf.add(ro);jf.add(rot);
		
		
		//Actions for radio button//
		type1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				clt.setText("STD");
			}
		});
		type2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				clt.setText("ECN");
			}
		});
		type3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				clt.setText("FCLASS");
			}
		});
		
		tkt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tt.setText("ONE WAY");
			}
		});
		tkt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tt.setText("TWO WAY");
			}
		});
		adult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adt.setText("ONE");
			}
		});
		child.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cht.setText("ONE");
			}
		});
		
		//Actions for checkbox
		jp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                Object selected = jp.getSelectedItem();
                String se=(String) selected;
                totxt.setText(se);
            }
		});
		
		/*action for from textfied
		ft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					ResultSet rs=st.executeQuery("select froms,number,amt,route from price");
					while(rs.next())
					{
						if(rs.getString(1).equals(ft.getText()))
						{
							System.out.println("Kochi");
							not.setText(rs.getString(2));
							prt.setText(rs.getString(3));
							rot.setText(rs.getString(4));
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("Error");
				}
				
			}
		});*/
		
		//Actionlistener for OK
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				ResultSet rs=st.executeQuery("select froms,number,amt,route,tax,sub,total from price");
				while(rs.next())
				{
					if(rs.getString(1).equals(ft.getText()))
					{
						not.setText(rs.getString(2));
						prt.setText(rs.getString(3));
						rot.setText(rs.getString(4));
						taxt.setText(rs.getString(5));
						subtt.setText(rs.getString(6));
						tott.setText(rs.getString(7));
					}
				}
				//st.executeUpdate("insert into details(`date`, `time`) values('"+dt.getText()+"','"+timet.getText()+"')");
				st.executeUpdate("insert into schedule (`date`, `time`, `class`, `tkt`, `adult`, `child`) values('"
						+dt.getText()+"','"+timet.getText()+"','"+clt.getText()+"','"+tt.getText()+"','"+adt.getText()+"','"+cht.getText()+"')");

				//statement.executeUpdate("insert into registration(`fname`, `lname`, `username`, `pwd`, `repwd`, `phone`, `mail`) values('"
					//	+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
				
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("Error");
			}
			}
		});
		
		//Action for exit button
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		//action for reset
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clt.setText("");ft.setText("");
				tt.setText("");totxt.setText("");
				adt.setText("");dt.setText("");
				cht.setText("");timet.setText("");
				taxt.setText("");not.setText("");
				subtt.setText("");prt.setText("");
				tott.setText("");rot.setText("");
			}
		});
		
	}

}