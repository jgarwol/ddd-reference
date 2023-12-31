package com.jgarwol.dddreference;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpHeaders.ACCEPT;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.jgarwol.dddreference.interfaces.rest.MakeDto;
import com.jgarwol.dddreference.interfaces.rest.ModelDto;
import com.jgarwol.dddreference.interfaces.rest.ModelListResponseDto;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DddReferenceApplicationSystemTests {

  @Autowired
  private WebTestClient webTestClient;

  @Test
  void shouldReturnAllModels() {
    this.webTestClient
        .get()
        .uri("/api/models")
        .header(ACCEPT, APPLICATION_JSON_VALUE)
        .exchange()
        .expectStatus()
        .is2xxSuccessful()
        .expectHeader()
        .contentType(APPLICATION_JSON)
        .expectBody(ModelListResponseDto.class)
        .consumeWith(result -> {
          assertThat(result.getResponseBody()).isNotNull();
          assertThat(result.getResponseBody().getList())
              .containsAll(List.of(
                      new ModelDto(new MakeDto("Porsche"), "911 Turbo"),
                      new ModelDto(new MakeDto("Porsche"), "Cayenne"),
                      new ModelDto(new MakeDto("Nissan"), "GT-R"),
                      new ModelDto(new MakeDto("Nissan"), "370Z"),
                      new ModelDto(new MakeDto("Ford"), "Mustang")
                  )
              );
        });
  }
}
