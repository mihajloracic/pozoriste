package mihajlo.mina.pozoristepromena.controller;

import mihajlo.mina.pozoristepromena.dto.PlayDTO;
import mihajlo.mina.pozoristepromena.dto.PlayForListDTO;
import mihajlo.mina.pozoristepromena.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ClientController {

    private PlayService playService;

    @Autowired
    public ClientController(PlayService playService) {
        this.playService = playService;
    }

    @GetMapping(value = "/plays/play/{playId}", produces="application/json")

    public ResponseEntity<PlayDTO> getPlayById(@PathVariable("playId") final Long playId){
        return ResponseEntity.ok().body(playService.getPlayById(playId));
    }

    @GetMapping(value = "/plays/", produces="application/json")
    public ResponseEntity<List<PlayForListDTO>> getAllPlays(){
        return ResponseEntity.ok().body(playService.getAllPlays());
    }

}
