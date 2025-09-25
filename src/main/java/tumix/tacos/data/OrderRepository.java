package tumix.tacos.data;

import org.springframework.data.repository.CrudRepository;

import tumix.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    // TacoOrder save(TacoOrder order);
}
