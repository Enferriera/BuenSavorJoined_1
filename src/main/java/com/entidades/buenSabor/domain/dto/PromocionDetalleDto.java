package com.entidades.buenSabor.domain.dto;

import com.entidades.buenSabor.domain.entities.Articulo;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PromocionDetalleDto extends BaseDto{
    private int cantidad;

    private ArticuloDto articulo;
}
