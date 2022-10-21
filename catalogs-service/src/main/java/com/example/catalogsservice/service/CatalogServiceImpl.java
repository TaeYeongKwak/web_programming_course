package com.example.catalogsservice.service;

import com.example.catalogsservice.jpa.CatalogEntity;
import com.example.catalogsservice.jpa.CatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CatalogServiceImpl implements CatalogService{

    private final CatalogRepository catalogRepository;
    private final Environment env;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
