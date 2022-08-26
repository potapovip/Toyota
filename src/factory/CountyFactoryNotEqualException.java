package factory;

public class CountyFactoryNotEqualException extends Exception{
    public CountyFactoryNotEqualException() {
    }

    public CountyFactoryNotEqualException(String message) {
        super(message);
    }
}
