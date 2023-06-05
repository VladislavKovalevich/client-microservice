package com.vlad.elibrary.clientmicroservice.controller;

import com.vlad.elibrary.clientmicroservice.controller.generated.ClientApi;
import com.vlad.elibrary.clientmicroservice.model.dto.generated.ClientInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientInfoController implements ClientApi {

    @Override
    public ResponseEntity<ClientInfoDto> infoById() {
        return ResponseEntity.ok(new ClientInfoDto());
    }
}
