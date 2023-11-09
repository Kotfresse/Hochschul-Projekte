public class MathPlotter{
    public static void main(String[] args) {
        String function = MyIO.promptAndRead( "Enter a function: ");
        String[] functionParts = {"sin","cos","tan","log","exp","sqrt","square","cube","quad","tower"};
        while (true) {
            for (int i = 0; i < functionParts.length; i++) {
                if (function.contains(functionParts[i])) {
                    break;
                }
            }
        }
        
    }
}