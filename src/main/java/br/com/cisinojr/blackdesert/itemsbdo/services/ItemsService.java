package br.com.cisinojr.blackdesert.itemsbdo.services;

import br.com.cisinojr.blackdesert.itemsbdo.services.dto.GenericResponseDTO;

import javax.validation.ValidationException;

public interface ItemsService {

    GenericResponseDTO findByName(String name) throws ValidationException;

}
