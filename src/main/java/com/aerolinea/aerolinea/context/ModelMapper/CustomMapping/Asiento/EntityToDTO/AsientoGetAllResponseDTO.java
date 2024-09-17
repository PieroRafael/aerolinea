package com.aerolinea.aerolinea.context.ModelMapper.CustomMapping.Asiento.EntityToDTO;

import com.aerolinea.aerolinea.dto.Asiento.Response.GetAllResponseDTO;
import com.aerolinea.aerolinea.persistence.entity.Avion.Asiento;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class AsientoGetAllResponseDTO extends PropertyMap<Asiento, GetAllResponseDTO>{

        @Override
        protected void configure() {
            map().setTpaNombre(source.getTipoAsiento().getTpaNombre());
            map().setAviRegistro(source.getAvion().getAviRegistro());
        }

}
