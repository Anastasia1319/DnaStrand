public class Main {
    public static void main(String[] args) {
        System.out.println(DnaStrand.makeDNA("AAAA")); //TTTT
        System.out.println(DnaStrand.makeDNA("ATTGC")); //TAACG
        System.out.println(DnaStrand.makeDNA("GTAT")); //CATA
        System.out.println(DnaStrand.makeDNA("CATA")); //GTAT

        System.out.println(DnaToRna.makeRNA("GATGGAACTTGACTACGTAAATT")); //GAUGGAACUUGACUACGUAAAUU
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("AAAA"))); //UUUU
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("ATTGC"))); //UAACG
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("GTAT"))); //CAUA
        System.out.println(DnaToRna.makeRNA(DnaStrand.makeDNA("CATA"))); //GUAU

        System.out.println(StrandOfDNA.remakeDNA("AAAACCCGGT")); //ACCGGGTTTT
        System.out.println(StrandOfDNA.remakeDNA("GTAT")); //ATAC
        System.out.println(StrandOfDNA.remakeDNA("ATTGC")); //GCAAT
        System.out.println(StrandOfDNA.remakeDNA("CATA")); //TATG
    }
}