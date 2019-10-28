package repository;

import org.springframework.stereotype.Repository;
import entity.VonDauTu;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface VonDauTuRepository extends CrudRepository<VonDauTu, Integer>
{
}