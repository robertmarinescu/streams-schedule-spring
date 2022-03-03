package dev.robertmarinescu.streamsschedule.controller;

import dev.robertmarinescu.streamsschedule.model.LiveStream;
import dev.robertmarinescu.streamsschedule.repository.LiveStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<LiveStream> findAll() {
        return null;
    }
}
