public class StrandOfDNA {
    public static String remakeDNA (String DNA) {

        return new StringBuilder(DNA.replace('A', 'B')
                .replace('T', 'A')
                .replace('B', 'T')
                .replace('C', 'D')
                .replace('G', 'C')
                .replace('D', 'G'))
                .reverse()
                .toString();
    }
}
