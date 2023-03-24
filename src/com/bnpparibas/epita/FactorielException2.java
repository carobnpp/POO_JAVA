package com.bnpparibas.epita;

public class FactorielException2 extends FactorielException{
    public FactorielException2() {
        super("Erreur par défaut");
    }

    public FactorielException2(String message) {
        super(message);
    }

    public FactorielException2(int nombre) {
        super("erreur pour le chiffre: " + nombre);
    }
}
