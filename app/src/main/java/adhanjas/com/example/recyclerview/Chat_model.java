package adhanjas.com.example.recyclerview;

public class Chat_model {
    private int image;
    private String text,message;

    public Chat_model(int image, String text, String message) {
        this.image = image;
        this.text = text;
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String
    toString() {
        return "Chat_model{" +
                "image=" + image +
                ", text='" + text + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
