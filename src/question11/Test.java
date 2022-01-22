package question11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Media> media = new ArrayList<>();

        media.add(new Audio("audio", 10.2, 1));
        media.add(new Audio("audio1", 10.3, 2));
        media.add(new Audio("audio2", 10.4, 3));

        media.add(new Video("video", 11.1, "4:3"));
        media.add(new Video("video1", 11.2, "16:9"));
        media.add(new Video("video2", 11.3, "2:1"));

        writeListOfMediaTofile(media);

    }

    public static void writeListOfMediaTofile(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        for (Media media : list) {
            sb.append(media).append('\n');
        }

        try {
            PrintStream ps = new PrintStream(new File("src/question11/mediainfo.txt"));
            ps.print(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
