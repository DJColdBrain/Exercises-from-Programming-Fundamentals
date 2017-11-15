package onlineRadioDatabase.exceptions;

public class InvalidArtistNameException extends InvalidSongException {

    public InvalidArtistNameException() {
        super(ExceptionConstants.INVALID_ARTIST_NAME);
    }
}
