public class Main {



    public static void main(String[] args) {



        System.out.println(occurenceChar("eeearrrrr",'e'));

    }


    public static int occurenceChar(String str, char c){

        int count = 0;

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}