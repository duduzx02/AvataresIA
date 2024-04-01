package com.duai.adapters.in;

import com.duai.application.ListAvatarUseCase;
import com.duai.domain.model.Avatar;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Avatares", description = "Endpoints")
@RestController
@RequestMapping("/avatares")
public record ListAvatarRestContorller(ListAvatarUseCase useCase) {


    @GetMapping
    public List<Avatar> findAllAvatares(){
        return useCase.findAll();
    }
}
