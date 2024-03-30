package com.duai.duai.adapters.in;

import com.duai.duai.application.AskAvatarUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avatar")
public record AskAvatarRestController(AskAvatarUseCase useCase) {

    @PostMapping("/{avatarId}/ask")
    public AskAvatarResponse askAvatar(@PathVariable Long id, @RequestBody AskAvatarRequest request){
        String answer = useCase().askAvatar(id, request.question());
        return new AskAvatarResponse(answer);
    }

    public record AskAvatarRequest(String question){}
    public record AskAvatarResponse(String answer){}
}
