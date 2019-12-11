package mihajlo.mina.pozoristepromena.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Play {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String playName;
    String descirption;
    Long mainImageId;

    public Play() {
    }

    public Play(String playName, String descirption, List<PlayImage> images) {
        this.playName = playName;
        this.descirption = descirption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    public Long getMainImageId() {
        return mainImageId;
    }

    public void setMainImageId(Long mainImageId) {
        this.mainImageId = mainImageId;
    }
}
