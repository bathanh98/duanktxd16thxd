package repository;

import org.springframework.stereotype.Repository;
import entity.TongDuAn;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface TongDuAnRepository extends CrudRepository<TongDuAn, Integer>
{
}
