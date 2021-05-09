package com.eduardo.dsvendas.services;

import com.eduardo.dsvendas.dto.SaleDTO;
import com.eduardo.dsvendas.entities.Sale;
import com.eduardo.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerService sellerService;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerService.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}