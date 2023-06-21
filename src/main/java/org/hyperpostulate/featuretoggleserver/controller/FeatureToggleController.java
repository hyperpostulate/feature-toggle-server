package org.hyperpostulate.featuretoggleserver.controller;

import org.hyperpostulate.featuretoggleserver.model.response.FeatureToggleResponse;
import org.hyperpostulate.featuretoggleserver.service.FeatureToggleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureToggleController {

    private final FeatureToggleService featureToggleService;

    public FeatureToggleController(FeatureToggleService featureToggleService) {
        this.featureToggleService = featureToggleService;
    }

    @GetMapping("/feature/{id}")
    public ResponseEntity<FeatureToggleResponse> getFeatureToggle(@PathVariable("id") String id) {
        FeatureToggleResponse response = featureToggleService.getFeatureToggle(id);

        if (null == response) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

    }
}
