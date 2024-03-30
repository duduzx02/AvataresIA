package com.duai.duai.domain.exception;

public class AvatarNotFoundException extends RuntimeException{
    public AvatarNotFoundException(Long avatarId){
        super("Avatar %d not found".formatted(avatarId));
    }
}
