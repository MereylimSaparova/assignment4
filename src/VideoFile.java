
public class VideoFile {
    private final String name;
    private final String format;

    public VideoFile(String name) {
        if (name == null || !name.contains(".")) {
            throw new IllegalArgumentException("Invalid video filename");
        }

        this.name = name;
        this.format = name.substring(name.lastIndexOf('.') + 1).toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }
}
