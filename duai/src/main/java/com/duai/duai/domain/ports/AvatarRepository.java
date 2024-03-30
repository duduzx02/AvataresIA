package com.duai.duai.domain.ports;

import com.duai.duai.domain.model.Avatar;

import java.util.List;
import java.util.Optional;


public interface AvatarRepository {
    List<Avatar> findAll();

    Optional<Avatar> findById();
}
