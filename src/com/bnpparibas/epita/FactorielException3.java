package com.bnpparibas.epita;

public class FactorielException3 extends FactorielException {
    public FactorielException3() {
        super("Erreur par défaut");
    }

    public FactorielException3(String message) {
        super(message);
    }

    public FactorielException3(int nombre) {
        super("erreur pour le chiffre: " + nombre);
    }
}
