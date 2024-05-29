// MusicPlayer.java
public interface MusicPlayer {
    void play();
    void pause();
    void next();
    void previous();
}

// Phone.java
public interface Phone {
    void call(String number);
    void answer();
    void hangUp();
}

// WebBrowser.java
public interface WebBrowser {
    void browse(String url);
}

// IPhone.java
public class IPhone {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private WebBrowser webBrowser;
    
    public IPhone(MusicPlayer musicPlayer, Phone phone, WebBrowser webBrowser) {
        this.musicPlayer = musicPlayer;
        this.phone = phone;
        this.webBrowser = webBrowser;
    }
    
    public void playMusic() {
        musicPlayer.play();
    }
    
    public void makeCall(String number) {
        phone.call(number);
    }
    
    public void browseInternet(String url) {
        webBrowser.browse(url);
    }
}
