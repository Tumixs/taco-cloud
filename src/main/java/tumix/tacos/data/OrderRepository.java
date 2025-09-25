package tumix.tacos.data;

import tumix.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
