
package service;

import entity.VonDauTu;
import entity.DoanhThu;
import entity.ChiPhi;
import entity.SoLieuDoanhThu;
import entity.SoLieuChiPhi;
import java.util.ArrayList;
import java.time.LocalDate;
import entity.SoBoDuAn;
import entity.ChiTietDuAn;
import java.util.List;
import java.io.Serializable;
import entity.TongDuAn;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TongDuAnRepository;
import org.springframework.stereotype.Service;

@Service
public class TongDuAnService
{
    @Autowired
    TongDuAnRepository tongDuAnRepository;
    @Autowired
    ChiTietDuAnService chiTietDuAnService;
    @Autowired
    DoanhThuService doanhThuService;
    @Autowired
    ChiPhiService chiPhiService;
    @Autowired
    VonDauTuService vonDauTuService;
    @Autowired
    SoLieuChiPhiService soLieuChiPhiService;
    @Autowired
    SoLieuDoanhThuService soLieuDoanhThuService;
    
    public TongDuAn getDuAnById(final int id) {
        final List<ChiTietDuAn> listChiTietDuAn = this.chiTietDuAnService.getChiTietDuAnByIdDuAn(id);
        final TongDuAn duan = (TongDuAn)this.tongDuAnRepository.findOne(id);
        duan.setListChiTietDuAn(listChiTietDuAn);
        return duan;
    }
    
    public TongDuAn saveSoBoDuAn(final SoBoDuAn soBoDuAn) {
        final VonDauTu vonDauTu = soBoDuAn.getVonDauTu();
        TongDuAn duAn = new TongDuAn(soBoDuAn.getTenDuAn(), LocalDate.now(), vonDauTu);
        duAn = (TongDuAn)this.tongDuAnRepository.save(duAn);
        final List<ChiTietDuAn> listChiTiet = new ArrayList<ChiTietDuAn>();
        for (int i = 1; i <= soBoDuAn.getSoNamThamDinh(); ++i) {
            SoLieuChiPhi soLieuChiPhi = new SoLieuChiPhi();
            soLieuChiPhi = soBoDuAn.getSoLieuChiPhi();
            SoLieuDoanhThu soLieuDoanhThu = new SoLieuDoanhThu();
            soLieuDoanhThu = soBoDuAn.getSoLieuDoanhThu();
            final ChiPhi chiPhi = new ChiPhi();
            final DoanhThu doanhThu = new DoanhThu();
            chiPhi.setSoLieuChiPhi(soLieuChiPhi);
            doanhThu.setSoLieuDoanhThu(soLieuDoanhThu);
            final ChiTietDuAn chiTietDuAn = new ChiTietDuAn();
            chiTietDuAn.setNam(i);
            chiTietDuAn.setTongDuAn(duAn);
            chiTietDuAn.setChiPhi(chiPhi);
            chiTietDuAn.setDoanhThu(doanhThu);
            listChiTiet.add(chiTietDuAn);
        }
        this.chiTietDuAnService.saveListChiTietSoBoDuAn(listChiTiet);
        return duAn;
    }
    
    public TongDuAn saveDuAn(TongDuAn duAn) {
        duAn.setNgayThanhlap(LocalDate.now());
        duAn.setChietKhau(duAn.getVonDauTu().getChietKhau());
        duAn = (TongDuAn)this.tongDuAnRepository.save(duAn);
        this.chiTietDuAnService.saveListChiTietDuAn(duAn.getListChiTietDuAn(), duAn.getId());
        return duAn;
    }
}