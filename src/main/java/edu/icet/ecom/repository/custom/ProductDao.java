package edu.icet.ecom.repository.custom;

import edu.icet.ecom.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<ProductEntity,Long>{
}
