
public class BitrateReader {

    public String read(VideoFile file, VideoCodec codec) {
        System.out.println("Reading video: " + file.getName());
        System.out.println("Using codec: " + codec.getFormat());

        return "Video data from " + file.getName();
    }

    public String convert(String videoData, VideoCodec targetCodec) {
        System.out.println("Converting video to "
                + targetCodec.getFormat());

        return videoData + " converted to "
                + targetCodec.getFormat();
    }
}
