/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author johnr
 */
public class Calculator extends JFrame implements ActionListener {

    private final int NO_ACTION = 0x00;
    private final int NUM_ACTION = 0x01;
    private final int OP_ACTION = 0x02;
    private final int EVAL_ACTION = 0x04;
    private final int EQ_ACTION = 0x08;
    private int lastAction = NO_ACTION;

    private String firstNumStr = "";
    private String secondNumStr = "";
    private boolean newNum = true;

    private final char NO_OP = '\0';
    private char op = NO_OP;

    private String[] keys = {"7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"};

    private Object[] keyStrokes = {"7", "8", "9", KeyEvent.VK_SLASH,
        "4", "5", "6", "shift 8",
        "1", "2", "3", KeyEvent.VK_MINUS,
        "0", "typed C", KeyEvent.VK_EQUALS, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.SHIFT_DOWN_MASK)};

    private JTextField displayText = new JTextField(30);
    private JButton[] button = new JButton[16];

    private abstract class CustomAction extends AbstractAction {

        protected int index = -1;

        public CustomAction(int index) {
            this.index = index;
        }
    }

    // What is going on here? discuss in class
    private void setInputMap() {
        JPanel pane = (JPanel) this.getContentPane();

        InputMap imap = pane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        for (int index = 0; index < button.length; index++) {
            if (keyStrokes[index] instanceof String) {
                imap.put(KeyStroke.getKeyStroke((String) keyStrokes[index]), index);
            } else if (keyStrokes[index] instanceof KeyStroke) {
                imap.put((KeyStroke) keyStrokes[index], index);
            } else {
                imap.put(KeyStroke.getKeyStroke((int) keyStrokes[index], 0), index);
            }

            pane.getActionMap().put(index, new CustomAction(index) {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button[this.index].doClick();
                }
            });
        }
    }

    private void setupUiBorderAndGrid() {
        // use a combination of border layout and grid layout to create the 
        // calculator layout

        // ContentPane default is borderlayout
        this.getContentPane().add(displayText, BorderLayout.PAGE_START);

        // JPanel default is FlowLayout
        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(4, 4);
        buttonPanel.setLayout(buttonLayout);

        for (int index = 0; index < button.length; index++) {
            button[index] = new JButton(keys[index]);
            buttonPanel.add(button[index]);
            button[index].addActionListener(this);
        }

        this.getContentPane().add(buttonPanel, BorderLayout.CENTER);
    }

    private void setupUiExplicitPosition() {
        // use the coordinate system to 
        // explicitly position each element
        Container pane = getContentPane();

        // what happens if i dont set this to null?
        pane.setLayout(null);

        displayText.setSize(200, 30);
        displayText.setLocation(10, 10);

        // what happens if you do this
        // displayText.setFocusable(false);
        pane.add(displayText);

        int x = 10, y = 40;

        for (int ind = 0; ind < button.length; ind++) {
            button[ind] = new JButton(keys[ind]);

            // what is this doing??
            button[ind].addActionListener(this);

            button[ind].setSize(50, 30);
            button[ind].setLocation(x, y);
            pane.add(button[ind]);
            x += 50;

            if ((ind + 1) % 4 == 0) {
                x = 10;
                y += 30;
            }
        }
    }

    // what kind of layout is being used
    public Calculator() {
        this.setTitle("Calculator");
        this.setSize(230, 200);
        this.displayText.setText("0");
        this.displayText.setEnabled(false);
        // Choose one or the other
        setupUiBorderAndGrid();
//        setupUiExplicitPosition();

        // Register for key events
        // converts key events into mouse clicks on the buttons
        setInputMap();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // from pp770-771
        String str = String.valueOf(e.getActionCommand());

        char ch = str.charAt(0);

        switch (ch) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                if (newNum) {
                    displayText.setText("");
                    newNum = false;
                }
                displayText.setText(displayText.getText() + ch);
                lastAction = NUM_ACTION;
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                // dont do anything if someone is pressing operators
                if (lastAction == EQ_ACTION) {
                    firstNumStr = displayText.getText();
                    secondNumStr = "";
                    lastAction = OP_ACTION;
                }else if(lastAction != OP_ACTION){
                    if (firstNumStr.equals("")) {
                        firstNumStr = displayText.getText();
                        lastAction = OP_ACTION;
                    } else if (secondNumStr.equals("")) {
                        secondNumStr = displayText.getText();
                        String result = evaluate(firstNumStr, secondNumStr);
                        displayText.setText(result);
                        firstNumStr = secondNumStr;
                        secondNumStr = result;
                        lastAction = EVAL_ACTION;
                    } else {
                        firstNumStr = secondNumStr;
                        secondNumStr = displayText.getText();
                        String result = evaluate(firstNumStr, secondNumStr);
                        displayText.setText(result);
                        firstNumStr = secondNumStr;
                        secondNumStr = result;
                        lastAction = OP_ACTION;
                    }
                } else {
                    lastAction = OP_ACTION;
                }
                newNum = true;
                op = ch;
                break;
            case '=':
                if (firstNumStr.equals("")) {
                    firstNumStr = displayText.getText();
                }
                if (secondNumStr.equals("")) {
                    secondNumStr = displayText.getText();
                }
                String result = evaluate(firstNumStr, secondNumStr);
                firstNumStr = result;
                displayText.setText(result);
                lastAction = EQ_ACTION;
                newNum = true;
                break;
            case 'C':
                displayText.setText("0");
                firstNumStr = secondNumStr = "";
                lastAction = NO_ACTION;
                op = NO_OP;
                break;
        }
    }

    private String evaluate(String numStr1, String numStr2) {
        final char beep = '\u0007'; // what does this do?

        try {
            int num1 = Integer.parseInt(numStr1);
            int num2 = Integer.parseInt(numStr2);
            int result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = num2;
            }

            return String.valueOf(result);
        } catch (ArithmeticException e) {
            System.out.print(beep);
            return "E R R O R: " + e.getMessage();
        } catch (NumberFormatException e) {
            System.out.print(beep);
            if (numStr1.equals("")) {
                return "E R R O R: Invalid First Number";
            } else {
                return "E R R O R: Invalid Second Number";
            }
        } catch (Exception e) {
            System.out.print(beep);

            return "E R R O R";
        }
    }
}
