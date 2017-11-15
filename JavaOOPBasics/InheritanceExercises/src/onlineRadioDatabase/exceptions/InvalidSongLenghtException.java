package onlineRadioDatabase.exceptions;

public class InvalidSongLenghtException extends InvalidSongException {

    public InvalidSongLenghtException(){
        super(ExceptionConstants.INVALID_SONG_LENGHT);
    }
}
