public class DnaToRna {
    //An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.
    //Given a DNA string t corresponding to a coding strand, its transcribed RNA string u is formed by replacing all occurrences of 'T' in t with 'U' in u.
    //Given: A DNA string t having length at most 1000 nt.
    //Return: The transcribed RNA string of t.

    //Строка РНК представляет собой строку, состоящую из букв алфавита, содержащих «A», «C», «G» и «U».
    //Для данной строки ДНК t, соответствующей кодирующей цепи, ее транскрибируемая строка РНК u образуется путем замены всех вхождений «T» в t на «U» в u.
    //Дано: ДНК-цепочка t длиной не более 1000 нуклеотидов.
    //Возврат: транскрибированная цепочка РНК t.

    public static String makeRNA (String rna) {
        return rna.replace('T', 'U');
    }
}
