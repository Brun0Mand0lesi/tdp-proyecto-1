package launcher;


import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		Student bruno =new Student(130121,"Mandolesi","Bruno","brunomandol@gmail.com","https://github.com/Brun0Mand0lesi", "/images/WhatsApp Image 2021-08-26 at 09.54.47.jpeg");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen window = new SimplePresentationScreen(bruno);
            	window.setVisible(true);
            }
        });
    }
}
