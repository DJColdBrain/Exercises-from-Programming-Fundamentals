package p02_services;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService(true);
        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(notificationService);
        onlineStoreOrder.process();
    }
}
