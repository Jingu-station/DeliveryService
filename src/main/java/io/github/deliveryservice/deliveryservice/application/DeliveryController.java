package io.github.deliveryservice.deliveryservice.application;

import io.github.deliveryservice.deliveryservice.application.request.DeliveryRequest;
import io.github.deliveryservice.deliveryservice.application.response.DeliveryResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/deliveries")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeliveryResponse addTrackingNumber(@Valid @RequestBody DeliveryRequest request) {
        return deliveryService.addTrackingNumber(request);

    }

}
