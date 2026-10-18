
# Assignment 4 — Facade Design Pattern

## Project: Video Conversion Facade

**Course:** Software Design Patterns  
**Language:** Java  
**Design Pattern:** Facade (Structural Pattern)

## 1. Project Description

This project demonstrates the Facade Design Pattern using a simulated video conversion system.

The system contains several subsystem classes responsible for video format detection, video processing, and audio processing.

The VideoConversionFacade provides a simple interface that allows the client to perform video conversion without interacting directly with subsystem classes.

## 2. Project Structure

```text
assignment/
├── src/
│   ├── Main.java
│   ├── VideoConversionFacade.java
│   ├── VideoFile.java
│   ├── VideoCodec.java
│   ├── CodecFactory.java
│   ├── BitrateReader.java
│   └── AudioMixer.java
├── README.md
└── .gitignore
```

## 3. Class Responsibilities

- **Main:** Client that interacts only with the Facade.
- **VideoConversionFacade:** Coordinates the conversion process.
- **VideoFile:** Stores video filename and format information.
- **VideoCodec:** Represents a video codec.
- **CodecFactory:** Detects supported video formats.
- **BitrateReader:** Simulates reading and converting video data.
- **AudioMixer:** Simulates audio processing.

## 4. How the Facade Works

The client calls one method:

```java
VideoConversionFacade converter = new VideoConversionFacade();
String result = converter.convert("movie.avi", "mp4");
```

The Facade coordinates the following operations:

1. Validates the input video file.
2. Detects the source codec.
3. Validates the target format.
4. Reads the video data.
5. Simulates video conversion.
6. Processes audio.
7. Returns the result.

## 5. Clean Code Principles

### Meaningful Names
Classes and methods have descriptive names such as VideoConversionFacade, CodecFactory, and convert().

### Single Responsibility Principle
Each subsystem class has a focused responsibility. The Facade coordinates operations instead of implementing every processing step itself.

### Encapsulation
Internal subsystem objects are private fields of the Facade.

### Simplified Interface
The client uses only the convert() method without accessing the subsystem directly.

### Error Handling
Invalid filenames and unsupported formats are handled using IllegalArgumentException.

## 6. How to Run

1. Open the project in IntelliJ IDEA.
2. Configure JDK 17.
3. Open Main.java.
4. Run the main() method.
5. Check the console output.

## 7. Example Output

```text
=== VIDEO CONVERTER ===
Starting video conversion...
Detected codec: avi
Reading video: movie.avi
Using codec: avi
Converting video to mp4
Processing audio...
Conversion completed successfully!
Result: Video data from movie.avi converted to mp4 with improved audio
```

## 8. Benefits of the Facade Pattern

- Simplifies client interaction.
- Reduces coupling between the client and subsystems.
- Improves code readability.
- Makes the system easier to maintain.
- Hides the complexity of subsystem coordination.

## 9. Conclusion

The Video Conversion Facade demonstrates how a single interface can simplify interaction with multiple subsystem classes.

The client interacts only with VideoConversionFacade, while the subsystem classes remain independently usable.

**Note:** This project simulates video conversion and does not modify actual video files.
