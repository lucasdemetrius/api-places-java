package br.com.lucasdemetrius.place_service.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(
    @NotBlank String name, @NotBlank String state) {
    
}
