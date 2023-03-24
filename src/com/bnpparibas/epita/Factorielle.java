package com.bnpparibas.epita;

public class Factorielle {


    public static int factorielle(int nombre) throws FactorielException
    {
        if (nombre > 14 && nombre < 20) {
            System.out.println("'!' nombre>14 '!' ");
            throw new FactorielException(nombre);
        }
        else if (nombre <0){
            System.out.println("'!' nombre négatif'!' ");
            throw new FactorielException2(nombre);
        }
        else if (nombre > 20){
            System.out.println("'!' nombre trop grand' ");
            throw new FactorielException3(nombre);
        }

        int resultatFactorielle = 1;
        for (int i = 2; i<=nombre; i++){
            resultatFactorielle = resultatFactorielle * i;

        }
        return resultatFactorielle;
    }

}

