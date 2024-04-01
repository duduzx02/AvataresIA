package com.duai;

import com.duai.application.AskAvatarUseCase;
import com.duai.application.ListAvatarUseCase;
import com.duai.domain.ports.AvatarRepository;
import com.duai.domain.ports.GenerativeAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ListAvatarUseCase provideListAvatarUseCase(AvatarRepository avatarRepository){
        return new ListAvatarUseCase(avatarRepository);
    }

    @Bean
    public AskAvatarUseCase provideAskAvatarUseCase(AvatarRepository avatarRepository, GenerativeAiService generativeAiService){
        return new AskAvatarUseCase(avatarRepository, generativeAiService);
    }

}