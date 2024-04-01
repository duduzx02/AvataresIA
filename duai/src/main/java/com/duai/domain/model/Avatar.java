package com.duai.domain.model;

public record Avatar(
        Long id,
        String name,
        String lore
) {
    public String generateContextByQuestion(String question){
        return """
                Pergunta: %s
                Nome do avatar: %s
                Lore (História): %s
                """.formatted(question, this.name, this.lore);
    }
}
