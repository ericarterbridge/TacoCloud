package sia.tacocloud.Repository;

import sia.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);
}
