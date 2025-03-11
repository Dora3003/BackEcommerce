package TechGrocery.Ecommerce.application.Mappers;

import TechGrocery.Ecommerce.application.domain.Produto;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper
public class MapperProduct {
    public static Produto toProduto(Optional<Produto> optional){
        return optional.get();
    }
}
