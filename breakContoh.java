public class breakContoh {
    public static void main(String[] args) {
        var counter = 1;

        while (true) { 
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 100) {
                break;
            }
        } System.out.println("perulangan berhenti");
    }
}
