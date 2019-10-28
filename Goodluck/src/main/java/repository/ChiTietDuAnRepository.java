package repository;

import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.stereotype.Repository;
import entity.ChiTietDuAn;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ChiTietDuAnRepository extends CrudRepository<ChiTietDuAn, Integer>
{
    @Query(value = "select * from chitietduan where idduan= ?", nativeQuery = true)
    List<ChiTietDuAn> getDoanhThuByDuAn(final int p0);
}