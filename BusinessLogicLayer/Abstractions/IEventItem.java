package BusinessLogicLayer.Abstractions;

import java.io.Serializable;

public interface IEventItem extends Serializable {
    public String getItemType();
    public String getItemName();
    public double getPrice();
}
