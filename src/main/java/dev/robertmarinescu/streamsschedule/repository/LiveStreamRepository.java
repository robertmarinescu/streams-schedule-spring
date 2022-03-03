package dev.robertmarinescu.streamsschedule.repository;

import dev.robertmarinescu.streamsschedule.model.LiveStream;
import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class LiveStreamRepository {

    List <LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository() {
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                "Spring Boot description lorem ipsum",
                "https://www.google.com",
                LocalDateTime.of(2022,3, 3, 18, 43),
                LocalDateTime.of(2022,3,3,19,0)
        ));
    }

    public List<LiveStream> findAll(){
        return streams;
    }

    public LiveStream findById(String id){
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse(null);
    }

    public LiveStream create(LiveStream stream){
        streams.add(stream);
        return stream;
    }

    public void update(LiveStream stream, String id){
        LiveStream existing = streams.stream().filter(s -> s.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Stream not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }

    public void delete(String id){
        streams.removeIf(streams -> streams.id().equals(id));
    }
}
