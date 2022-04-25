package org.example.h2demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Log4j2
@Service
public class GetData {

    @Autowired
    DataRepository dataRepository;

    @PostConstruct
    public void init() {
        log.info("Start");

        Optional<Data> data = dataRepository.findById(1L);

        log.info("data = '{}'", data.get());
        log.info("End.");
    }
}
