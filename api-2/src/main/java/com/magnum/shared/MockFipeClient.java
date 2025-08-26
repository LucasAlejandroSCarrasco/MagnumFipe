package com.magnum.shared;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MockFipeClient {

    public static List<Map<String, String>> getBrands() {
        return Arrays.asList(
            Map.of("id", "1", "name", "Ford"),
            Map.of("id", "2", "name", "Chevrolet")
        );
    }

    public static List<Map<String, String>> getModelsByBrand(String brandId) {
        if (brandId.equals("1")) {
            return Arrays.asList(
                Map.of("code", "FORD123", "model", "Fiesta", "observations", "Hatch"),
                Map.of("code", "FORD456", "model", "Focus", "observations", "Sedan")
            );
        } else {
            return Arrays.asList(
                Map.of("code", "CHEV123", "model", "Onix", "observations", "Hatch"),
                Map.of("code", "CHEV456", "model", "Cruze", "observations", "Sedan")
            );
        }
    }
}
