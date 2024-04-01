package com.duai.adapters.in;

import com.duai.application.AskAvatarUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Avatares", description = "")
@RestController
@RequestMapping("/avatares")
public record AskAvatarRestController(AskAvatarUseCase useCase) {

    @PostMapping("/{avatarId}/ask")
    public AskAvatarResponse askAvatar(@PathVariable Long avatarId, @RequestBody AskAvatarRequest request){
        String answer = useCase.askAvatar(avatarId, request.question());
        return new AskAvatarResponse(answer);
    }


    public record AskAvatarRequest(String question){}
    public record AskAvatarResponse(String answer){}
}
