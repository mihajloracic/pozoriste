package mihajlo.mina.pozoristepromena.service;

import mihajlo.mina.pozoristepromena.dto.PlayDTO;
import mihajlo.mina.pozoristepromena.dto.PlayForListDTO;
import mihajlo.mina.pozoristepromena.model.Play;
import mihajlo.mina.pozoristepromena.repository.PlayImageRepository;
import mihajlo.mina.pozoristepromena.repository.PlayRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PlayService {

    PlayRepository playRepository;
    ModelMapper mapper;
    PlayImageRepository playImageRepository;

    @Autowired
    public PlayService(PlayRepository playRepository, ModelMapper mapper, PlayImageRepository playImageRepository) {
        this.playRepository = playRepository;
        this.mapper = mapper;
        this.playImageRepository = playImageRepository;
    }

    public PlayDTO getPlayById(final Long playId){
        Play play = playRepository.findById(playId).get();
        PlayDTO dto = new PlayDTO();
        dto.setId(play.getId());
        dto.setDescirption(play.getDescirption());
        dto.setName(play.getPlayName());
        dto.setImages(playImageRepository.getByPlayId(playId));
        playImageRepository.findById(play.getMainImageId()).ifPresent(playImage -> dto.setMainImage(playImage));
        return dto;
    }

    public List<PlayForListDTO> getAllPlays(){
        List<PlayForListDTO> plays = new LinkedList<>();
        for(Play play: playRepository.findAll()) {
            PlayForListDTO dto = new PlayForListDTO();
            dto.setId(play.getId());
            dto.setDescirption(play.getDescirption());
            dto.setName(play.getPlayName());
            playImageRepository.findById(play.getMainImageId()).ifPresent(playImage -> dto.setMainImage(playImage));
            plays.add(dto);
        }
        return plays;
    }

}
