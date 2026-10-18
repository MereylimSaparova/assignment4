
public class VideoConversionFacade {

    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public VideoConversionFacade() {
        codecFactory = new CodecFactory();
        bitrateReader = new BitrateReader();
        audioMixer = new AudioMixer();
    }

    public String convert(String filename, String targetFormat) {
        if (targetFormat == null) {
            throw new IllegalArgumentException("Target format is required");
        }

        targetFormat = targetFormat.toLowerCase();

        System.out.println("Starting video conversion...");

        VideoFile file = new VideoFile(filename);

        VideoCodec sourceCodec = codecFactory.extract(file);

        if (!targetFormat.equals("mp4")
                && !targetFormat.equals("avi")
                && !targetFormat.equals("mov")) {
            throw new IllegalArgumentException(
                    "Unsupported target format: " + targetFormat
            );
        }

        VideoCodec targetCodec = new VideoCodec(targetFormat);

        String videoData = bitrateReader.read(file, sourceCodec);

        String convertedData =
                bitrateReader.convert(videoData, targetCodec);

        String finalData = audioMixer.fixAudio(convertedData);

        System.out.println("Conversion completed successfully!");

        return finalData;
    }
}
