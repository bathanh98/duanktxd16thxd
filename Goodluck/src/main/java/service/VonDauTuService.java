
package service;

import entity.VonDauTu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VonDauTuRepository;
import org.springframework.stereotype.Service;

@Service
public class VonDauTuService
{
    @Autowired
    VonDauTuRepository vonDauTuRepository;
    
    public List<VonDauTu> getListVonDauTu() {
        return (List<VonDauTu>)this.vonDauTuRepository.findAll();
    }
    
    public VonDauTu save(final VonDauTu vonDauTu) {
        return (VonDauTu)this.vonDauTuRepository.save(vonDauTu);
    }
}