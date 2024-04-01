package com.duai.domain.exception;

public class AvatarNotFoundException extends RuntimeException{
    public AvatarNotFoundException(Long avatarId){
        super("Champion %d not found.".formatted(avatarId));
    }
}
