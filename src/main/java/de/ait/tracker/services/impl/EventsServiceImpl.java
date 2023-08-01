package de.ait.tracker.services.impl;

import de.ait.tracker.dto.EventDto;
import de.ait.tracker.repositories.EventsRepository;
import de.ait.tracker.services.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.ait.tracker.dto.EventDto.from;

@Service
@RequiredArgsConstructor
public class EventsServiceImpl implements EventsService {
    private final EventsRepository eventsRepository;


    @Override
    public List<EventDto> getAllEvents() {
        return from(eventsRepository.findAll());
    }
}
/*
* public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;
    @Override
    public List<UserDto> getAllUsers() {
        return from(usersRepository.findAll());
    }
*
* */