
import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piko
 */
public class Cards {
    private JButton jb;
    private boolean matched;
    private boolean flipped;
    private Color color;
    public Cards(JButton jb, boolean matched, boolean flipped) {
        this.jb = jb;
        this.matched = matched;
        this.flipped = flipped;
        this.color= null;
    }

    public JButton getJb() {
        return jb;
    }

    public void setJb(JButton jb) {
        this.jb = jb;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
