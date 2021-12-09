import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  paintShape extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

//___-->SQUARES<--___
        for(int i=0;i<Math.random()*(12);i++){
            g.setColor(new Color((int)(Math.random()*(255)),(int)(Math.random()*(255)),(int)(Math.random()*(255))));
            g.fillRect((int)(Math.random()*(600)),(int)(Math.random()*(600)),110,110);
        }

        Graphics2D g2D = (Graphics2D) g;
        for(int i=0;i<Math.random()*(15);i++) {
            g2D.setPaint(new Color((int) (Math.random() * (255)), (int) (Math.random() * (255)), (int) (Math.random() * (255))));
            g2D.setStroke(new BasicStroke(4));
            g2D.drawRect((int)(Math.random()*(600)),(int)(Math.random()*(600)),110,110);
            g2D.getBackground();
        }
//        for(int i=0;i<Math.random()*(15);i++) {
//            g2D.setPaint(new Color((int) (Math.random() * (255)), (int) (Math.random() * (255)), (int) (Math.random() * (255))));
//            g2D.setStroke(new BasicStroke(3));
//            g2D.drawArc((int)(Math.random()*(500)),(int)(Math.random()*(500)),(int)(Math.random()*(500)),(int)(Math.random()*(500)),(int)(Math.random()*(90)),(int)(Math.random()*(90)));
//        }

//____-->CIRCLES<--____
        //Graphics2D g2D = (Graphics2D) g;
        for(int i=0;i<Math.random()*(6);i++) {
            g2D.setStroke(new BasicStroke(4));
            g2D.setPaint(new Color((int) (Math.random() * (255)), (int) (Math.random() * (255)), (int) (Math.random() * (255))));
            g2D.drawOval((int)(Math.random()*(600)),(int)(Math.random()*(600)),110,110);
        }
//        for(int i=0;i<Math.random()*(8);i++) {
//            g2D.setPaint(new Color((int) (Math.random() * (255)), (int) (Math.random() * (255)), (int) (Math.random() * (255))));
//            g2D.fillOval((int)(Math.random()*(500)),(int)(Math.random()*(500)),100,100);
//        }
    }
}

public class mainfile {
    public static void main(String[] args) {

        JFrame frameself = new JFrame();
        Border borderself = BorderFactory.createLineBorder(Color.BLACK,4);
        JButton buttonself = new JButton();
        JPanel panelself = new paintShape();
        paintShape s = new paintShape();

        class acwd implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonself) {
                    //System.out.println("Button Pressed from class object!!");
                    s.setVisible(true);
                    frameself.getContentPane().setBackground(new Color(0,255,0));
                    frameself.getContentPane().setBackground(new Color((int)(Math.random()*(255)),(int)(Math.random()*(255)),(int)(Math.random()*(255))));
                    panelself.setBackground(new Color((int)(Math.random()*(255)),(int)(Math.random()*(255)),(int)(Math.random()*(255))));
                    buttonself.setForeground(new Color((int)(Math.random()*(255)),(int)(Math.random()*(255)),(int)(Math.random()*(255))));
                    panelself.add(s);
                }
            }
        }

        acwd listeningself = new acwd();

        buttonself.setText("Push Me!!");
        buttonself.setBackground(Color.lightGray);
        buttonself.setBounds(560, 0, 80, 60);
        buttonself.setLayout(null);
        //buttonself.setBackground(Color.YELLOW);
        buttonself.setFocusable(false);
        //buttonself.setOpaque(true);
        buttonself.setEnabled(true);
        buttonself.addActionListener(listeningself);

        panelself.setLayout(null);
        panelself.setBounds(100, 120, 1000, 600);
        //panelself.setBackground(new Color(0xF0D2EF));
        panelself.setVisible(true);
        panelself.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        panelself.setBorder(borderself);

        frameself.setSize(1200, 800);
        frameself.setTitle("GENERATED IMPRESSIONS");
        //frameself.getContentPane().setBackground(new Color(0xAED7CD));
        frameself.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameself.setLayout(null);
        frameself.setVisible(true);
        frameself.add(panelself);
        frameself.add(buttonself);
    }
}
//eight hundred fifty duodecillion four hundred and twenty-two undecillion three hundred and ninety-four decillion eight hundred nonillion
//8.504223948x10^41
