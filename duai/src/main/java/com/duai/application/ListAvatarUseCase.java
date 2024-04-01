package com.duai.application;

import com.duai.domain.model.Avatar;
import com.duai.domain.ports.AvatarRepository;

import java.util.List;

public record ListAvatarUseCase(AvatarRepository repository) {
    public List<Avatar> findAll(){
        return repository.findAll();
    }
}
