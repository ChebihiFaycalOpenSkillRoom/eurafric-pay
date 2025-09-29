rootProject.name = "eurafric-pay"

include(
    "config-server",
    "eureka-server",
    "api-gateway",
    "users-service",
    "inventory-service",
    "orders-service",
    "payments-service",
    "notification-service",
    "auth-service" // optionnel (Approche A)
)
