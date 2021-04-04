package IO.Logger_Bsp2;

public class ErrorMessage {
    private String errorLevel;
    private String errorMessage;
    private String errorTime;

    public ErrorMessage(String errorLevel, String errorMessage, String errorTime) throws ErrorLevelException {
        this.errorLevel = errorLevel;
        switch (errorLevel) {
            case "Fatal":
                break;
            case "Error":
                break;
            case "Info":
                break;
            case "Debug":
                break;
            default:
                throw new ErrorLevelException("Only Fatal, Error, Info or Debug possible");

        }

        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public String toLine() {
        return errorTime + ":" + errorLevel + "-" + errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorLevel='" + errorLevel + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorTime='" + errorTime + '\'' +
                '}';
    }
}

