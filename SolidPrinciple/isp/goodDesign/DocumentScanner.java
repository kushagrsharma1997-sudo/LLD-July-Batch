package SolidPrinciples.isp.goodDesign;

public class DocumentScanner implements Scannable {

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}
