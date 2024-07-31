package factory;

public class ExcelDocumentImpl implements ExcelDocument 
{
	
    public void open() {
        System.out.println("Opening Excel document...");
    }

    
    public void close() {
        System.out.println("Closing Excel document...");
    }
}
