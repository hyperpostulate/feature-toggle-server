package org.hyperpostulate.featuretoggleserver.service.impl;

import org.hyperpostulate.featuretoggleserver.model.response.FeatureToggleResponse;
import org.hyperpostulate.featuretoggleserver.service.FeatureToggleService;
import org.springframework.stereotype.Service;

@Service
public class FeatureToggleServiceImpl implements FeatureToggleService {
    @Override
    public FeatureToggleResponse getFeatureToggle(String id) {
        //TODO: implement feature toggle storage and get logic.

        return FeatureToggleResponse
                .builder()
                .id(id)
                .initialState(true)
                .state(true)
                .build();
    }

    @Override
    public FeatureToggleResponse setFeatureToggle(String id, Boolean initialState) {
        //TODO: implement feature toggle set logic.

        return FeatureToggleResponse
                .builder()
                .id(id)
                .initialState(true)
                .state(true)
                .build();
    }

    @Override
    public FeatureToggleResponse resetFeatureToggleToInitialState(String id) {
        //TODO: implement feature toggle storage and reset logic.

        return FeatureToggleResponse
                .builder()
                .id(id)
                .initialState(true)
                .state(true)
                .build();
    }
}
