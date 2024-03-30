package com.duai.duai.Application;

import com.duai.duai.application.ListAvatarUseCase;
import com.duai.duai.domain.model.Avatar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListAvatarUseCaseIntegrationTest {

    @Autowired
    private ListAvatarUseCase listAvatarUseCase;

    @Test
    public void testeFindAllChampions(){
        List<Avatar> avatarList = listAvatarUseCase.findAll();

        Assertions.assertEquals(1, avatarList.size());
    }

}
