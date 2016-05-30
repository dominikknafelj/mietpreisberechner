/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mietpreisberechner;

/**
 *
 * @author dominik
 */
public class UngueltigeTagesanzahlAusnahme extends Exception {

    /**
     * Creates a new instance of <code>UngueltigeTagesanzahlAusnahme</code>
     * without detail message.
     */
    public UngueltigeTagesanzahlAusnahme() {
    }

    /**
     * Constructs an instance of <code>UngueltigeTagesanzahlAusnahme</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public UngueltigeTagesanzahlAusnahme(String msg) {
        super(msg);
    }
}
