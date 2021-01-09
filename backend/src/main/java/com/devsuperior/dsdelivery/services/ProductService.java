package com.devsuperior.dsdelivery.services;

import com.devsuperior.dsdelivery.dtos.ProductDTO;
import com.devsuperior.dsdelivery.entities.Product;
import com.devsuperior.dsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> list = productRepository.findAllByOrderByNameAsc();

        return list.stream().map(p -> new ProductDTO(p)).collect(Collectors.toList());
    }
}
