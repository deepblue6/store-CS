import javax.sound.sampled.*;

public class PlayMusic {

  public static void playMusic() {
    try {
      // Specify the file path to your audio file
      String filePath = "fiesta.mp3";

      // Open the audio file
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
          PlayMusic.class.getResourceAsStream(filePath));

      // Get the format of the audio file
      AudioFormat sourceFormat = audioInputStream.getFormat();

      // Choose a supported audio format
      AudioFormat targetFormat = getSupportedAudioFormat(sourceFormat);

      // Create a data line for audio output
      DataLine.Info info = new DataLine.Info(SourceDataLine.class, targetFormat);

      if (!AudioSystem.isLineSupported(info)) {
        System.out.println("Line not supported");
        return;
      }

      // Open the data line and start playing
      SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
      line.open(targetFormat);
      line.start();

      // Read and play the audio file
      int bytesRead;
      byte[] audioBuffer = new byte[4096];
      while ((bytesRead = audioInputStream.read(audioBuffer, 0, audioBuffer.length)) != -1) {
        line.write(audioBuffer, 0, bytesRead);
      }

      // Close the line and release resources
      line.drain();
      line.close();
      audioInputStream.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static AudioFormat getSupportedAudioFormat(AudioFormat sourceFormat) {
    AudioFormat.Encoding[] targetEncodings = {
        AudioFormat.Encoding.PCM_SIGNED,
        AudioFormat.Encoding.PCM_UNSIGNED
    };

    float[] sampleRates = {
        44100.0f,
        22050.0f,
        11025.0f,
        8000.0f
    };

    int[] sampleSizesInBits = { 16, 8 };
    int[] channels = { 2, 1 };
    boolean[] bigEndians = { true, false };

    for (AudioFormat.Encoding encoding : targetEncodings) {
      for (float sampleRate : sampleRates) {
        for (int sampleSize : sampleSizesInBits) {
          for (int channel : channels) {
            for (boolean bigEndian : bigEndians) {
              AudioFormat targetFormat = new AudioFormat(encoding, sampleRate, sampleSize, channel,
                  sampleSize / 8 * channel, sampleRate, bigEndian);
              if (AudioSystem.isConversionSupported(targetFormat, sourceFormat)) {
                return targetFormat;
              }
            }
          }
        }
      }
    }

    throw new RuntimeException("No supported audio format found");
  }
}
