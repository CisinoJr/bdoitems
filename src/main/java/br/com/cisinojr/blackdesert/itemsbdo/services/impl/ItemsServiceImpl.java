package br.com.cisinojr.blackdesert.itemsbdo.services.impl;

import br.com.cisinojr.blackdesert.itemsbdo.domain.Items;
import br.com.cisinojr.blackdesert.itemsbdo.repository.ItemsRepository;
import br.com.cisinojr.blackdesert.itemsbdo.services.ItemsService;
import br.com.cisinojr.blackdesert.itemsbdo.services.dto.GenericResponseDTO;
import br.com.cisinojr.blackdesert.itemsbdo.services.dto.ItemsDTO;
import br.com.cisinojr.blackdesert.itemsbdo.services.mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;

@Service
public class ItemsServiceImpl implements ItemsService {

    private final ItemsRepository itemsRepository;
    private final ItemsMapper itemsMapper;

    @Autowired
    public ItemsServiceImpl(ItemsRepository itemsRepository, ItemsMapper itemsMapper) {
        this.itemsRepository = itemsRepository;
        this.itemsMapper = itemsMapper;
    }

    @Override
    public GenericResponseDTO findByName(String name) throws ValidationException {

        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name must be informed.");
        }

        Items items = itemsRepository.findByNameContainingIgnoreCase(name);
        ItemsDTO itemsDTO = itemsMapper.toDto(items);

        return new GenericResponseDTO(200, "foda-se", itemsDTO);
    }

}
