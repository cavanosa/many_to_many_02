package com.tutorial.manytomany02.controller;

import com.tutorial.manytomany02.dto.SubDTO;
import com.tutorial.manytomany02.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody SubDTO dto){
        if(!mainService.existUserAndCanal(dto.getIdUser(), dto.getIdCanal()))
            return new ResponseEntity("no existe el user o el canal", HttpStatus.NOT_FOUND);
        if(mainService.existsSub(dto.getIdUser(), dto.getIdCanal()))
            return new ResponseEntity("ya estás suscrito", HttpStatus.BAD_REQUEST);
        mainService.createSub(dto.getIdUser(), dto.getIdCanal());
        return new ResponseEntity("te has suscrito", HttpStatus.OK);
    }

    @DeleteMapping("/deleteuser/{id}")
    public ResponseEntity deleteuser(@PathVariable("id") int id){
        mainService.deleteUser(id);
        return new ResponseEntity("te has borrado", HttpStatus.OK);
    }

    @DeleteMapping("/deletecanal/{id}")
    public ResponseEntity deletecanal(@PathVariable("id") int id){
        mainService.deleteCanal(id);
        return new ResponseEntity("canal borrado", HttpStatus.OK);
    }
}
