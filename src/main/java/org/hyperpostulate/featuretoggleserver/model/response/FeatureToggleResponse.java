package org.hyperpostulate.featuretoggleserver.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeatureToggleResponse {
    private Boolean toggle;
}
