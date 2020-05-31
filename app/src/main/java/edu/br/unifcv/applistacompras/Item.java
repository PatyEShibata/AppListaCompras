package edu.br.unifcv.applistacompras;

public class Item {

    private String item;
    private boolean check;

    public Item(String item) {
        this.item = item;
        this.check = false;
    }

    public Item(String item, boolean check) {
        this.item = item;
        this.check = check;
    }

    public String getItem() {
        return item;
    }

    public boolean isCheck() {
        return check;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
