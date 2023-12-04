package org.example.tp_class_heritage.exo3;

public class Compte {

    public final static String TYPE_COMPTE_SIMPLE = "CS";
    public final static String TYPE_COMPTE_EPARNGE = "CE";
    public final static String TYPE_COMPTE_PAYANTE = "CP";
    private static int cpt;
    private int code;
    private double sold;
    private boolean decouvertAutorise;
    private String typeCompte;

    public Compte() {

        this.code = ++cpt;
    }

    public Compte(double sold, boolean decouvertAutorise, String typeCompte) {
        this();
        this.sold = sold;
        this.decouvertAutorise = decouvertAutorise;
        this.typeCompte = typeCompte;
    }

    public static int getCpt() {

        return cpt;
    }

    public static void setCpt(int cpt) {

        Compte.cpt = cpt;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {

        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public boolean isDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(boolean decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

   /* @Override
    public String toString() {
        return "|\t" + StringHelpers.leftPad(code + "", 11, "0") + "\t|\t" + typeCompte + "\t|\t"
                + sold + "\t|\t" + decouvertAutorise + "\t|\t" +  "\t|\t";

    }*/

}
