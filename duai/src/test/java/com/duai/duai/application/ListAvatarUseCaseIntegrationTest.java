package com.duai.duai.application;

import com.duai.application.ListAvatarUseCase;
import com.duai.domain.model.Avatar;
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
    public void testeDinfAllAvatars(){
        List<Avatar> avatarList = listAvatarUseCase.findAll();


        Assertions.assertEquals(1, avatarList.size());
    }
}
