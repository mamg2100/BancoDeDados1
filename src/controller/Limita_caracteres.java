/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Marco Antonio
 */
public class Limita_caracteres extends PlainDocument {

    private int quantMax;

    public Limita_caracteres(int maxLen) {

        super();
        if (maxLen <= 0) {
            throw new IllegalArgumentException("Especificar a quantidade");
        }
        quantMax = maxLen;
    }

    public Limita_caracteres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insereString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null || getLength() == quantMax) {
            return;
        }
        int totalQtdade = (getLength() + str.length());
        if (totalQtdade <= quantMax) {
            super.insertString(offset, str.replaceAll("[^a-z]", ""), attr);
            return;
        }
        String nova = str.substring(0,getLength()-quantMax);
        super.insertString(offset, nova, attr);
    }

}
