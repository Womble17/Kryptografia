package player;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;

import javafx.scene.media.Media;

public class Test {

	public static void main(String[] args) {
		
		
		Media file = new Media("file:/home/marcin/Programming/krypto/Kryptografia/Player/my.mp3");
		
		Player player = new Player();
		
		player.play(file);
		
	}

	

}
