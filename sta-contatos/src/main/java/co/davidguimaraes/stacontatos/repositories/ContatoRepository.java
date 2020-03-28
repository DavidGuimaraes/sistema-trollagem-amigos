package co.davidguimaraes.stacontatos.repositories;

import co.davidguimaraes.stacontatos.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ContatoRepository extends JpaRepository<Contato, BigInteger> {
}
