
package service;

import entity.SoLieuDoanhThu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SoLieuDoanhThuRepository;

@Service
public class SoLieuDoanhThuService
{
    @Autowired
    SoLieuDoanhThuRepository soLieuDoanhThuRepository;
    
    public List<SoLieuDoanhThu> getDoanhThuByDuAn(final int idDuAn) {
        return (List<SoLieuDoanhThu>)this.soLieuDoanhThuRepository.findOne(idDuAn);
    }
    
    public SoLieuDoanhThu save(final SoLieuDoanhThu soLieuDoanhThu) {
        return (SoLieuDoanhThu)this.soLieuDoanhThuRepository.save(soLieuDoanhThu);
    }
}

