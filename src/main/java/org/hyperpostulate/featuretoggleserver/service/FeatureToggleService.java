package org.hyperpostulate.featuretoggleserver.service;

import org.hyperpostulate.featuretoggleserver.model.response.FeatureToggleResponse;

public interface FeatureToggleService {
    FeatureToggleResponse getFeatureToggle(String id);

    FeatureToggleResponse setFeatureToggle(String id, Boolean initialState);

    FeatureToggleResponse resetFeatureToggleToInitialState(String id);
}
