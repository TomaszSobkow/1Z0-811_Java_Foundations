public class JFT10Ex6VowelCount {


    String vovelCount(String message) {

        int vowelA = 0;
        int vowelE = 0;
        int vowelI = 0;
        int vowelO = 0;
        int vowelU = 0;

        for (int i = 0; i < message.length(); i++) {
            char messageChar = message.charAt(i);

            switch (messageChar) {
                case 'a':
                case 'A':
                    vowelA++;

                case 'e':
                case 'E':
                    vowelE++;

                case 'i':
                case 'I':
                    vowelE++;

                case 'o':
                case 'O':
                    vowelO++;
            }
        }
        return "\nNo. of vowels: " + (vowelA + vowelE + vowelI + vowelO + vowelU)
                +"\na count: " + vowelA
                +"\ne count: " + vowelE
                +"\ni count: " + vowelI
                +"\no count: " + vowelO
                +"\nu count: " + vowelU
                +"\nExpresion length: "+message.length();
    }


}
