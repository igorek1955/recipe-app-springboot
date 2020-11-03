package ru.springframework.services;

import ru.springframework.commands.UnitOfMeasureCommand;


import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
