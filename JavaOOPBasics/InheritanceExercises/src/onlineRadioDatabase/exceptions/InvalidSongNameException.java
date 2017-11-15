package onlineRadioDatabase.exceptions;


public class InvalidSongNameException extends InvalidSongException {

    public InvalidSongNameException() {
        super(ExceptionConstants.INVALID_SONG_NAME);
    }
}

