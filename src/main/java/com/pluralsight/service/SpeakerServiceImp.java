package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImp implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImp() {
        System.out.println("SpeakerServiceImp no args constructor");
    }

    public SpeakerServiceImp(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImp repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("We're called after the constructors*");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImp setter");
        this.repository = repository;
    }
}
