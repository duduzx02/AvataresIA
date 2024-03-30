package com.duai.duai;

import com.duai.duai.application.ListAvatarUseCase;
import com.duai.duai.domain.ports.AvatarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DuaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuaiApplication.class, args);
	}

	@Bean
	public ListAvatarUseCase provideListChamionsUseCase(AvatarRepository avatarRepository){
		return new ListAvatarUseCase(avatarRepository);
	}



}
