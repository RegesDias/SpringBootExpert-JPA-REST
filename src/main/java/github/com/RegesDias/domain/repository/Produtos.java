package github.com.RegesDias.domain.repository;

import github.com.RegesDias.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository <Produto, Integer> {
}
