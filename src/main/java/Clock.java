
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by randallcrame on 2/3/17.
 * Original Code from http://www.sourcecodester.com/tutorials/java/5668
 * /easy-way-implement-dynamic-clock-java-using-threads.html
 */
public class Clock extends JFrame implements Runnable, WindowListener{

        Thread timer = null; //Creation of a thread of executable program that runs along with main thread priority

        String timeToDisplay, dateToDisplay; //String that is used to set the formatting of time and date.

        Date d; //used to call the date for the clock.

        JLabel dateLabel = new JLabel();




    public void start(){
        if (timer == null){
            timer = new Thread(this);
            timer.start();
        }
    }

    public void stop() {
        timer = null;
    }

    Clock() {
        this.setLayout(new GridLayout(0,1));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        dateLabel.setOpaque(false); //created this to make use of the .setBackground... not useful it only sets the background of the time not the frame.
        dateLabel.setBackground(Color.DARK_GRAY); // unsure of what background is changed
        dateLabel.setForeground(Color.BLACK); // Changes color of the time text
        dateLabel.setFont(new Font("Serif", Font.PLAIN, (int) width/10)); // name search for a suitable name in list and sets the font type, middles is style, and size.
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setVerticalAlignment(JLabel.CENTER);
          this.add(dateLabel);
          this.setTitle("Clock ");
        this.pack();
            this.setLocationRelativeTo(null);
    }

    public String getFormattedTime(Date d){ //Gutted out existing code because most was deprecated and used SimpleDateFormat
        SimpleDateFormat formattedTime = new SimpleDateFormat(" hh:mm:ss a z");
        return formattedTime.format(d);
    }

    public String getFormattedDate(Date d) {
        SimpleDateFormat formattedDate = new SimpleDateFormat("EEE, MMM d yyyy");
        return  "<html>" + formattedDate.format(d) +"<br>" + getFormattedTime(d) +"</html>";
    }


    public void run() {
        while (timer != null) {
            try {
                timer.sleep(10);
            } catch (InterruptedException e) {
            }
            d = new Date();
            timeToDisplay = getFormattedTime(d);
            dateToDisplay = getFormattedDate(d);
            dateLabel.setText(dateToDisplay);

        }
            timer = null;
        }

    public void  windowActivated(WindowEvent arg0) {

    }

      public void windowClosed(WindowEvent arg0) {
      }

    public void windowClosing(WindowEvent arg0) {
        stop();
        dispose();
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent arg0) {
    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }
    public void windowOpened(WindowEvent arg0) {
    }
}
