package com.eduardo.dsvendas.repositories;

<<<<<<< HEAD
import com.eduardo.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

=======
import com.eduardo.dsvendas.dto.SaleSucessDTO;
import com.eduardo.dsvendas.dto.SaleSumDTO;
import com.eduardo.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT NEW com.eduardo.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT NEW com.eduardo.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
>>>>>>> 9b4180bba8110e33f4bcb5d9fa9b5cf5cf548a2a
}
