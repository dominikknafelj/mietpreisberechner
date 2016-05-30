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
public class UngueltigeKilometerangabeAusnahme extends Exception {

    /**
     * Creates a new instance of <code>UngueltigeKilometerangabeAusnahme</code>
     * without detail message.
     */
    public UngueltigeKilometerangabeAusnahme() {
    }

    /**
     * Constructs an instance of <code>UngueltigeKilometerangabeAusnahme</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UngueltigeKilometerangabeAusnahme(String msg) {
        super(msg);
    }
}
