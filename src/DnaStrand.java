public class DnaStrand {
    public static String makeDNA (String dna) {
        char[] chars = dna.toCharArray();
        String newStrand = "";
        for(char element : chars) {
            element = getChar(element);
            newStrand += element;
        }
        return newStrand;
    }
    private  static char getChar (char c) {
        switch (c) {
            case 'T': return 'A';
            case 'A': return 'T';
            case 'G': return 'C';
            case 'C': return 'G';
        }
        return c;
    }
}
