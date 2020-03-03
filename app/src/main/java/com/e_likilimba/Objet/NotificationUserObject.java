package com.e_likilimba.Objet;

public class NotificationUserObject {
    private String titreDeNotification;
    private String messageNotification;
    private String typeNotification;

    public NotificationUserObject(String titreDeNotification, String messageNotification, String typeNotification) {
        this.titreDeNotification = titreDeNotification;
        this.messageNotification = messageNotification;
        this.typeNotification = typeNotification;
    }

    public String getTitreDeNotification() {
        return titreDeNotification;
    }

    public void setTitreDeNotification(String titreDeNotification) {
        this.titreDeNotification = titreDeNotification;
    }

    public String getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(String messageNotification) {
        this.messageNotification = messageNotification;
    }

    public String getTypeNotification() {
        return typeNotification;
    }

    public void setTypeNotification(String typeNotification) {
        this.typeNotification = typeNotification;
    }
}
