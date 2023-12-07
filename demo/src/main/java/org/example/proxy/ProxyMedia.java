package org.example.proxy;

public class ProxyMedia implements Media{
    private Media media;

    public ProxyMedia(Media media) {
        this.media = media;
    }

    @Override
    public String getContent() {
        System.out.println("proxy control");
        return media.getContent();
    }
}
