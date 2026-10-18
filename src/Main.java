
public class Main {

    public static void main(String[] args) {

        VideoConversionFacade converter =
                new VideoConversionFacade();

        try {
            System.out.println("=== VIDEO CONVERTER ===");

            String result = converter.convert(
                    "movie.avi", "mp4"
            );

            System.out.println("Result: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
