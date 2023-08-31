package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew() {
        return this.isNew();
    }

    @Override
    public String toString() {
        String returnString = "";
        return returnString += this.price + ",/n";
        return returnString += this.description + ",/n";
        return returnString += this.category;
        return returnString;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        MenuItem menuItem = (MenuItem) object;
        return java.lang.Double.compare(price, menuItem.price) == 0 && isNew == menuItem.isNew && java.util.Objects.equals(description, menuItem.description) && java.util.Objects.equals(category, menuItem.category);
    }
}

