package io.github.deliveryservice.deliveryservice.application.request;

public record DeliveryRequest(
        String orderId,
        String trackingNumber,
        String carrierKey,
        String recipientName,
        String recipientPhone,
        String address
) {
}
