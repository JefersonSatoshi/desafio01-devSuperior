package com.devsuperior.desafio01.Services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}

