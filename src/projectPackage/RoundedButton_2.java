package projectPackage;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class RoundedButton_2 extends JButton {
    private Color backgroundColor;

    public RoundedButton_2() { 
        super(); 
        decorate(); 
    } 

    public RoundedButton_2(String text) { 
        super(text); 
        decorate(); 
    } 

    public RoundedButton_2(Action action) { 
        super(action); 
        decorate(); 
    } 

    public RoundedButton_2(Icon icon) { 
        super(icon); 
        decorate(); 
    } 

    public RoundedButton_2(String text, Icon icon) { 
        super(text, icon); 
        decorate(); 
    } 

    protected void decorate() { 
        setBorderPainted(false); 
        setOpaque(false); 
        backgroundColor = new Color(255, 255, 255); // 기본 배경색 설정
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        backgroundColor = bg;
        repaint(); // 색상 변경 후 다시 그리기
    }

    @Override 
    protected void paintComponent(Graphics g) {
       Color o = new Color(0, 0, 0); // 글자색 결정
       int width = getWidth(); 
       int height = getHeight(); 
       Graphics2D graphics = (Graphics2D) g; 
       graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
       if (getModel().isArmed()) { 
           graphics.setColor(backgroundColor.darker()); 
       } else if (getModel().isRollover()) { 
           graphics.setColor(backgroundColor.brighter()); 
       } else { 
           graphics.setColor(backgroundColor); 
       } 
       graphics.fillRoundRect(0, 0, width, height, 10, 10); 
       FontMetrics fontMetrics = graphics.getFontMetrics(); 
       Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
       int textX = (width - stringBounds.width) / 2; 
       int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
       graphics.setColor(o); 
       graphics.setFont(getFont()); 
       graphics.drawString(getText(), textX, textY); 
       graphics.dispose(); 
       super.paintComponent(g); 
    }
}
