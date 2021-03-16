package github.com.RegesDias;

import github.com.RegesDias.domain.entity.Cliente;
import github.com.RegesDias.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando Clientes...");
            clientes.save(new Cliente("Fernando Dias"));
            clientes.save(new Cliente("Reges Dias"));
            clientes.save(new Cliente("Carla Cristina"));

            boolean existe = clientes.existsByNome("Reges Dias");
            System.out.println("resposta " + existe);

            Cliente buscaUmCliente = clientes.findOneByNome("Reges Dias");

            List<Cliente> listaTodos = clientes.findAll();
            listaTodos.forEach(System.out::println);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
