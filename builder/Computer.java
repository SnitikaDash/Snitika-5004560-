package builder;

public class Computer {
	private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean isGraphicsCardIncluded;
    private final boolean isBluetoothIncluded;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardIncluded = builder.isGraphicsCardIncluded;
        this.isBluetoothIncluded = builder.isBluetoothIncluded;
    }

    @Override
    public String toString() {
        return "Computer{" +
               "CPU='" + CPU + '\'' +
               ", RAM='" + RAM + '\'' +
               ", storage='" + storage + '\'' +
               ", isGraphicsCardIncluded=" + isGraphicsCardIncluded +
               ", isBluetoothIncluded=" + isBluetoothIncluded +
               '}';
    }
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean isGraphicsCardIncluded;
        private boolean isBluetoothIncluded;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCardIncluded(boolean isGraphicsCardIncluded) {
            this.isGraphicsCardIncluded = isGraphicsCardIncluded;
            return this;
        }

        public Builder setBluetoothIncluded(boolean isBluetoothIncluded) {
            this.isBluetoothIncluded = isBluetoothIncluded;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
