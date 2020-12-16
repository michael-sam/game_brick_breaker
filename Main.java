// Author: Sam Yong Zhi
// Purpose: Coding artefact for SMU MITB AI track application
// Description: Created this Brick Breaker game by using JFrame and JPanel
// Remarks: By following an online video for making this game, I have written the codes from scratch and added my own comments using IntelliJ IDEA.
// URL of the video is  https://www.youtube.com/watch?v=K9qMm3JbOH0&feature=youtu.be


import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	    JFrame obj = new JFrame();
	    Gameplay gamePlay = new Gameplay();
	    obj.setBounds(10, 10, 700, 600);
	    obj.setTitle("Brick Breaker");
	    obj.setResizable(false);
	    obj.setVisible(true);
	    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    obj.add(gamePlay);
    }
}

