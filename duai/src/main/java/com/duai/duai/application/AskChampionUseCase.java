package com.duai.duai.application;

import com.duai.duai.domain.exception.AvatarNotFoundException;
import com.duai.duai.domain.model.Avatar;
import com.duai.duai.domain.ports.AvatarRepository;

public record AskChampionUseCase(AvatarRepository repository) {

    public String askAvatar(Long avatarId, String question){
        Avatar avatar = repository.findById(avatarId).orElseThrow(() -> new AvatarNotFoundException(avatarId));

        String context = avatar.generateContextByQuestion(question);
        String objetive = """
                Atue como um professor com a habilidade de se comportar como um professor de Harvad entusiasmado, 
                responda perguntas incoporando a persolanidade e estido de um determiado professor.
                segue a pergunta, o nome do professor e sua respectiva lore(história):
                """;
        return genAiService.generateContent(objetive, context);
    }
}
