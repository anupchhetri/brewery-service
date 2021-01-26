package com.anup.breweryservice.services;

import com.anup.breweryservice.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Kingfisher")
                .beerStyle("Strong")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Tuborg")
                .beerStyle("Medium")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // add real impl to update beer
    }

    @Override
    public void deleteByID(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
