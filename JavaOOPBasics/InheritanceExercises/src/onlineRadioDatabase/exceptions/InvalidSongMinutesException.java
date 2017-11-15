package onlineRadioDatabase.exceptions;

public class InvalidSongMinutesException extends InvalidSongException {

    public InvalidSongMinutesException() {
        super(ExceptionConstants.INVALID_SONG_MINUTES_LENGHT);
    }
}
