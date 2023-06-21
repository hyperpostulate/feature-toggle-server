package org.hyperpostulate.featuretoggleserver.service.impl;

import org.hyperpostulate.featuretoggleserver.model.response.FeatureToggleResponse;
import org.hyperpostulate.featuretoggleserver.service.FeatureToggleService;
import org.springframework.stereotype.Service;

@Service
public class FeatureToggleServiceImpl implements FeatureToggleService {
    @Override
    public FeatureToggleResponse getFeatureToggle(String id) {
        //TODO: implement feature toggle storage.

        return new FeatureToggleResponse().builder().toggle(true).build();
    }
}
