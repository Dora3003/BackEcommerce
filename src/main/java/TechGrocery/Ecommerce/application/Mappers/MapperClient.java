package TechGrocery.Ecommerce.application.Mappers;

import TechGrocery.Ecommerce.application.domain.Cliente;
import java.util.Optional;

public class MapperClient {
    public static Cliente toCliente(Optional<Cliente> clienteOptional){
        Cliente retorno = clienteOptional.get();
        return retorno;
    };
}
