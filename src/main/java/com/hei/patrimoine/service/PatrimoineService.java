package com.hei.patrimoine.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hei.patrimoine.model.Patrimoine;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Service
public class PatrimoineService {
    private final Path storagePath = Paths.get(System.getProperty("user.dir"), "patrimoines");
    private final ObjectMapper objectMapper = new ObjectMapper();

    public PatrimoineService() throws IOException {
        if (!Files.exists(storagePath)) {
            Files.createDirectories(storagePath);
        }
    }
    public Patrimoine getPatrimoine(String id) throws IOException {
        Path filePath = storagePath.resolve(id + ".json");
        if (Files.exists(filePath)) {
            return objectMapper.readValue(filePath.toFile(), Patrimoine.class);
        } else {
            return null;
        }
    }

    public void saveOrUpdatePatrimoine(String id, Patrimoine patrimoine) throws IOException {
        patrimoine.setDerniereModification(LocalDateTime.now());
        Path filePath = storagePath.resolve(id + ".json");
        objectMapper.writeValue(filePath.toFile(), patrimoine);
    }
}
