package stocksshares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StocksShares {

    private static Company[] companies = {new Company("Disunited .inc", 200), new Company("Neutered & Sons.", 150), new Company("Unlimited Ltd.", 250), new Company("Lonely & Co.", 100)};
    
    public static void optionMenu() {
        JFrame f = new JFrame("Stocks & Shares");

        JLabel l = new JLabel("Select an option:");
        l.setBounds(50, 50, 200, 30);

        JButton nextDay = new JButton("Next day");
        JButton quit = new JButton("Quit");

        nextDay.setBounds(50, 100, 200, 30);
        quit.setBounds(50, 150, 200, 30);  

        nextDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                adjustStocks();
            }
        });
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                System.exit(0);
            }
        });

        f.add(nextDay); f.add(quit); f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void showStocks() {
        JFrame f = new JFrame("Stocks & Shares");

        JLabel stock0 = new JLabel(companies[0].getName() + ": £" + companies[0].getSharePrice());
        JLabel stock1 = new JLabel(companies[1].getName() + ": £" + companies[1].getSharePrice());
        JLabel stock2 = new JLabel(companies[2].getName() + ": £" + companies[2].getSharePrice());
        JLabel stock3 = new JLabel(companies[3].getName() + ": £" + companies[3].getSharePrice());
        stock0.setBounds(50, 50, 300, 30);
        stock1.setBounds(50, 100, 300, 30);
        stock2.setBounds(50, 150, 300, 30);
        stock3.setBounds(50, 200, 300, 30);

        JButton ok = new JButton("Ok");
        ok.setBounds(50, 250, 200, 30);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                optionMenu();
            }
        });

        f.add(stock0); f.add(stock1); f.add(stock2); f.add(stock3); f.add(ok);
        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void adjustStocks() {
        double change;
        double newValue;
        
        for(int i = 0; i < 4; i++) {
            change = ((int)(Math.random()*((200) + 1)));
            change = (change - 100) / 100 + 1;
            newValue = Math.round((companies[i].getSharePrice() * change) * 100.0) / 100.0;
            companies[i].setSharePrice(newValue);
        }
        
        showStocks();
    }
    
    public static void main(String[] args) {
        showStocks();
    }
    
}
