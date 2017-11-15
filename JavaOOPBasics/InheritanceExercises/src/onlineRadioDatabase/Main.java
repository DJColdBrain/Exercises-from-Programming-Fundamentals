package onlineRadioDatabase;

import onlineRadioDatabase.exceptions.InvalidArtistNameException;
import onlineRadioDatabase.exceptions.InvalidSongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split(";");
            Song song = null;
            try {
                song = new Song(data[0], data[1], data[2]);
                songList.add(song);
                System.out.println("Song added.");
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Songs added: " + songList.size());
        int seconds = songList.stream().mapToInt(Song::getSeconds).sum();
        int minutes = songList.stream().mapToInt(Song::getMinutes).sum();
        int hours = 0;

        while (seconds >= 60){
            minutes++;
            seconds-= 60;
        }

        while (minutes >= 60){
            hours++;
            minutes-= 60;
        }

        System.out.printf("Playlist length: %dh %dm %ds%n", hours, minutes, seconds);
    }
}
