package Second_hand_market;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Second_hand_market.window.dbcon;

public class part {
	button1.addActionListener(new ActionListener () {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub		
			dispose();
				//建立注册窗体
				 final JFrame f2=new JFrame("注册");	
				 f2.setVisible(true);
				 f2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				 f2.setBounds(800,100,500, 800);
				 
			     JLabel l1=new  JLabel("注册账号：");
			     final JTextField t1=new JTextField (15);    
			     JLabel l2=new  JLabel("注册密码：");
			     final JPasswordField p1=new JPasswordField (15);
			     JButton b=new JButton("保存");
			     JPanel p=new JPanel();
			     p.add(l1);
			     p.add(t1);
			     p.add(l2);
			     p.add(p1);
			     p.add(b);
			     f2.add(p,BorderLayout.CENTER);
			     //给保存按钮注册监听器 
			     b.addActionListener(new ActionListener() {		
			    	 //创建抽象方法，接口
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						dispose();
						 final JFrame f2=new JFrame("登录");	
						 f2.setVisible(true);
						 f2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
						 f2.setBounds(800,100,500, 800);
						String acc1=t1.getText();						
						String acc2=new String(p1.getPassword()); 
						System.out.println(acc2);
			  			t1.setText("");
			  			p1.setText("");
			  			

						if((acc1!=null && acc1.length()!=0)&&(acc2!=null && acc2.length()!=0)) {
							//保存到数据库。
							dbcon.keepinfo(acc1, acc2);
							
						JDialog dia=new JDialog(f2,"提示 ",true);
					    dia.setBounds(400,400,200,200);
					  	dia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					  		    
					  	JLabel l=new JLabel("保存成功！");
					  	Font font=new Font("宋体",Font.BOLD,20);
					    l.setFont(font);
					    JPanel p=new JPanel();
					    p.add(l);
					  	dia.add(p,BorderLayout.NORTH);
					  	dia.setVisible(true);
							
			  		      }			  		
			  			else {
			  
			  			//判断账号、密码文本框中内容是否为空。如果是，弹出对话框。
			  		    JDialog dia=new JDialog(f2,"提示 ",true);
			  		    dia.setBounds(800,100,500,800);
			  		    dia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			  		    
			  		    JLabel l=new JLabel("输入内容不能为空");
			  		    Font f=new Font("宋体",Font.BOLD,20);
			  		    l.setFont(f);
			  		    JPanel p=new JPanel();
			  		    p.add(l);
			  		    dia.add(p,BorderLayout.NORTH);
			  		    dia.setVisible(true);}
			  			
			  		}
					});
		}

	
     }
    );
	
	
	
	
	
	
	String acc3=text1.getText();
		String acc4=new String(text2.getPassword()); 
		text1.setText("");
		text2.setText("");
		if((acc3!=null && acc3.length()!=0)&&(acc4!=null && acc4.length()!=0)) {
			 
				 
  			if(dbcon.compword(acc3, acc4)) {
  			 //建立买或买窗体
				 JFrame f3=new JFrame("买或卖");	
				 
				 f3.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				 f3.setBounds(600,240,290, 580); 
				 JLabel la=new JLabel();
				 
				 f3.add(la);
	         f3.setVisible(true);
  			  }else //如果账号密码不匹配，则弹出提示对话框。
  				 {
  				  JFrame jf4=new JFrame();
  		  		    JDialog dia=new JDialog(jf4,"提示 ",true);
  		  		    dia.setBounds(630,300,220, 150);
  		  		    dia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
  		  		    
  		  		    JLabel l=new JLabel("账号或者密码错误，请重试");
  		  		    Font f=new Font("宋体",Font.BOLD,20);
  		  		    l.setFont(f);
  		  		    JPanel p=new JPanel();
  		  		    p.setLayout(new BorderLayout());
  		  		    p.add(l,BorderLayout.CENTER);
  		  		    dia.add(p,BorderLayout.NORTH);
  		  		    dia.setVisible(true);
				     }
				 
		      }
 
		
			else {

			//判断账号、密码文本框中内容是否为空。如果是，弹出对话框。
		    JFrame jf5=new JFrame();
			JDialog dia=new JDialog(jf5,"提示 ",true);
		    dia.setBounds(630,300,200, 400);
		    dia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		    
		    JLabel l=new JLabel("输入内容不能为空");
		    l.setSize(200,200);
		    Font f=new Font("宋体",Font.BOLD,15);
		    l.setFont(f);
		    JPanel p=new JPanel();
		    p.add(l);
		    dia.add(p,BorderLayout.NORTH);
		    dia.setVisible(true);}
			
		}
  });
 
 JPanel pan2=new JPanel();
 pan2.add(button1);
 pan2.add(button2);     
 f1.add(pan2,BorderLayout.PAGE_END);
}

public static void main(String[] args) {
 new window().view();//调用方法
 

}
}
