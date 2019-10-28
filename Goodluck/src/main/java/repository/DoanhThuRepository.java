package repository;

import org.springframework.stereotype.Repository;
import entity.DoanhThu;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface DoanhThuRepository extends CrudRepository<DoanhThu, Integer>
{
}