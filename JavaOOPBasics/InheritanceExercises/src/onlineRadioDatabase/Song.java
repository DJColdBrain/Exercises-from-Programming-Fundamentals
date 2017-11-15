package onlineRadioDatabase;

import onlineRadioDatabase.exceptions.*;

public class Song  {
    private String author;
    private String songName;
    private int minutes;
    private int seconds;

    public Song(String author, String songName, String time) throws InvalidSongException {
        setAuthor(author);
        setSongName(songName);
        try {
            setMinutes(Integer.parseInt(time.split(":")[0]));
            setSeconds(Integer.parseInt(time.split(":")[1]));
        }catch (Exception e){
            throw new InvalidSongLenghtException();
        }
        validateSongLenght();
    }

    private void setAuthor(String author) throws InvalidArtistNameException {
        if (author.length() < 3 || author.length() > 20){
            throw new InvalidArtistNameException();
        }
        this.author = author;
    }

    private void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 20){
            throw new InvalidSongNameException();
        }
        this.songName = songName;
    }

    private void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < 0 || minutes > 14){
            throw new InvalidSongMinutesException();
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds < 0 || seconds > 59){
            throw new InvalidSongSecondsException();
        }
        this.seconds = seconds;

    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private void validateSongLenght() throws InvalidSongLenghtException {
        if (this.minutes + this.seconds <= 0){
            throw new InvalidSongLenghtException();
        }
    }
}
