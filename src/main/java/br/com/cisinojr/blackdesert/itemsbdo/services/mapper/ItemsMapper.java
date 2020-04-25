package br.com.cisinojr.blackdesert.itemsbdo.services.mapper;

import br.com.cisinojr.blackdesert.itemsbdo.domain.Items;
import br.com.cisinojr.blackdesert.itemsbdo.services.dto.ItemsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ItemsMapper extends EntityMapper<ItemsDTO, Items> {

    ItemsDTO toDto(Items items);

    default Items fromId(Long id) {
        if (id == null) {
            return null;
        }

        Items items = new Items();
        items.setId(id);

        return items;
    }

}
