package repository;

import org.springframework.stereotype.Repository;
import entity.ChiPhi;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ChiPhiRepository extends CrudRepository<ChiPhi, Integer>
{
}