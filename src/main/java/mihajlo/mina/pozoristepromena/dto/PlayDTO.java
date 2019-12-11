package mihajlo.mina.pozoristepromena.dto;

import mihajlo.mina.pozoristepromena.model.Actor;
import mihajlo.mina.pozoristepromena.model.PlayImage;

import java.util.List;

public class PlayDTO {

    Long id;
    String name;
    String descirption;
    PlayImage mainImage;
    List<PlayImage> images;
    List<Actor> actors;



    public PlayDTO(Long id, String name, String descirption, PlayImage mainImage, List<PlayImage> images, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.descirption = descirption;
        this.mainImage = mainImage;
        this.images = images;
        this.actors = actors;
    }

    public PlayDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    public PlayImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(PlayImage mainImage) {
        this.mainImage = mainImage;
    }

    public List<PlayImage> getImages() {
        return images;
    }

    public void setImages(List<PlayImage> images) {
        this.images = images;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
