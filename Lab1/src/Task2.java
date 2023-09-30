public class Task2 {
    public static final char[] ALPHABET = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private int n; 

    public Task2(int shiftSteps) {
        this.n = shiftSteps;
    }

    public char encryptChar(char c) {
        if (Character.isLetter(c)) {
            char upperC = Character.toUpperCase(c);
            int index = indexOfChar(upperC);
            if (index != -1) {
                int encryptedIndex = (index + n) % 26;
                if (encryptedIndex < 0) {
                    encryptedIndex += 26;
                }
                char encryptedChar = ALPHABET[encryptedIndex];
                return Character.isLowerCase(c) ? Character.toLowerCase(encryptedChar) : encryptedChar;
            }
        }
        return c; 
    }

    public String encrypt(String input) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            encryptedText.append(encryptChar(c));
        }
        return encryptedText.toString();
    }

    public char decryptChar(char c) {
        if (Character.isLetter(c)) {
            char upperC = Character.toUpperCase(c);
            int index = indexOfChar(upperC);
            if (index != -1) {
                int decryptedIndex = (index - n) % 26;
                if (decryptedIndex < 0) {
                    decryptedIndex += 26;
                }
                char decryptedChar = ALPHABET[decryptedIndex];
                return Character.isLowerCase(c) ? Character.toLowerCase(decryptedChar) : decryptedChar;
            }
        }
        return c; 
    }

    public String decrypt(String input) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            decryptedText.append(decryptChar(c));
        }
        return decryptedText.toString();
    }

    // Helper method to find the index of a character in the ALPHABET array
    private int indexOfChar(char c) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        Task2 caesar = new Task2(3); 
        
        char originalChar = 'A';
        char encryptedChar = caesar.encryptChar(originalChar);
        char decryptedChar = caesar.decryptChar(encryptedChar);
        System.out.println("Original Char: " + originalChar);
        System.out.println("Encrypted Char: " + encryptedChar);
        System.out.println("Decrypted Char: " + decryptedChar);

   
        String originalText = "HELLO";
        String encryptedText = caesar.encrypt(originalText);
        String decryptedText = caesar.decrypt(encryptedText);
        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
