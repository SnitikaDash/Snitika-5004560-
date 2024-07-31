package builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
       
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .setGraphicsCardIncluded(true)
            .setBluetoothIncluded(true)
            .build();

        
        System.out.println(basicComputer);
        System.out.println(gamingComputer);
    }
}
