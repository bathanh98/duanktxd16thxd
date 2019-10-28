package service;

import entity.ChiPhi;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ChiPhiRepository;
import org.springframework.stereotype.Service;

@Service
public class ChiPhiService
{
    @Autowired
    ChiPhiRepository chiPhiRepository;
    
    public ChiPhi save(final ChiPhi chiPhi) {
        return (ChiPhi)this.chiPhiRepository.save(chiPhi);
    }
}