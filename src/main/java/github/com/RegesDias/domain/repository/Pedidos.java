package github.com.RegesDias.domain.repository;

import github.com.RegesDias.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository <Pedido, Integer> {
}
