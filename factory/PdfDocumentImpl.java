package factory;

public class PdfDocumentImpl implements PdfDocument 
{
	public void open() {
        System.out.println("Opening PDF document...");
    }

    
    public void close() {
        System.out.println("Closing PDF document...");
    }
}
