package waifu;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author KnightAsterial
 *
 */
public class WaifuMain {
	
	public static Robot robot;
	
	public static void main(String[] args) {
		
		//Does "sketchy" weeb google search
		File chrome = new File("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		try {
			robot = new Robot();
			Desktop.getDesktop().open(chrome);
			
			Robot googler = new Robot();
			googler.delay(1000);
			googler.keyPress(KeyEvent.VK_CONTROL);
			googler.keyPress(KeyEvent.VK_L);
			googler.keyRelease(KeyEvent.VK_CONTROL);
			googler.keyRelease(KeyEvent.VK_L);
			//robot.delay(1000);
			type("appropriate anime photos");
			googler.keyPress(KeyEvent.VK_ENTER);
			googler.keyRelease(KeyEvent.VK_ENTER);
			googler.delay(2000);
			for (int i = 0; i < 10;i++){
				googler.keyPress(KeyEvent.VK_TAB);
				googler.keyRelease(KeyEvent.VK_TAB);
			}
			googler.delay(100);
			googler.keyPress(KeyEvent.VK_ENTER);
			googler.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (IOException | AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		JFrame frame;
		URL url = WaifuMain.class.getResource("/image/asdk.gif");
		frame = new JFrame("Heyo Daddy-chan");
		frame.setLocation(600,400);
		frame.add(new JLabel(new ImageIcon(url)));
		frame.addWindowListener(new WaifuMultipler());
		frame.addKeyListener(new WaifuMultipler());
		frame.pack();
		frame.setVisible(true);
		


		
		
	}
	
    public static void type(String characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            type(character);
        }
    }

    public static void type(char character) {
        switch (character) {
        case 'a': doType(KeyEvent.VK_A); break;
        case 'b': doType(KeyEvent.VK_B); break;
        case 'c': doType(KeyEvent.VK_C); break;
        case 'd': doType(KeyEvent.VK_D); break;
        case 'e': doType(KeyEvent.VK_E); break;
        case 'f': doType(KeyEvent.VK_F); break;
        case 'g': doType(KeyEvent.VK_G); break;
        case 'h': doType(KeyEvent.VK_H); break;
        case 'i': doType(KeyEvent.VK_I); break;
        case 'j': doType(KeyEvent.VK_J); break;
        case 'k': doType(KeyEvent.VK_K); break;
        case 'l': doType(KeyEvent.VK_L); break;
        case 'm': doType(KeyEvent.VK_M); break;
        case 'n': doType(KeyEvent.VK_N); break;
        case 'o': doType(KeyEvent.VK_O); break;
        case 'p': doType(KeyEvent.VK_P); break;
        case 'q': doType(KeyEvent.VK_Q); break;
        case 'r': doType(KeyEvent.VK_R); break;
        case 's': doType(KeyEvent.VK_S); break;
        case 't': doType(KeyEvent.VK_T); break;
        case 'u': doType(KeyEvent.VK_U); break;
        case 'v': doType(KeyEvent.VK_V); break;
        case 'w': doType(KeyEvent.VK_W); break;
        case 'x': doType(KeyEvent.VK_X); break;
        case 'y': doType(KeyEvent.VK_Y); break;
        case 'z': doType(KeyEvent.VK_Z); break;
        case 'A': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
        case 'B': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
        case 'C': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
        case 'D': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
        case 'E': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
        case 'F': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
        case 'G': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
        case 'H': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
        case 'I': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
        case 'J': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
        case 'K': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
        case 'L': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
        case 'M': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
        case 'N': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
        case 'O': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
        case 'P': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
        case 'Q': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
        case 'R': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
        case 'S': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
        case 'T': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
        case 'U': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
        case 'V': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
        case 'W': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
        case 'X': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
        case 'Y': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
        case 'Z': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
        case '`': doType(KeyEvent.VK_BACK_QUOTE); break;
        case '0': doType(KeyEvent.VK_0); break;
        case '1': doType(KeyEvent.VK_1); break;
        case '2': doType(KeyEvent.VK_2); break;
        case '3': doType(KeyEvent.VK_3); break;
        case '4': doType(KeyEvent.VK_4); break;
        case '5': doType(KeyEvent.VK_5); break;
        case '6': doType(KeyEvent.VK_6); break;
        case '7': doType(KeyEvent.VK_7); break;
        case '8': doType(KeyEvent.VK_8); break;
        case '9': doType(KeyEvent.VK_9); break;
        case '-': doType(KeyEvent.VK_MINUS); break;
        case '=': doType(KeyEvent.VK_EQUALS); break;
        case '~': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
        case '!': doType(KeyEvent.VK_EXCLAMATION_MARK); break;
        case '@': doType(KeyEvent.VK_AT); break;
        case '#': doType(KeyEvent.VK_NUMBER_SIGN); break;
        case '$': doType(KeyEvent.VK_DOLLAR); break;
        case '%': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
        case '^': doType(KeyEvent.VK_CIRCUMFLEX); break;
        case '&': doType(KeyEvent.VK_AMPERSAND); break;
        case '*': doType(KeyEvent.VK_ASTERISK); break;
        case '(': doType(KeyEvent.VK_LEFT_PARENTHESIS); break;
        case ')': doType(KeyEvent.VK_RIGHT_PARENTHESIS); break;
        case '_': doType(KeyEvent.VK_UNDERSCORE); break;
        case '+': doType(KeyEvent.VK_PLUS); break;
        case '\t': doType(KeyEvent.VK_TAB); break;
        case '\n': doType(KeyEvent.VK_ENTER); break;
        case '[': doType(KeyEvent.VK_OPEN_BRACKET); break;
        case ']': doType(KeyEvent.VK_CLOSE_BRACKET); break;
        case '\\': doType(KeyEvent.VK_BACK_SLASH); break;
        case '{': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
        case '}': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
        case '|': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
        case ';': doType(KeyEvent.VK_SEMICOLON); break;
        case ':': doType(KeyEvent.VK_COLON); break;
        case '\'': doType(KeyEvent.VK_QUOTE); break;
        case '"': doType(KeyEvent.VK_QUOTEDBL); break;
        case ',': doType(KeyEvent.VK_COMMA); break;
        case '<': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA); break;
        case '.': doType(KeyEvent.VK_PERIOD); break;
        case '>': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD); break;
        case '/': doType(KeyEvent.VK_SLASH); break;
        case '?': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
        case ' ': doType(KeyEvent.VK_SPACE); break;
        default:
            throw new IllegalArgumentException("Cannot type character " + character);
        }
    }

    private static void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private static void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }

        robot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        robot.keyRelease(keyCodes[offset]);
    }

	
	public static class WaifuMultipler implements WindowListener, KeyListener{

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
				String song1 = "/image/LiSA_-_Rising_Hope_mp3cut_net_.wav";
				
				try{
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem.getAudioInputStream(WaifuMain.class.getResource(song1));
					clip.open(inputStream);
					clip.start();
				}
				catch (Exception e){
					e.printStackTrace();
				}
				
				frame = new JFrame("Don't leave me daddy-chan!");
				frame.setAlwaysOnTop(true);
				URL url = WaifuMain.class.getResource("/image/sadcap.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-269)));
				frame.addWindowListener(this);
				frame.addKeyListener(this);
				frame.pack();
				frame.setVisible(true);
				
				String song2 = "/image/Attack_on_Titan_-_Official_Opening_-_Feuerroter_Pf.wav";

				try{
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem.getAudioInputStream(WaifuMain.class.getResource(song2));
					clip.open(inputStream);
					clip.start();
				}
				catch (Exception e){
					e.printStackTrace();
				}
				
				frame = new JFrame("How dare you break the waifu-code! Have some decency!");
				frame.setAlwaysOnTop(true);
				url = WaifuMain.class.getResource("/image/angrycap.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-270)));
				frame.addWindowListener(this);
				frame.addKeyListener(this);
				frame.pack();
				frame.setVisible(true);
				
				frame = new JFrame("Why would you do this??");
				frame.setAlwaysOnTop(true);
				url = WaifuMain.class.getResource("/image/you-me.gif");
				frame.add(new JLabel(new ImageIcon(url)));
				frame.setLocation(new Point(rand.nextInt(screenSize.width-480), rand.nextInt(screenSize.height-269)));
				frame.addWindowListener(this);
				frame.addKeyListener(this);
				frame.pack();
				frame.setVisible(true);
			}
				
			
			Thread thread = new Thread(new Runnable() {

			    @Override
			    public void run() {
					
			    	try {
			    		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
						Random rand = new Random();
			    		Robot robot = new Robot();
						while(true){
							robot.mouseMove(rand.nextInt((int) screen.getWidth()), rand.nextInt((int) screen.getHeight()));
							Thread.sleep(100);
						}
					} catch (AWTException | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}      
			    }
			            
			});
			        
			thread.start();
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

		@Override
		public void keyPressed(KeyEvent arg0) {
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
		//Cuz I'm a nice guy, here's an escape button... have fun and virus responsibly!
		@Override
		public void keyTyped(KeyEvent arg0) {
			if (arg0.getKeyChar() == '~'){
				System.exit(0);
			}
			
		}
		
	}
}
