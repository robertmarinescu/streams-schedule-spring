package dev.robertmarinescu.streamsschedule.repository;

import dev.robertmarinescu.streamsschedule.model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamRepository {

    @GetMapping
    public List<LiveStream> findAll() {
        return null;
    }
}
