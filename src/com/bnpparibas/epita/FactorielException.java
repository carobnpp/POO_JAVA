package com.bnpparibas.epita;

public class FactorielException extends Exception{
    public FactorielException() {
        super("Erreur par défaut");
    }

    public FactorielException(String message) {
        super(message);
    }

    public FactorielException(int nombre) {
        super("erreur pour le chiffre: " + nombre);
    }
}
