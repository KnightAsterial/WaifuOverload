package waifu;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author KnightAsterial
 *
 */
public class WaifuMain {
	public static void main(String[] args) {
		JFrame frame;
		URL url = WaifuMain.class.getResource("/image/asdk.gif");
		frame = new JFrame("Heyo Daddy-chan");
		frame.add(new JLabel(new ImageIcon(url)));
		frame.addWindowListener(new WaifuMultipler());
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static class WaifuMultipler implements WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			JFrame frame;
			
			Random rand = new Random();
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
			for (int i = 0; i < 4; i++){
				frame = new JFrame("Don't leave me daddy-chan!");
				URL url = WaifuMain.class.getResource("/image/sadcap.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-269)));
				frame.addWindowListener(this);
				frame.pack();
				frame.setVisible(true);
				
				frame = new JFrame("How dare you break the waifu-code! Have some decency!");
				url = WaifuMain.class.getResource("/image/angrycap.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-270)));
				frame.addWindowListener(this);
				frame.pack();
				frame.setVisible(true);
				
				frame = new JFrame("Why would you do this??");
				url = WaifuMain.class.getResource("/image/you-me.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-269)));
				frame.addWindowListener(this);
				frame.pack();
				frame.setVisible(true);
			}
				
			
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
