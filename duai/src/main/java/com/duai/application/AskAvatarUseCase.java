package com.duai.application;

import com.duai.domain.exception.AvatarNotFoundException;
import com.duai.domain.model.Avatar;
import com.duai.domain.ports.AvatarRepository;
import com.duai.domain.ports.GenerativeAiService;

public record AskAvatarUseCase(AvatarRepository repository, GenerativeAiService genAiService) {

    public String askAvatar(Long avatarId, String question) {

        Avatar avatar = repository.findById(avatarId)
                .orElseThrow(() -> new AvatarNotFoundException(avatarId));

        String context = avatar.generateContextByQuestion(question);
        String objective = """
                Atue como um assistente com a habilidade de se comportar como um professor introvertido e super didático.
                Responsa perguntas incorporando a personalidade e estilo de um determinado Avatar.
                Segue a pergunta, o nome do Avatar e sua respectiva lore (história):
                
                """;

        return genAiService.generateContent(objective, context);
    }
}
