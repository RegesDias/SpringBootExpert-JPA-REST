package github.com.RegesDias.domain.repository;

import github.com.RegesDias.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Clientes extends JpaRepository <Cliente, Integer>{

    @Query(value = "SELECT c FROM Cliente c WHERE c.nome LIKE %:nome%")
    List<Cliente> findByNomeLike(@Param("nome") String nome);

    boolean existsByNome(String nome);

    Cliente findOneByNome(String nome);
}
