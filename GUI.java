/* Created by Onur TAN

*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
    
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
        
        new GUI();
    }

    public GUI()
    {
        final JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Infection Game");
        guiFrame.setSize(300,250);
      
        guiFrame.setLocationRelativeTo(null);


        final JPanel playPanel = new JPanel();
        playPanel.setVisible(true);

        final JPanel howToPlayPanel = new JPanel();
        howToPlayPanel.setVisible(true);
        
        final JPanel highScorePanel = new JPanel();
        highScorePanel.setVisible(true);
        
        final JLabel playLabel = new JLabel("Main Screen");
        playLabel.setVisible(false);
        
        final JLabel howToPlayLabel = new JLabel("How to Play");
        howToPlayLabel.setVisible(false);
      
        final JLabel highScoreLabel = new JLabel("High Scores ");
        highScoreLabel.setVisible(false);
      
        final JButton play = new JButton( "Play Game");
        final JButton howToPlay = new JButton( "How to Play Game");
        final JButton highScore = new JButton( "View High Score");
        
        playPanel.add(play);
        howToPlayPanel.add(howToPlay);
        highScorePanel.add(highScore);
        
        
        play.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               howToPlayPanel.setVisible(false);
               highScorePanel.setVisible(false);  
               play.setVisible(false);
               playLabel.setVisible(true);
               final JButton backButton = new JButton( "Back");
               final JPanel backPanel = new JPanel();
               
               FlowLayout experimentLayout = new FlowLayout();
               backPanel.setLayout(experimentLayout);
               backPanel.add(backButton);
               backPanel.add(playLabel);
               backPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
               guiFrame.add(backPanel);
               backButton.addActionListener(new ActionListener()
               {
                    @Override
                    public void actionPerformed(ActionEvent event)
                    {
               
                        play.setVisible(true);
                        playPanel.setVisible(true);
                        highScorePanel.setVisible(true);
                        backPanel.setVisible(false);
                        howToPlayPanel.setVisible(true);
               
                    }
                }); 
            }
        });
        
        howToPlay.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               play.setVisible(false);
               highScorePanel.setVisible(false);
               playPanel.setVisible(true);
               howToPlay.setVisible(false);
               howToPlayLabel.setVisible(true);
               
               final JButton backButton = new JButton( "Back");
               final JPanel backPanel = new JPanel();
               
               FlowLayout experimentLayout = new FlowLayout();
               backPanel.setLayout(experimentLayout);
               backPanel.add(backButton);
               backPanel.add(howToPlayLabel);
               backPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
               guiFrame.add(backPanel);
               backButton.addActionListener(new ActionListener()
               {
                    @Override
                    public void actionPerformed(ActionEvent event)
                    {
                        play.setVisible(true);
                        playPanel.setVisible(true);
                        highScorePanel.setVisible(true);
                        backPanel.setVisible(false);
                        howToPlayPanel.setVisible(true);
                        howToPlay.setVisible(true);
               
                    }
                }); 
               
            }
        });
        
        highScore.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               play.setVisible(false);
               playPanel.setVisible(true);
               howToPlayPanel.setVisible(false);
               highScore.setVisible(false);
               highScoreLabel.setVisible(true);
               
               final JButton backButton = new JButton( "Back");
               final JPanel backPanel = new JPanel();
               
               FlowLayout experimentLayout = new FlowLayout();
               backPanel.setLayout(experimentLayout);
               backPanel.add(backButton);
               backPanel.add(highScoreLabel);
               backPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
               guiFrame.add(backPanel);
               backButton.addActionListener(new ActionListener()
               {
                    @Override
                    public void actionPerformed(ActionEvent event)
                    {
                        play.setVisible(true);
                        playPanel.setVisible(true);
                        highScore.setVisible(true);
                        backPanel.setVisible(false);
                        howToPlayPanel.setVisible(true);
                        howToPlay.setVisible(true);
               
                    }
                }); 
            }
        });
        
        //The JFrame uses the BorderLayout layout manager.
        //Put the two JPanels and JButton in different areas.
        guiFrame.add(playPanel, BorderLayout.PAGE_START);
        guiFrame.add(howToPlayPanel, BorderLayout.CENTER);
        guiFrame.add(highScorePanel, BorderLayout.PAGE_END);

 
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
    
}
