package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService() {
    }
    public static ShopService getInstance() {
        return singleton;
    }


}
