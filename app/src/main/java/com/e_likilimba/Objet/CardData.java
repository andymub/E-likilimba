package com.e_likilimba.Objet;

public class CardData {

    String name,DateValidity,Typeaccount,Id,Amount;

    public CardData(String name, String dateValidity, String typeaccount, String id, String amount) {
        this.name = name;
        this.DateValidity = dateValidity;
        this.Typeaccount = typeaccount;
        this.Id = id;
        this.Amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateValidity() {
        return DateValidity;
    }

    public void setDateValidity(String dateValidity) {
        DateValidity = dateValidity;
    }

    public String getTypeaccount() {
        return Typeaccount;
    }

    public void setTypeaccount(String typeaccount) {
        Typeaccount = typeaccount;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
