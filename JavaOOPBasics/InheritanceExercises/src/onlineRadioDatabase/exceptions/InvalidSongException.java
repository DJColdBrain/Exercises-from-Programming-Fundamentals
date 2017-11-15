package onlineRadioDatabase.exceptions;

public class InvalidSongException extends Throwable{

    public InvalidSongException(String message){
        super(message);
    }

    InvalidSongException(){
        super(ExceptionConstants.INVALID_SONG);
    }
}
