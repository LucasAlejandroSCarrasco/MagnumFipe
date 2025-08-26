package com.magnum.api2.consumer;

import javax.enterprise.context.ApplicationScoped;
import com.magnum.shared.MockFipeClient;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class BrandConsumer {

    public void consume(String brandJson) {
        List<Map<String,String>> models = MockFipeClient.getModelsByBrand("1");
        System.out.println("Persistindo modelos mock: " + models);
    }
}
