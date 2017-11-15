package onlineRadioDatabase.exceptions;

public class InvalidSongSecondsException extends InvalidSongException{

    public InvalidSongSecondsException(){
        super(ExceptionConstants.INVALID_SONG_SECONDS_LENGHT);
    }
}
