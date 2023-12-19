import java.awt.event.*;
import javax.swing.*;

public class Final extends JFrame
{
	static final long FlyDelay = 50;
	JLabel fly = new JLabel("@");
	public Final()
	{
		// 기본 설정 //
		this.setTitle("파리잡기 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gp = new GamePanel();
		this.setContentPane(gp);
		gp.requestFocus();
		createMenu();
		setSize(400,400);
		setVisible(true);
	}
	
	private void createMenu()
	{
		// 메뉴바 설정 //
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("게임");
		JMenuItem setup = new JMenuItem("게임설정");
		setup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String mun = JOptionPane.showInputDialog("게임에 사용할 문자를 입력하세요");
				fly.setText(mun);
			}});
		screenMenu.add(setup);
		screenMenu.addSeparator();
		// 게임하기를 누르면 시작 //
		JMenuItem play = new JMenuItem("게임하기");
		play.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				FlyThread th = new FlyThread(fly, FlyDelay);
				th.start();
				TimerThread tt = new TimerThread(th);
				tt.start();
			}});
		screenMenu.add(play);
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	class GamePanel extends JPanel
	{
		// 게임 화면 구성 //
		public GamePanel()
		{
			this.setLayout(null);
			// 파리를 잡았을 때 //
			FlyThread th = new FlyThread(fly, FlyDelay);
			TimerThread tt = new TimerThread(th);
			fly.addMouseListener(new MouseAdapter()
			{
				public void mousePressed(MouseEvent e)
				{
					// 걸린 시간 출력 //
					JOptionPane.showMessageDialog(null, "축하합니다!! \n걸린시간은 " + TimerThread.n + "초입니다", "메시지", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
			});
			fly.setLocation(200,150);
			fly.setSize(15,15);
			this.add(fly);
		}
	}
	
	class FlyThread extends Thread
	{
		// 파리의 움직임을 결정하는 스레드 구성 //
		JLabel from;
		long FlyDelay;
		// 배열에 이동 거리 저장 후 랜덤으로 뽑아내기 //
		int Fly_Move[] = {15, 0, -15};
		FlyThread(JLabel from, long FlyDelay)
		{
			this.from = from;
			this.FlyDelay = FlyDelay;
		}
		public void run()
		{
			int x = from.getX(), y = from.getY();
			while(true)
			{
				// 파리가 움직이는 모습 //
				int xnum = (int)(Math.random()*3);
				int ynum = (int)(Math.random()*3);
				x = from.getX() + Fly_Move[xnum];
				y = from.getY() + Fly_Move[ynum];
				// 파리가 화면 밖으로 나가면 반대편에서 튀어나오게 하기 //
				// 최대한으로 화면 범위에 근사하게 만들어봤습니다. //
				if(from.getX() < 30)
					x = 315 + from.getX();
				else if(from.getY() < 30)
					y = 300 + from.getY();
				else if(from.getX() > 375)
					x = from.getX() - 345;
				else if(from.getY() > 285)
					y = from.getY() - 285;
				from.setLocation(x,y);
				from.getParent().repaint();
				try {
					sleep(FlyDelay);
				}
				catch(InterruptedException e)
				{
					return;
				}
			}				
		}
	}

	// 게임 시작과 함께 시간을 재는 타이머 스레드 //
	static class TimerThread extends Thread 
	{
		static int n = 0;
		FlyThread th;
		public TimerThread(FlyThread th)
		{
			this.th = th;
		}
		public void run()
		{
			while(true)
			{
				n++;
				if(n==60)
				{
					this.interrupt();
				}
				if(!this.isAlive())
				{
					th.interrupt();
				}
				try
				{
					sleep(1000);
				}
				catch(InterruptedException e)
				{
					JOptionPane.showMessageDialog(null, "Game Over!!", "메시지", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		new Final();
	}

}