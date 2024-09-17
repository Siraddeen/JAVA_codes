public class string_methods_14 {
    public static void main(String[] args) {
        // strings are immutable     it can't be changed
        String ron = "aNt";
        System.out.println(ron.length()); // lenght of string
        System.out.println(ron.toLowerCase()); // turns all char to lowercase
        System.out.println(ron.toUpperCase()); // turns all char to uppercase

        // trim method used to remove empty spaces around a string not inside
        String non_trm = "    hi man how are you    ";
        System.out.println(non_trm);
        String trm = "    hi man how are you    ";
        System.out.println(trm.trim());

        //Substring it is used to print the string where your index should start it's up to you
        String subit = "a man is man";
        System.out.println(subit.substring(4));// starts from n because it'd index is 4
        System.out.println(subit.substring(4 ,9));
        System.out.println(subit.substring(4 ,12)); // this is a tricky part you have 11 char in sentense but used 12 as end for this watch any video i  can't explain it here

        //Replace used to remove & add new value in existing value position
        String rep = "it is a big one ngl";
        System.out.println(rep); // actual one
        System.out.println(rep.replace("g","a"));//replaced one
        System.out.println(rep.replace("big","small"));//replaced one

        // starts with return true
        String sta = "ok how are you";
        System.out.println(sta.startsWith("jk"));//return false
        System.out.println(sta.startsWith("ok"));//return true

        // ends with return true
        String ends = "ok how are you";
        System.out.println(ends.endsWith("jk"));//return false
        System.out.println(ends.endsWith("ou"));//return true

        // charAt shows what is value present at position
        String chr = "Hello all";
        System.out.println(chr.charAt(1 )); //need to show e

        // indexOf()
        // indexOf  returns in which index the first value in a string
        String indx = "vanakkam vanakkam";
        System.out.println(indx.indexOf("ak")); //shows 3 because ak apperars at index number 3
        //we can pass 2 values inside index of as ("d"--> to serach , 4---> start from this index)
        System.out.println(indx.indexOf("ak",5));
        //lastIndexOf  typically tells where the expected value lies in given amount of search
        System.out.println(indx.lastIndexOf("m",9));

        // equals check if given string is same or not
        String equ = "hello";
        System.out.println(equ.equals("Hello")); // gets false because hello != Hello        you get the point it spits boolean value

        // equalsIgnoreCase is one who is not case-sensitive
        String cas = "hi man";
        System.out.println(cas.equalsIgnoreCase("HI mAN")); // returns true






































    }
}
