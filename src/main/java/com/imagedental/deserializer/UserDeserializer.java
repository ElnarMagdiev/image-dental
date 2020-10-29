package com.imagedental.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.imagedental.entities.User;
import com.imagedental.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class UserDeserializer extends JsonDeserializer<User> {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        String username = node.textValue();
        User usr = userRepo.findByUsername(username);

        return usr;
    }
}
