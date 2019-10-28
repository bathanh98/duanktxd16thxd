
package service;

import entity.TongDuAn;
import entity.ChiTietDuAn;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ChiTietDuAnRepository;
import org.springframework.stereotype.Service;

@Service
public class ChiTietDuAnService
{
    @Autowired
    ChiTietDuAnRepository chiTietDuAnRepository;
    
    public List<ChiTietDuAn> getChiTietDuAnByIdDuAn(final int id) {
        return this.chiTietDuAnRepository.getDoanhThuByDuAn(id);
    }
    
    public ChiTietDuAn save(final ChiTietDuAn chiTietDuAn) {
        return (ChiTietDuAn)this.chiTietDuAnRepository.save(chiTietDuAn);
    }
    
    public void saveListChiTietSoBoDuAn(final List<ChiTietDuAn> list) {
        for (final ChiTietDuAn chiTietDuAn : list) {
            this.save(chiTietDuAn);
            chiTietDuAn.getChiPhi().getSoLieuChiPhi().setId(0);
            chiTietDuAn.getDoanhThu().getSoLieuDoanhThu().setId(0);
        }
    }
    
    public void saveListChiTietDuAn(final List<ChiTietDuAn> list, final int idDuan) {
        for (final ChiTietDuAn chiTietDuAn : list) {
            chiTietDuAn.getChiPhiTrongNam();
            chiTietDuAn.setTongDuAn(new TongDuAn(idDuan));
            chiTietDuAn.getTongDoanhThuTrongNam();
            this.save(chiTietDuAn);
        }
    }
}