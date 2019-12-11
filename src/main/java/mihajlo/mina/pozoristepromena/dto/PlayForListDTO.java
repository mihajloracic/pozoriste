package mihajlo.mina.pozoristepromena.dto;

import mihajlo.mina.pozoristepromena.model.PlayImage;

public class PlayForListDTO {

    Long id;
    String name;
    String descirption;
    PlayImage mainImage;

    public PlayForListDTO() {
    }

    public PlayForListDTO(Long id, String name, String descirption, PlayImage mainImage) {
        this.id = id;
        this.name = name;
        this.descirption = descirption;
        this.mainImage = mainImage;
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
}
