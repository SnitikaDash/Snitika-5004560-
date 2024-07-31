package proxy;

public class RealImage implements Image {

	private String imagePath;

    public RealImage(String imagePath) {
        this.imagePath = imagePath;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + imagePath);
        // Simulate a time-consuming operation (e.g., network call)
        try {
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imagePath);
    }

}
