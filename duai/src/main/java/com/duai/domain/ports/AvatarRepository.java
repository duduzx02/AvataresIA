package com.duai.domain.ports;

import com.duai.domain.model.Avatar;

import java.util.List;
import java.util.Optional;

public interface AvatarRepository {
    List<Avatar> findAll();

    Optional<Avatar> findById(Long id);
}
