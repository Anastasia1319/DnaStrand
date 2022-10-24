public class Main {
    public static void main(String[] args) {
        System.out.println(DnaStrand.makeDNA("AAAA"));
        System.out.println(DnaStrand.makeDNA("ATTGC"));
        System.out.println(DnaStrand.makeDNA("GTAT"));
        System.out.println(DnaStrand.makeDNA("CATA"));

        System.out.println(DnaToRna.makeRNA("GATGGAACTTGACTACGTAAATT"));
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("AAAA")));
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("ATTGC")));
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("GTAT")));
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("CATA")));
    }
}