package com.duai.duai.adapters.in;

import com.duai.duai.application.ListAvatarUseCase;
import com.duai.duai.domain.model.Avatar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/avatar")
public record ListAvatarRestController(ListAvatarUseCase useCase) {
    @GetMapping
    public List<Avatar> findAllAvatar(){
        return useCase.findAll();
    }

}
