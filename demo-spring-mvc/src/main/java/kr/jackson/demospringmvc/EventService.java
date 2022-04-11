package kr.jackson.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents(){
        Event event = Event.builder()
                .name("Spring Study")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1,10, 11, 0))
                .build();

        Event event1 = Event.builder()
                .name("Second Spring Study")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,11,11,0))
                .endDateTime(LocalDateTime.of(2019,1,11,12,0))
                .build();

        return List.of(event, event1);
    }
}
