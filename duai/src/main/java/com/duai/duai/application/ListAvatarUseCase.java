package com.duai.duai.application;

import com.duai.duai.domain.model.Avatar;
import com.duai.duai.domain.ports.AvatarRepository;

import java.util.List;

public record ListAvatarUseCase(AvatarRepository repository) {
    public List<Avatar> findAll(){
        return repository.findAll();
    }
}
