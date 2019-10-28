package service;

import entity.SoLieuChiPhi;
import org.springframework.beans.factory.annotation.Autowired;
import repository.SoLieuChiPhiRepository;
import org.springframework.stereotype.Service;

@Service
public class SoLieuChiPhiService
{
    @Autowired
    SoLieuChiPhiRepository soLieuChiPhiRepository;
    
    public SoLieuChiPhi save(final SoLieuChiPhi soLieuChiPhi) {
        return (SoLieuChiPhi)this.soLieuChiPhiRepository.save(soLieuChiPhi);
    }
}