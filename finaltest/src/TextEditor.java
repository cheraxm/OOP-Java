/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor implements ActionListener{
    private JFrame frame;
    private JTextArea textarea;
    private JMenuBar menubar;
    private JMenu file;
    private JMenuItem mi1, mi2, mi3, mi4;
    private File f;
    private String txt;
    
    public TextEditor(){
        frame = new JFrame();
        
        menubar = new JMenuBar();
        file = new JMenu("File");
        
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Close");
        
        textarea = new JTextArea();
        txt = "";
        
        frame.add(textarea);
        frame.setJMenuBar(menubar);
        
        menubar.add(file);
        
        file.add(mi1);
        file.add(mi2);
        file.add(mi3);
        file.addSeparator();
        file.add(mi4);
        
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(mi1)){
            textarea.setText("");
        }
        else if(e.getSource().equals(mi2)){
            loadfile(txt);
        }
        else if(e.getSource().equals(mi3)){
            savefile();
        }
        else if(e.getSource().equals(mi4)){
            System.exit(0);
        }
    }
    public void savefile(){
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(frame);
        File f = fc.getSelectedFile();
        try{FileWriter fw = new FileWriter(f);
            fw.write(textarea.getText());
            fw.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public void loadfile(String txt){
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(frame);
        File f = fc.getSelectedFile();
        try{FileReader fr = new FileReader(f);
            int ch;
            while((ch=fr.read()) != -1){
                txt += (char) ch;
            }
            textarea.setText(txt);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    
    
    
}
