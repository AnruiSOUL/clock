import javax.swing.*;

/**
 * Created by randallcrame on 2/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(); //since clock extends JFrame this is the creation of the frame. Frame appears to be the OS frame
        clock.setSize(200,80); // Sets the shape of the frame, appears to be pixel based
        clock.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //clock.setUndecorated(true);
        clock.setVisible(true); // designates if the frame is visible or not.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        } catch (UnsupportedLookAndFeelException e) {

        }
        clock.setResizable(true);
        clock.start();

    }
}
