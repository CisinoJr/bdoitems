package br.com.cisinojr.blackdesert.itemsbdo.services;

import br.com.cisinojr.blackdesert.itemsbdo.services.dto.ItemsDTO;

import javax.validation.ValidationException;

public interface ItemsService {

    ItemsDTO findByName(String name) throws ValidationException;

}
