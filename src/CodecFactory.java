
public class CodecFactory {

    public VideoCodec extract(VideoFile file) {
        String format = file.getFormat();

        if (!format.equals("mp4") && !format.equals("avi")
                && !format.equals("mov")) {
            throw new IllegalArgumentException(
                    "Unsupported video format: " + format
            );
        }

        System.out.println("Detected codec: " + format);
        return new VideoCodec(format);
    }
}
