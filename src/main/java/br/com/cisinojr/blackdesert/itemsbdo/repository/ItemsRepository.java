package br.com.cisinojr.blackdesert.itemsbdo.repository;

import br.com.cisinojr.blackdesert.itemsbdo.domain.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {


    Items findByNameContainingIgnoreCase(String name);

}
