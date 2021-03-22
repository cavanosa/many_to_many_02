package com.tutorial.manytomany02.service;

import com.tutorial.manytomany02.entity.Canal;
import com.tutorial.manytomany02.entity.Suscripcion;
import com.tutorial.manytomany02.entity.Usuario;
import com.tutorial.manytomany02.repository.CanalRepository;
import com.tutorial.manytomany02.repository.SuscripcionRepository;
import com.tutorial.manytomany02.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MainService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    CanalRepository canalRepository;

    @Autowired
    SuscripcionRepository suscripcionRepository;

    public void createSub(int idUser, int idCanal){
        Usuario usuario = usuarioRepository.findById(idUser).get();
        Canal canal = canalRepository.findById(idCanal).get();
        Suscripcion suscripcion = new Suscripcion(usuario, canal);
        suscripcionRepository.save(suscripcion);
    }

    public void deleteUser(int id){
        Usuario usuario = usuarioRepository.findById(id).get();
        usuario.getSubs().stream().forEach(s -> suscripcionRepository.delete(s));
        usuarioRepository.delete(usuario);
    }

    public void deleteCanal(int id){
        Canal canal = canalRepository.findById(id).get();
        canal.getSubs().stream().forEach(s -> suscripcionRepository.delete(s));
        canalRepository.delete(canal);
    }
}
