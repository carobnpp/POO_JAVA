package com.bnpparibas.epita;

public class MainFactorielle {
        public static void main(String[] args) {
            try {
                System.out.println(Factorielle.factorielle(21));
            }
            catch (FactorielException2 e ){
                System.out.println("nombre négatif interdit");
            }
            catch (FactorielException3 e) {
                System.out.println("nombre trop grand");
                e.printStackTrace();
            }
             catch (FactorielException e) {
                System.out.println("erreur");
                e.printStackTrace();
            }

    }

}

