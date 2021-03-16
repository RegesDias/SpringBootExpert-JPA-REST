package github.com.RegesDias.domain.repository;

import github.com.RegesDias.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository <ItemPedido, Integer> {
}
